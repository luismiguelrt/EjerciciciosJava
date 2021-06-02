//  Luis Miguel Rubio Toledo

package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio16 {

	public static void main(String[] args) {

		/*
		 * 	Escribir un programa en Java que lea un número entero por el teclado. 
		 * 	Si el número es par debe imprimir todos los números impares positivos menores que él 
		 * 	y si es impar, los números pares positivos inferiores.
		 */

		// incializamos las variables
		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.println("escribe numero: ");
		numero = teclado.nextInt();
		
		teclado.close();

		if (numero%2 == 0) 
			for (int i = numero; i > 0; i=i-2) 
				System.out.println(numero-=2);
		else
			for (int i = numero; i >= 0; i=i-2) 
				if (i>1)
					System.out.println(numero-=2);

	}
}
