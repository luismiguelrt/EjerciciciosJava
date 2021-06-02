//	Luis Miguel Rubio Toledo

package ejercicioVectoresMatrices;

import java.util.Arrays;
//import java.util.Iterator;
//	import java.util.Scanner;

public class EjercicioVectores4 {

	public static void main(String[] args) {
		/*
	4. La empresa de libros LIBROMIX tiene a la venta 6 títulos de libros del autor
	Carlos Ruiz Zafón:
		• “Las Luces de Septiembre” (denominado titulo 1),
		• “El Príncipe de la Niebla” (denominado titulo 2),
		• “El Palacio de Medianoche” (denominado titulo 3),
		• “Marina” (denominado titulo 4),
		• “La Sombra del Viento” (denominado titulo 5)
		• “El Juego del Ángel” (denominado titulo 6).
	Este año, en la feria del libro de Madrid, se venderán dichos libros en 3
	casetas diferentes, denominadas Caseta nº 1, Caseta nº 2 y Caseta nº 3. Acabada la
	feria, se quieren informatizar los resultados de las ventas de cada libro en cada caseta.
	Así, se deberá realizar un programa en C que:

		a) Almacene en una matriz la cantidad de ejemplares de cada uno de los 6
		títulos que se han vendido en cada una de las 3 casetas. Dicha información se
		solicitará al usuario del siguiente modo:
				“Introduzca las ventas del título 1 en la Caseta nº 1:” _
				“Introduzca las ventas del título 2 en la Caseta nº 1:” _
				....
				“Introduzca las ventas del título 6 en la Caseta nº 3:” _

		b) A partir de dicha matriz, se deberá almacenar en un vector el número
		de ejemplares totales vendidos (suma de las ventas en cada caseta) de cada
		uno de los 6 títulos.

		c) A partir de dicho vector, se deberá mostrar por pantalla el número de la
		caseta que más ejemplares haya vendido.

		d) Por último, se quiere obtener más información sobre el último libro del
		autor (“El Juego Del Ángel”). Para ello, se mostrará un listado con el
		número de ejemplares que de este libro se han vendido en cada caseta,
		indicar la caseta en la que se han vendido menos ejemplares y el número de
		ejemplares vendidos en esta última caseta.
		 */

		final int totalCasetas = 3;

		final String nombreLibro[] = 	{
				"Las Luces de Septiembre", 
				"El Príncipe de la Niebla", 
				"El Palacio de Medianoche", 
				"Marina", 
				"La Sombra del Viento",
				"El Juego del Ángel"	
		};
		final int tituloLibro[] = { 1, 2, 3, 4, 5, 6 };
		int casetaVentas[][] = new int [totalCasetas][tituloLibro.length]; 
		int totalVentas[] = new int [totalCasetas];
		int libro[] = new int[totalCasetas];


		//  inicializamos todo el Array totalMedia a 0
		Arrays.fill(totalVentas, 0);
		//Scanner teclado = new Scanner(System.in);

		//System.out.println("¿cuantos alumnos hay?: ");
		//totalAlumnos = teclado.nextInt();
		//teclado.nextLine();

		for (int i = 0; i < totalCasetas; i++) {

			for (int j = 0; j < tituloLibro.length; j++) {
				//	convocatoria[j] = teclado.nextDouble();
				//inicializar valores  aleatorios de 0 - 100
				// (int) ((Math.random() * 100) )
				casetaVentas[i][j] = (int) ((Math.random() * 100) ) ;
				totalVentas[i] += casetaVentas[i][j];
				if(nombreLibro[j].equalsIgnoreCase("El Juego del Ángel"))
					libro[i] = casetaVentas[i][j] ;
			}
		}

		//teclado.close();
		System.out.println("salida por pantalla: ");
		// Arrays.stream(casetaVentas).forEach(a -> System.out.println(Arrays.toString(a)));
		System.out.print("casetas \t\t");
		Arrays.stream(tituloLibro).forEach(a -> System.out.print("titulo " + a + "\t"));
		System.out.print("total");
		System.out.println();
		for (int i = 0; i < totalCasetas; i++) {
			System.out.printf("Caseta nº %d \t\t", (i+1));
			for (int j = 0; j < tituloLibro.length; j++) {
				System.out.print(casetaVentas[i][j]+ "\t\t");

			}
			System.out.print(totalVentas[i]);
			System.out.println("");
		}
		
		int max = totalVentas[0];
		int ncaseta = 1;


		for (int i = 0; i < totalVentas.length; i++) {
			if(max < totalVentas[i]) {
				max = totalVentas[i];
				ncaseta = i+1;
			}
		}
		System.out.printf("la caseta que mas ha vendido ha sido la nº %d con: %d libros\n", ncaseta, max);
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("libro: \"" + nombreLibro[nombreLibro.length-1] + "\"");
		
		//int libro[] = new int[totalCasetas];
		int min = libro[0];
		ncaseta = 1;
		for (int i = 0; i < libro.length; i++) {
			if(min > libro[i]) {
				min = libro[i];
				ncaseta = i+1;
			}
			System.out.printf("caseta nº %d ha vendido: %d libros \n", (i+1), libro[i] );
		}

		//Arrays.stream(libro).forEach(a -> System.out.println(a));
		System.out.printf("la caseta nº %d ha vendido: %d libros de \"El Juego del Ángel\" \n", ncaseta, min);


	}

}
