//	Luis Miguel Rubio Toledo
/*
 * 1.- Realiza un programa que le solicite al usuario 10 números, a continuación calculará en una
 * matriz los valores de dichos números multiplicados por 1, 2, 3, 4, 5, 6, 7, 8, 9 y 10, finalmente
 * los mostrará por pantalla en filas por valor de multiplicación.
 */
package ejercicioVectoresMatrices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioMatriz1 {

	public static void main(String[] args) {

		int tamanyo = 10;
		int tabla[][] = new int[tamanyo][tamanyo];
		Scanner teclado = new Scanner(System.in);
		//Arrays.stream(tabla).forEach(a -> Arrays.fill(a,0));
		//Arrays.stream(tabla).forEach(a -> System.out.println(Arrays.toString(a)));

		boolean esValido = false;
		int numero = 0;
		for (int i = 0; i < tabla.length; i++) {
			//int[] js = tabla[i];

			//numero=0;
			
			do {
				esValido = false;
				try {
					// control mediante el manejo de excepciones
					System.out.println("escribe un numero: ");
					numero = Integer.parseInt(teclado.nextLine()) ;
					esValido = true;
				} catch(InputMismatchException | NumberFormatException e) {
					System.out.println("error! no has introducido un número entero");
					esValido = false;
					//numero = obtenerNumeroTeclado();
				}

			}while(!esValido);
			
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = numero*(j+1);
			}
		}
		teclado.close();

		System.out.println("salida por pantalla: ");
		Arrays.stream(tabla).forEach(a -> System.out.println(Arrays.toString(a)));

	}
	/*
	static int obtenerNumeroTeclado(){
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		boolean esValido = false;
		do {
			esValido = false;
			try {
				// control mediante el manejo de excepciones
				System.out.println("escribe un numero: ");
				numero = Integer.parseInt(teclado.nextLine()) ;
				esValido = true;
			} catch(InputMismatchException | NumberFormatException e) {
				System.out.println("error! no has introducido un número entero");
				esValido = false;
				//numero = obtenerNumeroTeclado();
			}

		}while(!esValido);

		teclado.close();
		return numero;
	}
	 */

}
