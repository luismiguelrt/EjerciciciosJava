// Luis Miguel Rubio Toledo


/*
 * 2.    Implementa el cifrado C��sar que consiste en desplazar cada car��cter seg��n el n��mero indicado. 
 * Ejemplo: texto hola, desplazamiento 20, salida |����u
 * Ejemplo: texto |����u, desplazamiento -20, salida hola
 * Por argumentos del programa se le pasar�� primero el desplazamiento y luego el texto a cifrar.
 * Ejemplo: MiEjercicioCesar 20 hola
 * Salida: |����u
 */
package ejerciciosCifrado;




public class ejercicioCifrado {
	public static void main(String[] args) {

		/*
		* 3. Implementa una función en Java que cifre usando una máscara
		* sobre el texto ambos recibios por parámetro, usando la operación XOR.
		* Ejemplo: Texto: “HOLA ES UNA PUEBA” máscara: “ab”Resultado “)--#A'2B4, B104'##”
		* H --> a = )
		* O --> b = -
		* L --> a = -
		* A --> b = #
		* 
		*  Texto: “)--#A'2B4, B104'##” máscara: “ab”
		*  Resultado “HOLA ES UNA PRUEBA”
		 */

		String texto = "HOLA ES UNA PRUEBA";
		String mascara = "ab";
		String resultado = ")--#A'2B4, B104'##";
		
		//System.out.println(texto);
		System.out.println(cifradoXOR(texto, mascara));
		System.out.println(cifradoXOR2(texto, mascara));
		System.out.println(resultado);
		System.out.println(cifradoXOR(resultado, mascara));
		System.out.println(cifradoXOR2(resultado, mascara));
	}
	static int total (String texto) {
		int aux = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			aux += texto.charAt(i);
		}
		return aux;
	}
	
	public static String cifradoXOR(String cadena, String mascara) {

		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			int codigoAscii= (int) cadena.charAt(i);
			int numeroMascara = (int) mascara.charAt(i%mascara.length());
			int solucion = codigoAscii^numeroMascara;
			
			resultado += (char)solucion;
			
		}
		return resultado;
	}
	
	
	public static String cifradoXOR2(String cadena, String mascara)
	{
		char arrayCars[]=cadena.toCharArray();
		String resultado="";
		
		for(int i=0; i<arrayCars.length; i++)
		{
			int codigoAscii=(int) arrayCars[i];
			
			int numeroMascara=(int) mascara.charAt(i%mascara.length());
			
			int solucion=codigoAscii^numeroMascara;
			
			
			resultado=resultado.concat((char)solucion+"");	
			//resultado=resultado+(char)solucion;
		}
		
		return resultado;
	}
}
