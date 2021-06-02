//	Luis Miguel Rubio Toledo
/*
 * 2.- Solicitar al usuario dos valores, seguidamente inicializar dos matrices de 5x5 con el valor 
 * inicial a los números introducidos por el usuario, y los siguientes valores aumentados en 1 en
 * cada posición para la matriz que empieza por el primer número y en 2 para la matriz que 
 * empieza por el segundo número. A continuación, mostrar la matriz resultante de su suma, su
 * resta, su multiplicación y su división.
 * Ejemplo para la introducción de los valores 4 y 7.
 */
package ejercicioVectoresMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatriz2 {

	public static void main(String[] args) {

		int tamanyo = 5;
		
		int tabla1[][] = new int[tamanyo][tamanyo];
		int tabla2[][] = new int[tamanyo][tamanyo];
		
		int tablaSuma[][] = new int[tamanyo][tamanyo];
		int tablaResta[][] = new int[tamanyo][tamanyo];
		int tablaMultiplicar[][] = new int[tamanyo][tamanyo];
		
		//Arrays.stream(tabla).forEach(a -> Arrays.fill(a,0));
		//Arrays.stream(tabla).forEach(a -> System.out.println(Arrays.toString(a)));

		int numero1 = 0;
		int numero2 = 0;
		int contador1 = 0;
		int contador2 = 0;
		
		Scanner teclado = new Scanner(System.in);

			System.out.print("escribe el primer numero: ");
			numero1 = Integer.parseInt(teclado.nextLine());
			
			System.out.print("escribe el segundo numero: ");
			numero2 = Integer.parseInt(teclado.nextLine());

		teclado.close();
		
		 contador1 = numero1;
		 contador2 = numero2;
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				tabla1[i][j] = contador1++;
				tabla2[i][j] = contador2;
				contador2+=2;
			}
		}
		
		tablaSuma = sumarMatrices(tabla1, tabla2);
		tablaResta = restarMatrices(tabla1, tabla2);
		tablaMultiplicar = multiplicarMatrices(tabla1, tabla2);
		
		
		System.out.println("salida por pantalla: ");
		
		showMatriz(tabla1, "matriz1");
		showMatriz(tabla2, "matriz2");
		showMatriz(tablaSuma, "Sumar");
		showMatriz(tablaResta, "Restar");
		showMatriz(tablaMultiplicar, "Multiplicar");
		
		/*
		
		System.out.println("------------tabla1------------");
		Arrays.stream(tabla1).forEach(a -> System.out.println(Arrays.toString(a)));
		System.out.println("------------tabla2------------");
		Arrays.stream(tabla2).forEach(a -> System.out.println(Arrays.toString(a)));
		
		System.out.println("------------tablaSuma------------");
		Arrays.stream(tablaSuma).forEach(a -> System.out.println(Arrays.toString(a)));
		
		System.out.println("------------tablaResta------------");
		Arrays.stream(tablaResta).forEach(a -> System.out.println(Arrays.toString(a)));
		
		System.out.println("------------tablaMultiplicar------------");

		Arrays.stream(tablaMultiplicar).forEach(a -> System.out.println(Arrays.toString(a)));

		//Arrays.stream(tabla).forEach(a -> System.out.println(Arrays.toString(a)));
*/
	}
	
private static int[][] multiplicarMatrices(int [][] matriz1, int [][] matriz2){
		
		int [][] multi = new int[matriz2.length][matriz2[0].length];
		int acumFilaCol=0;
		
		//Por cada columna de matriz2 vamos a...
		for (int columna = 0; columna < matriz2[0].length; columna++) {
			
			//recorrer cada fila de la matriz1
			for (int i = 0; i < matriz1.length; i++) {
				acumFilaCol = 0;//vaciamos el acumulador
				
				//y multiplicamos por cada valor de la columna
				for (int j = 0; j < matriz1[0].length; j++) {

					acumFilaCol += matriz1[i][j] * matriz2[j][columna];
					
				}
				multi[i][columna] = acumFilaCol;
			}
		}
		return multi;
	}

private static int[][] restarMatrices(int [][] matriz1, int [][] matriz2){
	
	int [][] restar = new int[matriz1.length][matriz1[0].length];
	for (int i = 0; i < restar.length; i++) {
		for (int j = 0; j < restar[i].length; j++) {
			restar[i][j] = matriz1[i][j] - matriz2[i][j];
		}
	}
	return restar;
}

private static int[][] sumarMatrices(int [][] matriz1, int [][] matriz2){
	
	int [][] sumar = new int[matriz1.length][matriz1[0].length];
	for (int i = 0; i < sumar.length; i++) {
		for (int j = 0; j < sumar[i].length; j++) {
			sumar[i][j] = matriz1[i][j] + matriz2[i][j];
			
		}
	}
	return sumar;
}

public static void showMatriz(int[][] matriz, String nombreMatriz) {
	 //System.out.println(matriz.getClass());
	System.out.println("------------" + nombreMatriz + "------------");
	Arrays.stream(matriz).forEach(a -> System.out.println(Arrays.toString(a)));
}
/*	
	static void pintarTablas(int[][] tabla1, int[][] tabla2) {
		int contador1 = numero1;
		int contador2 = numero2;
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				tabla1[i][j] = contador1;
				contador1++;
				tabla2[i][j] = contador2;
				contador2+=2;
			}
		}
	}
	 */

}
