package ejerciciosSimples;

import java.util.Scanner;


public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * Realiza una aplicación que nos calcule una ecuación de segundo grado. 
		 * Se debe pedir a, b y c para realizar el cálculo. 
		 * (Para elevar se debe usar el siguiente método 
		 *		Math.pow(base, exponente) 
		 * y para calcular la raíz cuadrada usa 
		 * 		Math.sqrt(número) ).
		 */
		
		double a, b, c, solucion1, solucion2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ecuacion de 2º grado ");
		
		System.out.print("Introduzca a: ");
		a = teclado.nextDouble();
		
		System.out.print("Introduzca b: ");
		b = teclado.nextDouble();
		
		System.out.print("Introduzca c: ");
		c = teclado.nextDouble();
		
		teclado.close();
		
		System.out.println( a + "x^2" + b + 'x' + c + "=0");
		if(a != 0) {
			double  dentroRaiz = (Math.pow(b, 2) -4 * a * c);
			if (dentroRaiz >= 0) {
				double resultadoRaiz = Math.sqrt(dentroRaiz);
				double divisor = 2 * a;
			solucion1 = (-b + resultadoRaiz) / divisor;
			solucion2 = (-b - resultadoRaiz) / divisor;
			
			System.out.println("x1: " + solucion1);
			System.out.println("x2: " + solucion2);
			}else
				System.out.println("Error! No tiene solución real");
		}else {
			System.out.println("Error! no es una ecuacion de 2º grado");
		}
		
		
		
		

	}

}
