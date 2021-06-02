//  Luis Miguel Rubio Toledo

/*
 * 1. En un puesto fronterizo recogemos diariamente la información referente al tránsito de personas. 
 * Para una persona nos interesa almacenar 
 * su DNI y nombre completo. 
 * Se pide diseñar una aplicación que presente las siguientes opciones: 

	Paso de frontera.
	Mostrar todas las personas. 
	Búsqueda por nombre. 
	Búsqueda por DNI. 
	Salir.
 *  Mediante la opción 1 se recogen los datos de la persona que transita a través de la frontera. 
 *  La opción 2 muestra la información de todas las personas que han pasado por la frontera. 
 *  Mediante la opción 3 se solicita un nombre por teclado y se muestra la información de todas 
 	las personas cuyo nombre coincide con el introducido.
 *	Por Último, en la opción 4 introducirnos el DNI de una persona de la que obtendremos toda su información. 
   
 */

package EjerciciosAvanzados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PuestoFronterizoMain {

	// static Scanner teclado = new Scanner(System.in);

	private static Scanner teclado = new Scanner(System.in);
	static PuestoFronterizo miPuesto = new PuestoFronterizo();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();

		// teclado.close();
	}

	static void menu() {

		System.out.println("----------MENU----------");
		System.out.println("1. paso de frontera. ");
		System.out.println("2. Mostrar todas las personas. ");
		System.out.println("3. Búsqueda por nombre.  ");
		System.out.println("4. Búsqueda por DNI. ");
		System.out.println("5. Salir. ");
		int opcion = obtenerNumeroTeclado();
		switch (opcion) {
		case 1:
			crearPersonas();
			break;
		case 2:
			miPuesto.mostrarPersonas();
			break;
		case 3:
			System.out.print("nombre: ");
			miPuesto.buscarNombre(obtenerTeclado());
			break;
		case 4:
			System.out.print("DNI: ");
			miPuesto.buscarDNI(obtenerTeclado());
			break;
		case 5:
			System.out.println("Adios");
			break;
		default:
			System.out.println("error");

			break;
		}
		if (opcion != 5)
			menu();

	}

	static private int obtenerNumeroTeclado() {

		int numero = 0;

		try {
			// control mediante el manejo de excepciones
			System.out.println("escribe un numero: ");
			numero = Integer.parseInt(obtenerTeclado());
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("error! no has introducido un número entero");
			numero = obtenerNumeroTeclado();
		}

		// teclado.close();
		return numero;
	}
	
	static private String obtenerTeclado() {
		return teclado.nextLine() ;
	}

	static private void crearPersonas() {
		System.out.print("nombre: ");
		String nombre = obtenerTeclado();
		System.out.print("DNI: ");
		String DNI = obtenerTeclado();
		miPuesto.crearPersonas(nombre, DNI);
	}

}
