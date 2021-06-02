package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 *Realiza un programa que convierta grados Celsius a Fahrenheit. 
		 *El programa debe solicitar la cantidad de grados Celsius y 
		 *mostrar la conversión a Fahrenheit. 
		 *La conversión se realiza mediante la fórmula:
		 */
		
		float fahrenheit;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce la temperatura en grados celsius: ");
		float celsius = teclado.nextFloat();
		
		teclado.close();
		
		fahrenheit = (celsius *2-celsius/5) +32;
		float fahrenheit2 = (celsius * 9 / 5) +32;
		
		System.out.println(String.format("%.2f", fahrenheit) + "F");
		System.out.println(String.format("%.2f", fahrenheit2) + "F");

	}

}
