package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida una cantidad de euros y 
		 * la convierta a dólares (1 € = 1,1222 $)
		 */
		
		double dolares;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime los euros: ");
		double euros = teclado.nextDouble();
		
		teclado.close();
		
		dolares = euros * 1.1222;
		
		System.out.println("son " + String.format("%.2f", dolares) + "$");

	}

}
