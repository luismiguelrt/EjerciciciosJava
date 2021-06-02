//	Luis Miguel Rubio Toledo


/*
 * 	1. construir una matriz de 10 x 12
 * 	rellenar las columnas de cada fila con el valor con el indice de la fila.
 * 	2. copiar dicha matriz en otra matriz (no referenciar) del mismo tamaño
 * 	3. mostrar por pantalla la matriz copiada.
 * 	4. copiar la matriz original en una 3º matriz del mismo tamaño invirtiendo 
 * 	el orden de los valores de las filas.
 * 	5. mostrar por pantalla la 3º matriz creada.
 */
package ejercicioVectoresMatrices;

import java.util.Arrays;


public class EjercicioVectores5 {

	public static void main(String[] args) {
		
		final int tamanyoFila = 10;
		final int tamanyoColumna = 12;
		int tabla1[][] = new int[tamanyoFila][tamanyoColumna];
		
		System.out.println("-----------------------------TABLA1-------------------------------------");
		/*
		 * *         Ej 3x3:
		 *                     000
		 *                     111
		 *                     222
		 */

		for (int fila = 0; fila < tamanyoFila; fila++) {
			for (int columna = 0; columna < tamanyoColumna; columna++) {
				tabla1[fila][columna] = fila;
			}
		}
		
		Arrays.stream(tabla1).forEach(a -> System.out.println(Arrays.toString(a)));
		//Arrays.stream(tabla).forEach(a -> System.out.println(a));
		System.out.println("-----------------------------TABLA2-------------------------------------");
		/*
		 * *         Ej 3x3:
		 *                     000
		 *                     111
		 *                     222
		 */
		
		int tabla2[][] = new int[tamanyoFila][tamanyoColumna];
		for (int fila = 0; fila < tamanyoFila; fila++) {
			for (int columna = 0; columna < tamanyoColumna; columna++) {
				tabla2[fila][columna] = tabla1[fila][columna];
			}
		}
		
		Arrays.stream(tabla2).forEach(a -> System.out.println(Arrays.toString(a)));
		
		System.out.println("-----------------------------TABLA3-------------------------------------");
		/*
		 * *         Ej 3x3:
		 *                     222
		 *                     111
		 *                     000
		 */
		int contador = tamanyoFila-1;
		int tabla3[][] = new int[tamanyoFila][tamanyoColumna];
		for (int fila = 0; fila < tamanyoFila; fila++) {
			for (int columna = 0; columna < tamanyoColumna; columna++) {
				//if (fila>fila)
				tabla3[fila][columna] = contador;
			}
			contador--;
		}
		//Arrays.sort(tabla3);
		Arrays.stream(tabla3).forEach(a -> System.out.println(Arrays.toString(a)));
		
		
		System.out.println("-----------------------------TABLA4-------------------------------------");
		/*
		 * *         Ej 5x5:
		 *                     01234
		 *                     01234
		 *                     01234
		 *                     01234
		 *                     01234
		 */
		int tabla4[][] = new int[tamanyoFila][tamanyoColumna];
		for (int fila = 0; fila < tamanyoFila; fila++) {
			for (int columna = 0; columna < tamanyoColumna; columna++) {
				tabla4[fila][columna] = columna;
			}
		}
		
		Arrays.stream(tabla4).forEach(a -> System.out.println(Arrays.toString(a)));
	}

}
