//  Luis Miguel Rubio Toledo

package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio17 {

	public static void main(String[] args) {

		/*
		 * 	Escribir un programa en Java que pida 10 números y 
		 * 	mostrar la media de los números positivos, 
		 * 	la media de los negativos y la cantidad de ceros introducidos.
		 */

		// creamos las variables
		Scanner teclado = new Scanner(System.in);

		final int cantidad = 10;
		double numero, positivos, negativos;
		int cantidadCeros, cantidadPositivos, cantidadNegativos;

		//  incializamos todas las variables a 0
		negativos = positivos = cantidadCeros = cantidadNegativos = cantidadPositivos = 0;

		System.out.println("te pediré 10 numeros:");
		for (int i = 0; i < cantidad; i++) {
			System.out.print("escribe numero "+ (i+1) + " : ");
			numero= teclado.nextInt();
			teclado.nextLine();
			if (numero > 0) {
				positivos += numero;
				cantidadPositivos++;
			}else if (numero < 0) {
				negativos+= numero;
				cantidadNegativos++;
			}else
				cantidadCeros++;
		}

		teclado.close();
		/*

		double media;
		if(cantidadPositivos > 0) {
			media = positivos / cantidadPositivos;
			System.out.println("la media de positivos es: " +
								String.format("%.2f", media));
		}
		else
			System.out.println("no hay positivos");

		if (cantidadNegativos > 0) {
			media = (negativos / cantidadNegativos);
			System.out.printf("la media de negativos es: %.2f \n", media);
		}
		else
			System.out.println( "no hay negativos");

		if (cantidadCeros > 0)
			System.out.println("la cantidad de ceros es: " + cantidadCeros );
		else
			System.out.println( "no hay ceros");
		 */

		//  if condicional con println formateado a 2 decimales y sin variable auxiliar
		System.out.println(cantidadPositivos > 0 ? "la media de positivos es: " + String.format("%.2f", (positivos / cantidadPositivos)) : "no hay positivos");
		//  if condicional con printf formateado a 2 decimales y sin variable auxiliar
		System.out.printf(cantidadNegativos > 0 ? "la media de negativos es: %.2f \n"  : "no hay negativos\n", (negativos / cantidadNegativos));
		//  if condicional
		System.out.println(cantidadCeros > 0 ? "la cantidad de ceros es: " + cantidadCeros : "no hay ceros");

	}
}
