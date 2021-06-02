//	Luis Miguel Rubio Toledo

package ejercicioVectoresMatrices;

import java.util.Arrays;
//	import java.util.Scanner;
//  import java.util.Random;

public class EjercicioVectores3 {

	public static void main(String[] args) {
		/*
		 * 	3. Escriba un programa que pida al usuario que introduzca por teclado el
		 * 	expediente de un alumno, sabiendo que éste se representa mediante una tabla de
		 * 	notas por asignatura (5) y convocatoria (máximo 6).El programa debe calcular
		 * 	y mostrar en pantalla la media ponderada de los aprobados, considerando que
		 * 	el peso de cada convocatoria (a representar mediante un vector) es: 1.25 para
		 * 	la 1ª convocatoria, 1.0 para la 2ª, 0.9 para la 3ª, 0.75 para la 4ª, 0.6 para la 5ª
		 * 	y 0.5 para la 6ª
		 */

		//int totalAlumnos;
		//double tablaNotas[][];
		// String asignatura[] = new String[5];
		final String asignatura[] = {"programacion", "matematicas", "lenguaje", "naturales", "quimica"};
		final double pesoConvocatoria[] = { 1.25, 1.0, 0.9, 0.75, 0.6, 0.5 };

		double convocatoria[][] = new double[asignatura.length][pesoConvocatoria.length];
		double totalMedia[] = new double[pesoConvocatoria.length];

		//tablaNotas = new double[asignatura.length+1][convocatoria.length];

		//Random rn = new Random();

		//  inicializamos todo el Array totalMedia a 0
		Arrays.fill(totalMedia, 0);

		//Scanner teclado = new Scanner(System.in);

		//System.out.println("¿cuantos alumnos hay?: ");
		//totalAlumnos = teclado.nextInt();
		//teclado.nextLine();
		//	tabla =  new int[tamanyo][tamanyo];



		//String[] alumnos = new String[totalAlumnos];
		//for (int x = 0; x < alumnos.length; x++) {
		//System.out.print("nombre del alumno: ");
		//alumnos[x] = teclado.nextLine();
		for (int i = 0; i < asignatura.length; i++) {

			for (int j = 0; j < pesoConvocatoria.length; j++) {
				//	convocatoria[j] = teclado.nextDouble();
				//inicializar valores  aleatorios de 0 - 9.99
				convocatoria[i][j] = (int) ((Math.random() * 900) + 100) / 100.0;
			}
		}
		//}

		//teclado.close();
/*
		System.out.println("salida por pantalla: ");

		// mostrar cuadro en modo random
		for (int i = 0; i < asignatura.length; i++) {
			System.out.print(asignatura[i] + ":\t");
			for (int j = 0; j < pesoConvocatoria.length; j++) {
				System.out.print(convocatoria[i][j]+ "\t");
			}
			System.out.println("");
		}
*/

		System.out.println("------------ solucion -----------------\n");
		for (int i = 0; i < asignatura.length; i++) {
			double aux = 0;
			for (int j = 0; j < pesoConvocatoria.length; j++) {
				aux += convocatoria[i][j]*pesoConvocatoria[j];
			}
			totalMedia[i] = aux/pesoConvocatoria.length;

			//System.out.println("");
		}


		System.out.println("asignaturas\t1ºconvocatoria\t2ºconvocatoria\t3ºconvocatoria\t4ºconvocatoria\t5ºconvocatoria\t6ºconvocatoria\t\tmedia");

		for (int i = 0; i < asignatura.length; i++) {
			System.out.print(asignatura[i] + ":\t\t");
			for (int j = 0; j < pesoConvocatoria.length; j++) {
				System.out.print(convocatoria[i][j]+ "\t\t");
			}
			System.out.printf("%.2f\t\n",totalMedia[i] );
			//System.out.println("");
		}

	}

}
