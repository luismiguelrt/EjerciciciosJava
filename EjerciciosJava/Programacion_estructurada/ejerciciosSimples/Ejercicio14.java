package ejerciciosSimples;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * 	Pedir una nota numérica entera entre 0 y 10, 
		 * 	y mostrar dicha nota de la forma: cero, uno, dos, tres…
		 * 
		 * 	Modifica el programa del Ejercicio 11,  para que, 
		 * 	si se introduce una nota no válida, 
		 * 	muestre un mensaje de error y siga pidiendo notas hasta que sea válida. 
		 * 	(La nota no es válida si está fuera del rango 0-10) 
		 */

		// incializamos las variables
		Scanner teclado = new Scanner(System.in);
		int n;
		
		/*
		// mientras no sea menor o igual a cero y mayor o igual a diez se realizará las siguientes instrucciones
		// modo de if anidados
		do {
			System.out.println("escribe numero entero entre 0 y 10: ");
			n = teclado.nextInt();
			if(n == 0)
				System.out.println("cero");
			else if(n == 1)
				System.out.println("uno");
			else if(n == 2)
				System.out.println("dos");
			else if(n == 3)
				System.out.println("tres");
			else if(n == 4)
				System.out.println("cuatro");
			else if(n == 5)
				System.out.println("cinco");
			else if(n == 6)
				System.out.println("seis");
			else if(n == 7)
				System.out.println("siete");
			else if(n == 8)
				System.out.println("otro");
			else if(n == 9)
				System.out.println("nueve");
			else if(n == 10)
				System.out.println("diez");
		}while(!(n >=0 && n<=10));

		teclado.close();
		*/
		
		
		
		/*
		 //  uso del operador condicional "?"
		do {
			System.out.println("escribe numero entero entre 0 y 10: ");
			n = teclado.nextInt();
			System.out.println(
					n == 0 ? "uno" :
						n == 2 ? "dos" : 
							n == 3 ? "tres" : 
								n == 4 ? "cuatro" : 
									n == 5 ? "cinco" : 
										n == 6 ? "seis" : 
											n == 7 ? "siete" :
												n == 8 ? "ocho" :
													n == 9 ? "nueve" :
														n == 10 ? "diez" :
															"error, vuelve a intentarlo"
					);
		}while(!(n >=0 && n<=10));

		teclado.close();
		*/
		
		
		/*
		// uso de forma de array
		String[] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
		do {
			System.out.println("escribe numero entero entre 0 y 10: ");
			n = teclado.nextInt();
		}while(!(n >=0 && n<=10));
		System.out.println(palabras[n]);
		teclado.close();
		*/
		
		
		
		  
		// uso de forma swich
		do {
			System.out.println("escribe numero entero entre 0 y 10: ");
			n = teclado.nextInt();
			switch (n) {
			case 0:
				System.out.println("cero");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
				break;
			case 10:
				System.out.println("diez");
				break;
			default:
				break;
			}
		}while(!(n >=0 && n<=10));

		teclado.close();
		 

	}

}
