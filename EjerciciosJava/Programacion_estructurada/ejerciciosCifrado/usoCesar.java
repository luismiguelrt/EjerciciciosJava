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





public class usoCesar {
	public static void main(String[] args) {

		/*
		* 2.    Implementa el cifrado C��sar que consiste en desplazar cada car��cter seg��n el n��mero indicado. 
	 * Ejemplo: texto hola, desplazamiento 20, salida |����u
	 * Ejemplo: texto |����u, desplazamiento -20, salida hola
	 * Por argumentos del programa se le pasar�� primero el desplazamiento y luego el texto a cifrar.
	 * Ejemplo: MiEjercicioCesar 20 hola
	 * Salida: |����u
		 */

		if(args.length>1) {
			int recorrer = Integer.parseInt(args[0]);
			for (int i = 1; i < args.length; i++) {
				String cifrar = cifradoCesar(args[i], recorrer);
				System.out.print(descifradoCesar(cifrar, recorrer) + ": ");
				System.out.print(cifrar);
				System.out.println();
			}
			System.out.println();
		}
		//System.out.println("|����u");
		/*
		String Z = "hola";
		System.out.println(Z.codePointAt(1));
		int B = 104+20;
		char bla = (char) B;
		System.out.println(bla);
		*/

	}
	public static String cifradoCesar(String cadena, int desplazamiento) {
		char arrayCars[] = cadena.toCharArray();
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			/*
			int codigoAscii = (int) arrayCars[i];
			codigoAscii+= desplazamiento;
			resultado += (char)codigoAscii;
			*/
			resultado+= (char) ((int) arrayCars[i]+desplazamiento);
		}
		
		return resultado;
	}
	
	public static String descifradoCesar(String cadena, int desplazamiento) {
		char arrayCars[] = cadena.toCharArray();
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			resultado+= (char) ((int) arrayCars[i]-desplazamiento);
		}
		
		return resultado;
	}
	
}
