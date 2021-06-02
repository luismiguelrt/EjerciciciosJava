//  Luis Miguel Rubio Toledo
/* 	
 * 	Ejercicio 2
 * 	Crear una función que tome dos parámetros numéricos
 *  y calcule el máximo de los dos números.
 *   Crear una nueva función con el mismo nombre, que tome tres parámetros, 
 *   y calcule el máximo de los tres números. 
 *   Esta segunda función debe hacer uso de la primera.
 */

package ejercicioFunciones;



public class EjercicioFunciones2 {

	public static void main(String[] args) {


		int solucion1, solucion2;
		solucion1 = maximo(20, 5);
		System.out.println(solucion1);
		solucion1 = maximo(5, 20);
		System.out.println(solucion1);
		System.out.println("-----------------------");


		solucion2 = maximo(10, 5, 2);
		System.out.println(solucion2);
		solucion2 = maximo(10, 2, 5);
		System.out.println(solucion2);
		System.out.println("-----------------------");

		solucion2 = maximo(5, 10, 2);
		System.out.println(solucion2);
		solucion2 = maximo(2, 10, 5);
		System.out.println(solucion2);
		System.out.println("-----------------------");
		solucion2 = maximo(5, 2, 10);
		System.out.println(solucion2);
		solucion2 = maximo(2, 5, 10);
		System.out.println(solucion2);

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

		if(n1 > n2)
			return n1;
		else
			return n2;
	}

	static int maximo(int n1, int n2, int n3){

		/*
		if(n1 > n2 && n1 > n3) {
			return n1;
		}else
			if(n2 > n3)
				return n2;
			else
				return n3;
		 */

		/*
		if( maximo(n1, n2) > maximo(n2, n3) ) {
			return maximo(n1, n2);
		}else
			return max = maximo(n2, n3);
		 */

		// return  maximo(n1, n2) > maximo(n2, n3)  ? maximo(n1, n2) : maximo(n2, n3) ;
		
		return maximo(n1, maximo(n2,n3));

	}

}
