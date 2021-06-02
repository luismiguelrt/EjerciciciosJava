// Luis Miguel Rubio Toledo

package ejercicioVectoresMatrices;

import java.util.Scanner;

public class EjercicioVector3 {

	public static void main(String[] args) {

		//		Array o vector

		// 		1. Se nos pide introducir el nombre de 5 alumnos y mostrar los nombres 
		//		al acabar de introducir todos los nombres.

		//		2. Pedir al usuario que introduzca por teclado el numero de alumnos a pedir.

		//		3. Tras pedir el nombre, pediremos la nota del examen. 
		//		y tras pedir la nota del examen de cada alumno, 
		//		imprimimos por pantalla cada nombre con su nota asociada.

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantos alumnos quieres introducir?");
		int numAlu = teclado.nextInt(); // numAlu = 5 ["Pedro","Juan","Paco","Laia","Maria"]
		teclado.nextLine();

		String[] nombres;
		nombres = new String[numAlu];

		int nota[] = new int [numAlu];

		for (int i = 0; i < numAlu ; i++) {
			System.out.print("Introduce nombre del alumno " + (i+1) + ": ");
			nombres[i] = teclado.nextLine();
			do {
				System.out.print("Introduce nota de " + nombres[i] + " alumno: ");
				nota[i] = teclado.nextInt();
				teclado.nextLine();
				if(!(nota[i] >= 0 && nota[i]<=10))
					System.out.print("error, ");
			}while(!(nota[i] >= 0 && nota[i]<=10));
		}
		teclado.close();

		System.out.println( "nombre \t\t\t nota");
		for(int j=0; j < numAlu ; j++) {
			System.out.println( nombres[j] + " \t\t\t  " + nota[j]);
		}
	}
}
