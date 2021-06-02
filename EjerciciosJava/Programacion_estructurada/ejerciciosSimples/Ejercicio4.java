package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 *	Realiza un Programa que pida la longitud de 
		 *	los catetos de un triángulo rectángulo y 
		 *	calcule la longitud de la hipotenusa según 
		 *	el teorema de Pitágoras.
		 */
		
		double catetoA, catetoB, hipotenusa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el cateto A: ");
		catetoA = teclado.nextDouble();
		
		System.out.print("Introduzca el cateto B: ");
		catetoB = teclado.nextDouble();
		
		teclado.close();
		
		hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+catetoB*catetoB);
		System.out.println("valor de la hipotenusa es: " + String.format("%.2f", hipotenusa));
		System.out.println("valor de la hipotenusa es: " + hipotenusa);

	}

}
