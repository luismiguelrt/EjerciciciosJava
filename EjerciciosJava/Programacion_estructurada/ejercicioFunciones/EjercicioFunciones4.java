//  Luis Miguel Rubio Toledo

/*
 * declarar array a mano
 * pedir numero al usuario
 * mostrar el numero del array de la posicion dada
 */

package ejercicioFunciones;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioFunciones4 {

	public static void main(String[] args) {

		int[] mano = {20,50,24,84,66,54,6,5,8,10,5};

		int numero;

		numero = obtenerNumeroTeclado();
		System.out.println("el numero es: " + obtenerNumeroArray(mano, numero));

	}

	static int obtenerNumeroTeclado(){
		Scanner teclado = new Scanner(System.in);
		int n1=0;

		try {
			do {
				System.out.println("escribe un numero del 0 al 10: ");
				n1 = teclado.nextInt();
				teclado.nextLine();
			}while(!(n1>=0 && n1<=10));
		} catch (InputMismatchException e) {
			System.out.println("error! no has introducido un número entero");
			n1 = obtenerNumeroTeclado();
		}

		teclado.close();
		return n1;
	}

	static int obtenerNumeroArray(int[] array, int indice) {
		int nArray;
		if(indice < 0 || indice >= array.length) 
			nArray = 0;
		else
			nArray = array[indice];
		return nArray;
	}

}
