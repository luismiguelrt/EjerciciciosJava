//  Luis Miguel Rubio Toledo
package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio15 {

	public static void main(String[] args) {

		/*
		 * 	Pedir números enteros hasta que se teclee uno negativo, 
		 * 	y mostrar cuántos números se han introducido.
		 */

		// incializamos las variables
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador = 0;

		do {
			System.out.println("escribe numero (si es negativo saldrá del programa: ");
			numero = teclado.nextInt();
			contador++;
		}while(numero >= 0);

		teclado.close();

		System.out.println("has introducido: " + contador + " numeros");
	}
}
