//  Luis Miguel Rubio Toledo
/* 	
 * 	Ejercicio 3
 *  Crea una función cuyo nombre sea CalculaMaxArray que 
 *  reciba un array de números y calcule el número máximo del array. 
 */

package ejercicioFunciones;


import java.util.Arrays;
//import java.util.Scanner;


public class EjercicioFunciones3 {

	public static void main(String[] args) {

		

		int[] array1 = { 2, 5, 10, 8, 5, 1, 7, 3 };
		int[] array2 = { 10, 5, 4, 5, 5, 4, 6, 3 };
		int[] array3 = { 5, 6, 0, 3, 8, 9, 7, 10 };
		int[] array4 = { -5, -6, -10, -3, -8, -9, -7, -10 };
		
		int[][] matriz = 	{{ 2, 5, 10, 8, 5, 1, 7, 3 },
							{ 10, 5, 4, 5, 5, 4, 6, 3 },
							{ 5, 6, 0, 3, 20, 9, 7, 10 }};
		
		int solucion1;

		solucion1 = calculaMaxArray(array1);
		System.out.println(solucion1);
		System.out.println("-----------------------");

		solucion1 = calculaMaxArray(array2);
		System.out.println(solucion1);
		System.out.println("-----------------------");

		solucion1 = calculaMaxArray(array3);
		System.out.println(solucion1);
		System.out.println("-----------------------");
		
		solucion1 = calculaMaxArray(array4);
		System.out.println(solucion1);
		System.out.println("-----------------------");
		
		solucion1 = calculaMaxArray(matriz);
		System.out.println(solucion1);
		System.out.println("-----------------------");
		
		
		solucion1 = calculaMaxMatriz(matriz);
		System.out.println(solucion1);
		System.out.println("-----------------------");
		//System.out.println(matriz.length);
		/*
 		Scanner teclado = new Scanner(System.in);

		System.out.println("escribe horas: ");
		n1 = teclado.nextInt();
		System.out.println("escribe precio/hora: ");
		n2 = teclado.nextDouble();

		teclado.close();
		 */		



	}

	// dos parámetros numéricos y calcule el máximo de los dos números.
	static int maximo(int n1, int n2){
		int aux = n2;
		if(n1 > n2)
			aux = n1;
		
		return aux;
	}

	static int calculaMaxArray3(int[] n1){
		Arrays.sort(n1);
		return  n1[n1.length-1];
	}

	static int calculaMaxArray2(int[] n1){
		int aux = n1[0];

		for (int i = 0; i < n1.length; i++)
			aux = maximo(aux, n1[i]);

		return  aux;
	}

	static int calculaMaxArray(int[] n1){
		int aux = n1[0];

		for (int i = 0; i < n1.length; i++)
			if(i>0) 
				if(aux < n1[i])
					aux =  n1[i];

		return  aux;
	}
	
	static int calculaMaxArray(int[][] n1){
		int[] aux1 = new int[n1.length] ;
		
		for (int i = 0; i < n1.length; i++)
			aux1[i] = calculaMaxArray(n1[i]);
			
		return  calculaMaxArray(aux1);
	}
	
	static int calculaMaxMatriz(int[][] n1){
		int aux = n1[0][0];
		
		for (int i = 0; i < n1.length; i++) 
			for (int j = 0; j < n1[i].length; j++) 
				if( aux < n1[i][j])
					aux = n1[i][j];

		return  aux;
	}

}
