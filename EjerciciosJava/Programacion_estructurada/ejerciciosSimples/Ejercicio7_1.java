package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio7_1 {

	public static void main(String[] args) {

		/*
		 *	Realiza un programa que solicite los siguientes datos al usuario y los muestre por pantalla:
		 *
		 *	Nombre
		 *	Apellidos
		 *	Edad
		 *	DNI/NIE
		 *	Email
		 *	Ciudad
		 *	Código postal
		 *	Teléfono fijo
		 */
		
		String nombre, apellidos, DNI, email, ciudad, codigo_postal, telefono;
		int edad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("**** Inserte los siguientes datos ****");
		System.out.print("Introduzca el Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduzca los Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Introduzca la Edad: ");
		edad = teclado.nextInt();
		System.out.print("Introduzca el DNI/NIE: ");
		DNI = teclado.next();
		System.out.print("Introduzca el Email: ");
		email = teclado.next();
		System.out.print("Introduzca la Ciudad: ");
		ciudad = teclado.next();
		System.out.print("Introduzca el Código postal: ");
		codigo_postal = teclado.next();
		System.out.print("Introduzca el Teléfono fijo: ");
		telefono = teclado.next();
		
		teclado.close();
		
		System.out.println("\t***********  DATOS  ***************");
		System.out.println("\t NOMBRE:\t\t" + nombre);
		System.out.println("\t APELLIDOS:\t\t" + apellidos);
		System.out.println("\t EDAD:\t\t\t" + edad);
		System.out.println("\t DNI/NIE:\t\t" + DNI);
		System.out.println("\t EMAIL:\t\t\t" + email);
		System.out.println("\t CIUDAD:\t\t" + ciudad);
		System.out.println("\t CÖDIGO POSTAL:\t\t" + codigo_postal);
		System.out.println("\t TELEFONO FIJO:\t\t" + telefono);

	}

}
