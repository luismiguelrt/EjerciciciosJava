// Luis Miguel Rubio Toledo


/*
 * 1.    Implementa una función hash que calcule un resumen de un texto sumando
 *  el código ASCII de cada uno de sus caracteres.
 *  Ejemplo: Texto hola à salida: 420 (104(h)+111(o)+1088(l)+97(a))
 *  Char a=’x’; int codigoAscii=(int) a;
 *  String auxiliar=”hola”; 
 *  char a0=auxiliar.charAt(0); 
 *  char []cars=auxiliar.toCharArray();
 *  No se pedirá nada por pantalla, los textos que se deben ‘resumir’ 
 *  se le pasarán como argumentos al programa.
 *  Ejemplo: MiEjercicioHash hola holb
 *  Salida: hola: 420 holb: 421
 */
package ejerciciosCifrado;


public class usoHash {
	public static void main(String[] args) {
		
		if(args.length>0) {
			
			int[] total = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				String caden = args[i];
				total[i] = total(caden);
				System.out.println(args[i] + ": " + total[i]);
			}
			
		}
		/*
		String texto = "hola";
		char[] cars = spliter(texto);
		int[] numCaracteres = spliter(cars);
		int total = total(numCaracteres);
		
		
		System.out.println(Arrays.toString(cars));
		System.out.println(Arrays.toString(numCaracteres));
		System.out.println(texto + ": " + total);
		
		char[] cars1=texto.toCharArray();
		System.out.println(cars1);
		*/

	}
/*
	static char[] spliter (String texto) {
		char[] aux = new char[texto.length()];
		for (int i = 0; i < texto.length(); i++) {
			aux[i] = texto.charAt(i);
		}
		return aux;
	}
	
	static int[] spliter (char[] texto) {
		int[] aux = new int[texto.length];
		for (int i = 0; i < texto.length; i++) {
			aux[i] = (int) texto[i];
		}
		return aux;
	}
	
*/
	static int total (char[] texto) {
		int aux = 0;
		for (int i = 0; i < texto.length; i++) {
			aux += (int) texto[i];
		}
		return aux;
	}
	static int total (String texto) {
		int aux = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			aux += texto.charAt(i);
		}
		return aux;
	}
}
