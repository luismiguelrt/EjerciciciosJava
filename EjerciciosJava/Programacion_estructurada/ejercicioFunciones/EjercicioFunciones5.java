//  Luis Miguel Rubio Toledo

/*
 * crear una matriz magica:
 * 
 * 2, 7, 6 ->15
 * 9, 5, 1 -> 15
 * 4, 3, 8 -> 15
 * !  !  !
 * 15,15,15
 * diagonales 15
 */

package ejercicioFunciones;

import java.util.Arrays;

public class EjercicioFunciones5 {

	public static void main(String[] args) {

		int[][] matriz = {	
				{ 2, 7, 6 },
				{ 9, 5, 1 },
				{ 4, 3, 8 }
		};

		int[][] matriz2 = {	
				{ 10, 7, 6 },
				{ 10, 5, 1 },
				{ 10, 3, 8 }
		};
		int[][] matriz3 = {	
				{ 10, 10, 10 },
				{ 9, 5, 1 },
				{ 4, 3, 8 }
		};
		
		

		/*
		System.out.println(Arrays.toString(sumarColumnas(matriz)));
		System.out.println(Arrays.toString(sumarFilas(matriz)));

		System.out.println(Arrays.toString(sumarColumnas(matriz2)));
		System.out.println(Arrays.toString(sumarFilas(matriz2)));

		System.out.println(Arrays.toString(sumarColumnas(matriz3)));
		System.out.println(Arrays.toString(sumarFilas(matriz3)));
		*/


		/*
		int numero;
		numero = isMagica(sumarFilas(matriz3), sumarColumnas(matriz3));
		System.out.println(numero);
		System.out.println("-----------------------------");
		numero = isMagica(sumarFilas(matriz2), sumarColumnas(matriz2));
		System.out.println(numero);
		System.out.println("-----------------------------");
		numero = isMagica(sumarFilas(matriz), sumarColumnas(matriz));
		System.out.println(numero);
		 */
		
		/*
		System.out.println("-----------------------------");
		if( isMagica(sumarFilas(matriz3), sumarColumnas(matriz3)))
			System.out.println("la matriz 3 es magica");
		if( isMagica(sumarFilas(matriz2), sumarColumnas(matriz2)))
			System.out.println("la matriz 2 es magica");
		if( isMagica(sumarFilas(matriz), sumarColumnas(matriz)))
			System.out.println("la matriz 1 es magica");
		System.out.println("-----------------------------");
		*/
		
		System.out.println("matriz 3: " + isMagica(matriz3));
		System.out.println("matriz 2: " + isMagica(matriz2));
		System.out.println("matriz 1: " + isMagica(matriz));

	}

	// array de sumatorio de filas
	static int[] sumarFilas(int[][] array){
		int[] aux = new int[array.length];
		Arrays.fill(aux,0);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				aux[i]+=array[i][j];
			}
		}
		return aux;
	}

	// array de sumatorio de columnas
	static int[] sumarColumnas(int[][] array){
		int[] aux = new int[array.length];
		Arrays.fill(aux,0);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				aux[j]+=array[i][j];
			}
		}
		return aux;
	}
	
	/*
	static int isMagica(int[] fila, int[] columna) {
		int aux = columna.length;
		for (int i = 0; i < columna.length; i++) {
			if(fila[i] == columna[i])
				aux --;
		}

		return aux;
	}
	 */
	
	// comparar los dos arrays de sumatorios
	static boolean isMagica(int[] fila, int[] columna) {
		int aux = columna.length;
		boolean isMagica = false;
		for (int i = 0; i < columna.length; i++) {
			if(fila[i] == columna[i])
				aux --;
		}
		if(aux == 0)
			isMagica = true;
		return isMagica;
	}
	
	// comprobacion entera de la matriz
	static boolean isMagica(int[][] matriz) {
		return isMagica(sumarFilas(matriz),sumarColumnas(matriz));
	}

}
