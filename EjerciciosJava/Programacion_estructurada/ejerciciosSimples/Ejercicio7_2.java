package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio7_2 {

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
		
		//se declaran las variables necesarias
		Scanner teclado = new Scanner(System.in);
		final String[] campos = { "Nombre","Apellidos","Edad","DNI/NIE","Email","Ciudad","Còdigo postal","Teléfono fijo"};
		String[] datos = new String [8];
		
		
		//se pide cada dato al usuario
		for (int i = 0 ; i < campos.length; i++) {
			System.out.println("Por favor, escriba para rellenar el campo: \n ["+ campos[i]+"]");
			datos[i] = teclado.next();
		}
		
		//Se imprimen los datos en pantalla
		System.out.print("A continuacón, los datos registrados: \t\n +++++++++++++++++++++++ \n\n");
		for (int i = 0 ; i < campos.length; i++) {
			System.out.println("["+campos[i]+"]: "+datos[i]);
		}	
		teclado.close();

	}
	
	
	

}
