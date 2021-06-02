package ejercicioClaseHerencia;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;




public class Principal {

	private static Scanner teclado = new Scanner(System.in); 
	static List<Alumno> alumnosL = new ArrayList<>();
	static List<Profesor> profesoresL = new ArrayList<>();
	static List<Asignatura> todasAsignaturas = new ArrayList<>();

	static List<Asignatura> asignaturasA = new ArrayList<>();

	static File file;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//todasAsignaturas = leerAsig();
		/*
		Alumno alumnos[] = new Alumno[50];
		Profesor profesores[] = new Profesor[50];
		Asignatura asignaturas[] = new Asignatura[50];
		 */
	
		todasAsignaturas.add(new Asignatura("ingles", "2", 2020, 2021));
		todasAsignaturas.add(new Asignatura("ingles", "1", 2020, 2021));
		todasAsignaturas.add(new Asignatura("sociales", "1", 2018, 2021));
		todasAsignaturas.add(new Asignatura("italiano", "1", 2020, 2021));
		todasAsignaturas.add(new Asignatura("turco", "bla", 2005, 2008));
		todasAsignaturas.add(new Asignatura("programacion", "1", 2020, 2021));
		todasAsignaturas.add(new Asignatura("mates", "1", 2018, 2018));
		todasAsignaturas.add(new Asignatura("lengua", "1", 2020, 2021));
		todasAsignaturas.add(new Asignatura("mates", "2", 2020, 2021));
	
		
		asignaturasA.add(todasAsignaturas.get(5));
		asignaturasA.add(todasAsignaturas.get(8));


		alumnosL.add(new Alumno("mimi", "moro", "444", "fdasfds", todasAsignaturas));
		alumnosL.add(new Alumno("maria", "aria", "234", "dasf", asignaturasA));
		alumnosL.add(new Alumno("roberto", "pozuelo", "48622226L", "", todasAsignaturas));
		alumnosL.add(new Alumno("nadia", "fernandez", "455", "asd", todasAsignaturas));

	
		profesoresL.add(new Profesor("marta", "torrecillas", "48622226L", "asdfr@sfs.com", "casa la wacha", todasAsignaturas));
		profesoresL.add(new Profesor("sora", "rubio", "123456789", "dsfaasf.cod", "", todasAsignaturas));
		profesoresL.add(new Profesor("milu", "blanco", "asdf", "", "hola@.com", todasAsignaturas));
		profesoresL.add(new Profesor("kartos", "roma", "", "rotar@gamail.es", "", todasAsignaturas));
		profesoresL.add(new Profesor("lidia", "boss", "", "asdf.fsa@dsffds.sdfas", "", todasAsignaturas));
	

