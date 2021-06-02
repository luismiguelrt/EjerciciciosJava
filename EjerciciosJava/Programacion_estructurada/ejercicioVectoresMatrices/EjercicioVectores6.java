//	Luis Miguel Rubio Toledo


/*
 * 1. Construir una matriz cuadrada de 5 x 5 y rellenar las columas de cada fila con el valor del indice de la fila.
 *         
 *         Ej 5x5:
 *                     00000
 *                     11111
 *                     22222
 *                     33333
 *                     44444
 * 
 * 2. Copiar la matriz original en una tercera matriz del mismo tamaño, "cambiando filas por columnas".
 *         
 *         Ej 3x3:
 *                     01234
 *                     01234
 *                     01234
 *                     01234
 *                     01234
 * 
 * 5. Mostrar por pantalla la tercera matriz creada.
 */
package ejercicioVectoresMatrices;

import java.util.Arrays;


public class EjercicioVectores6 {

	public static void main(String[] args) {
		
		final int tamanyoFila = 5;
		final int tamanyoColumna = 5;
		int tabla1[][] = new int[tamanyoFila][tamanyoColumna];
		
		System.out.println("-----------------------------TABLA1-------------------------------------");

		for (int fila = 0; fila < tamanyoFila; fila++) {
			for (int columna = 0; columna < tamanyoColumna; columna++) {
				tabla1[fila][columna] = fila;
			}
		}
		
		Arrays.stream(tabla1).forEach(a -> System.out.println(Arrays.toString(a)));
		
		System.out.println("-----------------------------TABLA2-------------------------------------");
		
		int tabla2[][] = new int[tamanyoFila][tamanyoColumna];
		for (int fila = 0; fila < tamanyoFila; fila++) {
			for (int columna = 0; columna < tamanyoColumna; columna++) {
				tabla2[fila][columna] = columna;
			}
		}
		
		Arrays.stream(tabla2).forEach(a -> System.out.println(Arrays.toString(a)));
	}

}
