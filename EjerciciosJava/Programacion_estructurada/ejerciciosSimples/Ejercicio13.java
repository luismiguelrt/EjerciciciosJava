//	Luis Miguel Rubio Toledo

package ejerciciosSimples;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * 	Escribe un programa que calcule la letra del DNI a partir del número de DNI. 
		 * 	El programa deberá solicitar el número de DNI y mostrar la letra asociada a ese DNI.
		 *  Es necesario calcular el resto de dividir el número de DNI entre 23.
		 *  La letra asociada al número vendrá dada por el valor del resto 
		 *  que podemos encontrar en la siguiente tabla:  
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe los numeros del DNI: ");
		int DNI = teclado.nextInt();
		
		teclado.close();
		
		//	DNI %= 23;
		int letra = DNI%23;
		// String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

		switch (letra) {
		case 0:
			System.out.println("T");
			break;
		case 1:
			System.out.println("R");
			break;
		case 2:
			System.out.println("W");
			break;
		case 3:
			System.out.println("A");
			break;
		case 4:
			System.out.println("G");
			break;
		case 5:
			System.out.println("M");
			break;
		case 6:
			System.out.println("Y");
			break;
		case 7:
			System.out.println("F");
			break;
		case 8:
			System.out.println("P");
			break;
		case 9:
			System.out.println("D");
			break;
		case 10:
			System.out.println("X");
			break;
		case 11:
			System.out.println("B");
			break;
		case 12:
			System.out.println("N");
			break;
		case 13:
			System.out.println("J");
			break;
		case 14:
			System.out.println("Z");
			break;
		case 15:
			System.out.println("S");
			break;
		case 16:
			System.out.println("Q");
			break;
		case 17:
			System.out.println("V");
			break;
		case 18:
			System.out.println("H");
			break;
		case 19:
			System.out.println("L");
			break;
		case 20:
			System.out.println("C");
			break;
		case 21:
			System.out.println("K");
			break;
		case 22:
			System.out.println("E");
			break;
		case 23:
			System.out.println("T");
			break;
		default:
			System.out.println("error!");
			break;
		}
	}
}