		menuPrincipal();


	}

	private static void menuPrincipal() {
		System.out.println("Introduzca la opción que desea realizar:");
		System.out.println("1. Menú alumnos");
		System.out.println("2. Menú asignaturas");
		System.out.println("3. Menú profesores");
		System.out.println("0. Salir");
		int opcion = obtenerNumeroTeclado();

		switch (opcion) {
		case 1:
			menuAlumnos();
			break;
		case 2:
			menuAsignaturas();
			break;
		case 3:
			menuProfesores();
			break;
		case 0:
			System.out.println("adios!!");
			break;

		default:
			System.out.println("");
			menuPrincipal();
			break;
		}

	}

	private static void menuAlumnos() {

		String nombre;

		System.out.println("Menú Alumnos:");
		System.out.println("1. Mostrar alumnos");
		System.out.println("2. Añadir alumnos");
		System.out.println("3. Mostrar asignaturas del alumno");
		System.out.println("4. Mostrar asignaturas del alumno para el año ");
		System.out.println("5. Matricular alumno a la asignatura");
		System.out.println("0. Volver al menú principal");

		int opcion = obtenerNumeroTeclado();

		switch (opcion) {

		case 1:
			//System.out.println("NOMBRE".substring(0,12) + "\t" + "APELLIDO".substring(0,12) + "\t" + "DNI".substring(0,10) + "\t" + "E-MAIL ");
			System.out.println(String.format("%-16s","NOMBRE") + "\t" + String.format("%-16s","APELLIDO") + "\t" + String.format("%-12s","DNI") + "\t" + "E-MAIL ");
			alumnosL.forEach(alumno -> alumno.visualizar() );
			menuAlumnos();
			break;
		case 2:
			addAlumno();
			menuAlumnos();
			break;
		case 3:
			System.out.println("nombre alumno?");
			nombre = teclado.nextLine();
			for (Alumno alum : alumnosL) {
				if(alum.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
					alum.visualizarAsig();
				}
			}
			//alumnosL.contains(alumnosL.g)
			menuAlumnos();
			break;
		case 4:
			System.out.println("nombre alumno?");
			nombre = teclado.nextLine();
			for (Alumno alum : alumnosL) {
				if(alum.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
					System.out.println("año??");
					int anyo = obtenerNumeroTeclado();
					alum.visualizarAsig(anyo);
				}
			}
			menuAlumnos();
			break;
		case 5:
			System.out.println("nombre alumno?");
			nombre = teclado.nextLine();
			for (Alumno alum : alumnosL) {
				if(alum.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
					addAsig(alum);
				}
			}
			//alumnosL.contains(alumnosL.g)
			menuAlumnos();
			break;
		case 0:
			menuPrincipal();
			break;

		default:
			System.out.println("");
			menuAlumnos();
			break;
		}

	}



	private static void addAlumno() {

		//List<Asignatura> addAsig = new ArrayList<Asignatura>();
		Alumno addAlumno = new Alumno();
		System.out.print("nombre: ");
		addAlumno.setNombre(teclado.nextLine());
		//String nombre = teclado.nextLine();
		System.out.print("apellido: ");
		addAlumno.setApellido(teclado.nextLine());
		//String apellido = teclado.nextLine();
		System.out.print("DNI: ");
		addAlumno.setDni(teclado.nextLine());
		//String dni = teclado.nextLine();
		System.out.print("correo electronico: ");
		addAlumno.setEmail(teclado.nextLine());
		//addPersona();
		alumnosL.add(addAlumno);

	}


	// TODO no se si se hace
	private static void addAsig(Alumno alumno) {

		//List<Asignatura> addAsig = new ArrayList<Asignatura>();
		//Alumno addAlumno = new Alumno();
		System.out.println("Qué asignaturas quieres matricular?: ");
		System.out.println("------------- Asignaturas -------------");
		int contador = 1;
		for (Asignatura asignatura : todasAsignaturas) {
			System.out.println(contador++ + ". " + asignatura.getNombre() + " " + asignatura.getCurso());
		}
		System.out.println("0. salir");
		int indiceAsig = (obtenerNumeroTeclado() -1 );
		if (indiceAsig >= 0 && indiceAsig <= todasAsignaturas.size()) {
			if(alumno.matricular(todasAsignaturas.get(indiceAsig))) {
				System.out.println("matriculado en: " + todasAsignaturas.get(indiceAsig).getNombre());
			}
		}else {
			if(indiceAsig != -1)
				addAsig(alumno);
		}
		//alumnosL.add(new Alumno(nombre, apellido, dni, email, asignaturasA));
	}

	private static void addAsig(Profesor profesor) {

		//List<Asignatura> addAsig = new ArrayList<Asignatura>();
		//Alumno addAlumno = new Alumno();
		System.out.println("Qué asignaturas quieres impartir?: ");
		System.out.println("------------- Asignaturas -------------");
		int contador = 1;
		for (Asignatura asignatura : todasAsignaturas) {
			System.out.println(contador++ + ". " + asignatura.getNombre() + " " + asignatura.getCurso());
		}
		System.out.println("0. salir");
		int indiceAsig = (obtenerNumeroTeclado() -1 );
		if (indiceAsig >= 0 && indiceAsig <= todasAsignaturas.size()) {
			if(profesor.asignar(todasAsignaturas.get(indiceAsig))) {
				System.out.println("impartiendo en: " + todasAsignaturas.get(indiceAsig).getNombre());
			}
		}else {
			if(indiceAsig != -1)
				addAsig(profesor);
		}
		//alumnosL.add(new Alumno(nombre, apellido, dni, email, asignaturasA));
	}

	//for each
	/*
	alumnosL.forEach(alumno -> {
		alumno.visualizar();
	});
	 */


	private static void menuProfesores() {

		String nombre;

		System.out.println("Menú profesores:");
		System.out.println("1. Mostrar profesores");
		System.out.println("2. Añadir profesores");
		System.out.println("3. Mostrar asignaturas que imparte el profesor");
		System.out.println("4. Mostrar asignaturas del año que imparte el profesor ");
		System.out.println("5. Asignar docencia al profesor");
		System.out.println("0. Volver al menú principal");

		int opcion = obtenerNumeroTeclado();

		switch (opcion) {

		case 1:
			//alumnosL.forEach(alumno -> alumno.visualizar() );
			mostrarProf();
			menuProfesores();
			break;
		case 2:
			addProfesor();
			menuProfesores();
			break;
		case 3:
			System.out.println("nombre profesor?");
			nombre = teclado.nextLine();
			for (Profesor pro : profesoresL) {
				if(pro.getNombre().toLowerCase().equals(nombre.toLowerCase())) {

					addAsig(pro);

				}
			}
			menuProfesores();
			break;
		case 4:
			System.out.println("nombre profesor?");
			nombre = teclado.nextLine();
			for (Profesor pro : profesoresL) {
				if(pro.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
					System.out.println("año??");
					int anyo = obtenerNumeroTeclado();
					pro.visualizarAsig(anyo);
				}
			}
			menuPrincipal();
			break;
		case 5:
			System.out.println("nombre profesor?");
			nombre = teclado.nextLine();
			for (Profesor pro : profesoresL) {
				if(pro.getNombre().toLowerCase().equals(nombre.toLowerCase())) {

					addAsig(pro);


				}
			}
			//alumnosL.contains(alumnosL.g)
			menuAlumnos();
			break;
		case 0:
			menuPrincipal();
			break;

		default:
			System.out.println("");
			menuProfesores();
			break;
		}
	}
	
	private static void  mostrarProf() {
		if(!profesoresL.isEmpty()) {
			//System.out.println(String.format("%-16s","NOMBRE") + "\t" + String.format("%-16s","APELLIDO") + "\t" + String.format("%-12s",this.dni) + "\t" + this.email);
			System.out.println(String.format("%-16s","NOMBRE") + "\t" + String.format("%-16s","APELLIDO") + "\t" + String.format("%-12s","DNI") + "\t" + "E-MAIL ");
			profesoresL.forEach(a -> a.visualizar());
			
		}else {
			System.out.println("la base de datos esta vacía");
		}
	}


	private static void addProfesor() {

		//List<Asignatura> addAsig = new ArrayList<Asignatura>();
		Profesor addProfesor = new Profesor();
		System.out.print("nombre: ");
		addProfesor.setNombre(teclado.nextLine());
		//String nombre = teclado.nextLine();
		System.out.print("apellido: ");
		addProfesor.setApellido(teclado.nextLine());
		//String apellido = teclado.nextLine();
		System.out.print("DNI: ");
		addProfesor.setDni(teclado.nextLine());
		//String dni = teclado.nextLine();
		System.out.print("correo electronico: ");
		addProfesor.setEmail(teclado.nextLine());
		System.out.print("direccion: ");
		addProfesor.setDireccion(teclado.nextLine());
		//String email = teclado.nextLine();

		profesoresL.add(addProfesor);

	}
	private static void menuAsignaturas() {
		System.out.println("Menú asignatura:");
		System.out.println("1. Mostrar asignaturas");
		System.out.println("2. Añadir asignaturas");
		System.out.println("0. Salir");

		int opcion = obtenerNumeroTeclado();

		switch (opcion) {

		case 1:
			mostrarAsig();
			menuAsignaturas();
			break;
		case 2:
			addAsig();
			menuAsignaturas();
			break;
		case 0:
			menuPrincipal();
			break;

		default:
			System.out.println("");
			menuAsignaturas();
			break;
		}

	}

	private static void addAsig() {
		System.out.print("nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("curso: ");
		String curso = teclado.nextLine();
		System.out.print("año inicial: ");
		int ini = obtenerNumeroTeclado();
		System.out.print("año final: ");
		int fin = obtenerNumeroTeclado();
		todasAsignaturas.add(new Asignatura(nombre, curso, ini, fin));
		// Asignatura(String nombre, String curso, int anyoIni, int anyoFin)
	}


	//TODO 
	/*
	private static void mostrar(List<Profesor> personas) {
		System.out.println(String.format("%-16s","NOMBRE") + "\t" + String.format("%-16s","APELLIDO") + "\t" + String.format("%-12s","DNI") + "\t" + "E-MAIL ");
		personas.forEach(persona -> persona.visualizar() );
	}
	 */

	private static void  mostrarAsig() {

		//List<Asignatura> aux = leer();
		if(!todasAsignaturas.isEmpty()) {

			System.out.println(String.format("%-12s","NOMBRE").substring(0,12) + "  " + String.format("%-12s","CURSO").substring(0,12) + "INICIO" + "\t" + "FINAL");
			//leer();
			todasAsignaturas.forEach(asig -> asig.visualizar() );
		}else {
			System.out.println("la base de datos esta vacía");
		}
	}

	private static int obtenerNumeroTeclado(){

		int numero=0;

		try {

			numero = Integer.parseInt(teclado.nextLine()) ;
		} catch(InputMismatchException | NumberFormatException e) {
			System.out.println("error! no has introducido un número entero");
			numero = obtenerNumeroTeclado();
		}


		return numero;
	}

}

