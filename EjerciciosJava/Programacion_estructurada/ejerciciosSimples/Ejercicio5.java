package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String[] args) {
	

		/*
		 *	En MediaMarkt próximamente realizan el día sin IVA, 
		 *	escribe un programa para que te calcula el precio final 
		 *	y el descuento aplicado. Este programa debe pedir 
		 *	al usuario el PVP y el IVA del producto para calcular 
		 *	el precio a pagar (precio bruto) y  el ahorro aplicado (en euros). 

		 *			PVP=PrecioBruto+PrecioBruto*IVA
		 */
		
		double PVP, IVA, bruto, ahorro;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el IVA(%): ");
		IVA = teclado.nextDouble();
		IVA /= 100;
		
		System.out.print("Introduzca el PVP: ");
		PVP = teclado.nextDouble();
		
		teclado.close();
		
		bruto = PVP / (1 + IVA);
		ahorro = PVP - bruto;
		System.out.println("vas a pagar: " + String.format("%.2f", bruto) + "€ y te has ahorrado: " + String.format("%.2f", ahorro) + "€");

	}

}
