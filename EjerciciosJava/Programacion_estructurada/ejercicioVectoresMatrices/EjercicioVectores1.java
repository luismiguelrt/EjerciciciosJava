//	Luis Miguel Rubio Toledo

package ejercicioVectoresMatrices;

import java.util.Scanner;

public class EjercicioVectores1 {

	public static void main(String[] args) {
		/*
		 * 	1. Escriba un programa que lea los valores de todos los elementos de dos
		 * 	vectores de enteros introducidos por el usuario, copie esos dos vectores en
		 *  un tercero (uno a continuación del otro) y muestre sus valores por pantalla. 
		 */

		int tamanyo;
		int v1[], v2[], v3[];

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿cuantos vectores desea escribir?: ");
		tamanyo = teclado.nextInt();
		v1 =  new int[tamanyo];
		v2 =  new int[tamanyo];
		v3 = new int[tamanyo*2];

		for (int i = 0; i < tamanyo; i++) {
			System.out.printf("introduce v1[%d]", i);
			v1[i] = teclado.nextInt();
			teclado.nextLine();
			System.out.printf("introduce v2[%d]", i);
			v2[i] = teclado.nextInt();
			teclado.nextLine();
		}
		teclado.close();

		for (int i = 0; i < tamanyo; i++) 
			v3[i] = v1[i];
		for(int j= tamanyo;j < tamanyo*2; j++)
			v3[j] = v2[j-tamanyo];

		System.out.println("salida por pantalla: ");
		System.out.print("vector 3:\t");
		for(int i = 0; i < tamanyo*2; i++)
			System.out.printf(" %d\t",v3[i]);
	}

}
