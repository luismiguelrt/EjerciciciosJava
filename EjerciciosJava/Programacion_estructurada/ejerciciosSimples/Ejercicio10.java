/*
 * 	Implementa un programa que lea tres números enteros y escriba un mensaje 
 * 	indicando cuál es el mayor de los 3, 
 * 	cuál es el menor de los 3 y 
 * 	cuál es el promedio, 
 * 	intentando que el número de condiciones a evaluar sea el mínimo. 
 */

package ejerciciosSimples;


import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int  mayor, menor;
		int n1, n2, n3;
		double promedio = 0;
		
		System.out.println("escribe primer numero por teclado: ");
		n1 = teclado.nextInt();
		System.out.println("escribe segun numero por teclado: ");
		n2 = teclado.nextInt();
		System.out.println("escribe tercer numero por teclado: ");
		n3 = teclado.nextInt();
		
		teclado.close();
		
		promedio = (n1 + n2 + n3) / 3;
		
		System.out.println("La media es: " + promedio);
		
		if (n1 >= n2 && n1 >= n3)
			mayor = n1;
		else
			if (n2 >= n3)
				mayor = n2;
			else
				mayor = n3;
		
		if (n1 <= n2 && n1 <= n3)
			menor = n1;
		else
			if (n2 <= n3)
				menor = n2;
			else
				menor = n3;
		
		System.out.println("el menor es: " + menor);
		System.out.println("el mayor es: " + mayor);
		
		//	System.out.println("el minimo es: " + Math.min(Math.min(n1, n2),n3));
		//	System.out.println("el mayor es: " + Math.max(Math.max(n1, n2),n3));
		/*
		Scanner teclado = new Scanner(System.in);
		
		int  mayor, menor;
		int n[] = new int[3];
		double promedio = 0;
		
		for (int i = 0; i<n.length;i++) {
			System.out.println("escribe numero por teclado: ");
			n[i] = teclado.nextInt();
			promedio += n[i];
		}

		teclado.close();
		
		mayor = n[0];
		menor = n[0];
		
		for (int i = 1; i<n.length;i++) {
			
			if(mayor<n[i])
				mayor = n[i];
			if(menor>n[i])
				menor = n [i];
		}
		
		promedio /= n.length;
		System.out.println("la media es: " + promedio);
		System.out.println("el menor es: "+ menor);
		System.out.println("el mayor es: "+ mayor);
		*/
	}

}
