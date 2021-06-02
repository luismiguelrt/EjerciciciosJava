//  Luis Miguel Rubio Toledo

package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio18 {

	public static void main(String[] args) {

		/*
		 * 	Pedir al usuario tres números enteros (mínimo, máximo e incrementos). 
		 *  Usando un bucle while, imprimir todos los números en orden ascendente 
		 *  desde el mínimo al máximo según los incrementos indicados por el usuario. 
		 *  Usando un bucle for, hacer la cuenta regresiva desde el máximo al mínimo según los incrementos.
		 *  
		   	Ejemplo de ejecución:
			Introduce el número máximo: 10
			Introduce el número mínimo: -10
			Introduce los incrementos: 3
			Usando while: -10, -7, -4, -1, 2, 5, 8
			Usando for: 10, 7, 4, 1, -2, -5, -8
		 */

		// incializamos las variables
		Scanner teclado = new Scanner(System.in);

		int numMax, numMin, incremento, contador;

		System.out.print("mínimo: ");
		numMin= teclado.nextInt();
		teclado.nextLine();
		
		do {
			System.out.print("máximo: ");
			numMax= teclado.nextInt();
			teclado.nextLine();
			 System.out.println( !(numMin<numMax) ? "error!, el numero máximo que has insertado es menor que el minimo" : "");
		}while(!(numMin<numMax));

		System.out.print("incremento: ");
		incremento= teclado.nextInt();
		teclado.nextLine();

		teclado.close();
		
		
		contador = numMin;

		System.out.print("Usando while: ");
		while (contador < numMax) {
			System.out.print(contador + " ");
			contador += incremento;
		}
		System.out.println();

		System.out.print("Usando for: ");
		for (int i = numMax; i > numMin; i-=incremento) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
