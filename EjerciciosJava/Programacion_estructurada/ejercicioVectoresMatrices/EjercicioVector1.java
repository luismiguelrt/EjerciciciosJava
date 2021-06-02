package ejercicioVectoresMatrices;

import java.util.Scanner;

public class EjercicioVector1 {

	public static void main(String[] args) {

//		Array o vector
		
// 		1. Se nos pide introducir el nombre de 5 alumnos y mostrar los nombres 
//		al acabar de introducir todos los nombres.
		
		String nombre1;
		String nombre2;
		String nombre3;
		String nombre4;
		String nombre5;
		
		//tipo de dato NO primitivo
		String[] nombres = new String[5];// la variable nombres puede almacenar 5 datos de tipo String
		
		String[] nombres2;
		nombres2 = new String[5];//
		
//		nombres2[0]="Mamen";
//		nombres2[1]="Juan";
//		nombres2[2]="Pedro";
//		nombres2[3]="Manuel";
//		nombres2[4]="Sergio";
		
		String nombre="Ana";
		
		
		//tipo de dato primitivo
		int num = 5;
		int num2;
		num2 = 6;
		
		Scanner teclado = new Scanner(System.in);
		
		
		for (int i = 0; i <=4 ; i++) {
			System.out.println("Introduce nombre del alumno: ");
			nombres2[i] = teclado.nextLine();
		}

		teclado.close();
		
		for(int j=0; j<=4 ; j++) {
			System.out.println( nombres2[j] );

		}
		
//		System.out.println(nombre1);
//		System.out.println(nombre2);
//		System.out.println(nombre3);
//		System.out.println(nombre4);
//		System.out.println(nombre5);
//		
//		System.out.println("Introduce nombre del alumno: ");
//		nombre1 = teclado.nextLine();
//				
//		System.out.println("Introduce nombre del alumno: ");
//		nombre2 = teclado.nextLine();
//		
//		System.out.println("Introduce nombre del alumno: ");
//		nombre3 = teclado.nextLine();
//
//		System.out.println("Introduce nombre del alumno: ");
//		nombre4 = teclado.nextLine();
//		
//		System.out.println("Introduce nombre del alumno: ");
//		nombre5 = teclado.nextLine();

		
//		System.out.println(nombre1);
//		System.out.println(nombre2);
//		System.out.println(nombre3);
//		System.out.println(nombre4);
//		System.out.println(nombre5);
		
		
	}

}
