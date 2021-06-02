//	Luis Miguel Rubio Toledo

package ejercicioVectoresMatrices;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioVectores2 {

	public static void main(String[] args) {
		/*
		 * 	2. Escriba un programa que declare un array llamado tabla, cuadrado y
		 * 	de dos dimensiones, rellene todos sus elementos con el valor 1 y muestre dicho
		 *  array. Luego el programa deberá poner a 0 todos los elementos de la diagonal
		 *  principal y volver a mostrar el resultado
		 */

		int tamanyo;
		int tabla[][];
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿tamaño del cuadrado?: ");
		tamanyo = teclado.nextInt();
		tabla =  new int[tamanyo][tamanyo];
		
		teclado.close();

		/*
		
		for (int[] row: tabla)
		    Arrays.fill(row, 1);
		for (int[] is : tabla)
			System.out.println(Arrays.toString(is));
		
		System.out.println("-----------------------------------------------");
		Arrays.stream(tabla).forEach(a -> Arrays.fill(a, 5));
		Arrays.stream(tabla).forEach(a -> System.out.println(Arrays.toString(a)));

		System.out.println("-----------------------------------------------");
		*/
		//Arrays.fill(tabla, 1);
		//System.out.println(Arrays.toString(tabla));
		/*
		//	2º forma
		for (int i = 0; i < tamanyo; i++) {
			for (int j = 0; j < tamanyo; j++) {
				tabla[i][j] = 1;
			}
		}
		*/
		// pinto todo a 1
		Arrays.stream(tabla).forEach(a -> Arrays.fill(a, 1));
		//pinto la diagonal a 0
		for (int i = 0, j = 0; i < tamanyo; i++, j++) {
			tabla[i][j]  = 0;
		}
		
		/*
		// forma con if todo de golpe
		for (int i = 0; i < tamanyo; i++) {
			for (int j = 0; j < tamanyo; j++) {
				// pintar 1 o 0 
				if(i==j)
					tabla[i][j] = 0;
				else
					tabla[i][j] = 1;
			}
		}
		 */

		System.out.println("salida por pantalla: ");
		//  muestro el cuadrado
		for (int i = 0; i < tamanyo; i++) {
			for (int j = 0; j < tamanyo; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println("");
		}
	}
}
