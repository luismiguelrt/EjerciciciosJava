//  Luis Miguel Rubio Toledo
/* 	
 * 	A.    Ejercicio 1
 * 	Escribir una función SALARIO que calcule los salarios de un trabajador 
 * 	para un número dado de horas trabajadas y el dinero por hora. 
 * 	Las horas trabajadas que superen las 40h semanales, 
 * 	se pagarán como extras a 1.5 veces el salario normal.
 */

package ejercicioFunciones;


import java.util.Scanner;

public class EjercicioFunciones1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n1;
		double n2;
		double salario = 0;

		System.out.println("escribe horas: ");
		n1 = teclado.nextInt();
		System.out.println("escribe precio/hora: ");
		n2 = teclado.nextDouble();

		teclado.close();

		salario = salario(n1, n2);
		double salario1 = salario(40, 10);
		double salario2 = salario(20, 15);
		double salario3 = salario(50, 20);
		double salario4 = salario(10, 50);
		double salario5 = salario(40, 8.5);
		System.out.println("el salario es: " + salario);
		System.out.println("el salario es: " + salario1);
		System.out.println("el salario es: " + salario2);
		System.out.println("el salario es: " + salario3);
		System.out.println("el salario es: " + salario4);
		System.out.println("el salario es: " + salario5);


	}

	static double salario(int horas, double precioHora)
	{
		double resultado=0;
		double horasExtras = 0;
		if(horas > 40) {
			horasExtras = horas -40;
			resultado = ((horas-horasExtras)*precioHora) + (horasExtras*1.5*precioHora);
		}else
			resultado = horas * precioHora;

		return resultado;
	}

}
