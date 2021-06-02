package ejerciciosSimples;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * 	Pide por teclado un número entero N 
		 * 	y muestra la tabla de multiplicar de ese número.
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("escribe numero por teclado: ");
		int n = teclado.nextInt();
		
		teclado.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + n + "= " + (i * n));
		}

	}

}
