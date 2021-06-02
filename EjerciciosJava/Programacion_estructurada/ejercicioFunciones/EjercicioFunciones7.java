//  Luis Miguel Rubio Toledo

/*	Escribe una función que genere una matriz irregular, en forma de pirámide, recibiendo el número de filas
 * 
 * static int[][] generarMatrizPiramide(int nNiveles)
 * 
 * Recibo: 2
 * Creo la siguiente matriz: 
 * 0
 * 0 0
 * 
 * Recibo: 4
 * Creo la siguiente matriz: 
 * 0
 * 1 1
 * 2 2 2
 * 3 3 3 3
 * */


package ejercicioFunciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class EjercicioFunciones7 {

	public static void main(String[] args) {


		//System.out.println("2 filas x 3 columnas.");
		int numero = obtenerNumeroTeclado();
		int[][] piramide = generarMatrizPiramide(numero);
/*
		Arrays.stream(piramide).forEach(a -> System.out.println(Arrays.toString(a)));
		rellenarMatrizNumeroFila(piramide);
		rellenarMatrizIncremental(piramide);
*/		
		piramide = generarMatrizPiramideInversa(numero);
		Arrays.stream(piramide).forEach(a -> System.out.println(Arrays.toString(a)));
		//rellenarMatrizNumeroFila(piramide);
		rellenarMatrizDecremental(piramide);
	}

	static int obtenerNumeroTeclado(){
		Scanner teclado = new Scanner(System.in);
		int numero=0;

		try {
			// control mediante el manejo de excepciones
			System.out.println("escribe un numero: ");
			numero = Integer.parseInt(teclado.nextLine()) ;
		} catch(InputMismatchException | NumberFormatException e) {
			System.out.println("error! no has introducido un número entero");
			numero = obtenerNumeroTeclado();
		}

		teclado.close();
		return numero;
	}

	static int[][] generarMatrizPiramide(int nNiveles){
		int[][] resultado;
		resultado = new int[nNiveles][];

		for (int fila = 0; fila < nNiveles; fila++) {
			resultado[fila] = new int[fila+1];
		}

		return resultado;
	}

	static void rellenarMatrizNumeroFila( int[][] miMatriz){

		for (int fila = 0; fila < miMatriz.length; fila++) 
			for (int columna = 0; columna < miMatriz[fila].length; columna++)
				miMatriz[fila][columna] = fila;

		Arrays.stream(miMatriz).forEach(a -> System.out.println(Arrays.toString(a)));
	}

	static void rellenarMatrizIncremental( int[][] miMatriz){

		int contador = 1;
		for (int fila = 0; fila < miMatriz.length; fila++) 
			for (int columna = 0; columna < miMatriz[fila].length; columna++)
				miMatriz[fila][columna] = contador++;

		Arrays.stream(miMatriz).forEach(a -> System.out.println(Arrays.toString(a)));
	}
	
	static int[][] generarMatrizPiramideInversa(int nNiveles){
		int[][] resultado;
		resultado = new int[nNiveles][];
		//int contador = nNiveles;
		for (int fila = 0; fila < nNiveles; fila++) {
			resultado[fila] = new int[nNiveles-fila];
			//resultado[fila] = new int[contador--];
		}

		return resultado;
	}

	static void rellenarMatrizDecremental( int[][] miMatriz){
		
		int valorActual = 0;
		for(int fila = miMatriz.length-1; fila >= 0; fila--) {
			for(int columna = miMatriz[fila].length-1; columna >= 0; columna--) {
				miMatriz[fila][columna] = valorActual;
				valorActual++;
			}
			
		}
		Arrays.stream(miMatriz).forEach(a -> System.out.println(Arrays.toString(a)));
	}
}
