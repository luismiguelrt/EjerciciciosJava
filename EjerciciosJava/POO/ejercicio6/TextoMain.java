//  Luis Miguel Rubio Toledo

/*
 * 1. En un puesto fronterizo recogemos diariamente la información referente al tránsito de personas. 
 * Para una persona nos interesa almacenar 
 * su DNI y nombre completo. 
 * Se pide diseñar una aplicación que presente las siguientes opciones: 

	Paso de frontera.
	Mostrar todas las personas. 
	Búsqueda por nombre. 
	Búsqueda por DNI. 
	Salir.
 *  Mediante la opción 1 se recogen los datos de la persona que transita a través de la frontera. 
 *  La opción 2 muestra la información de todas las personas que han pasado por la frontera. 
 *  Mediante la opción 3 se solicita un nombre por teclado y se muestra la información de todas 
 	las personas cuyo nombre coincide con el introducido.
 *	Por Último, en la opción 4 introducirnos el DNI de una persona de la que obtendremos toda su información. 
   
 */

package ejercicio6;


public class TextoMain {

	//static Scanner teclado = new Scanner(System.in);
	
	static Texto miTexto = new Texto(10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(miTexto.getTexto());
		
		miTexto.concatInicio("hola");
		System.out.println(miTexto.getTexto());
		
		miTexto.concatInicio("eres ");
		System.out.println(miTexto.getTexto());
		
		miTexto.concatFinal("2");
		System.out.println(miTexto.getTexto());
		System.out.println(miTexto.getTexto().length());
		
		System.out.println("cantidad vocales: " + miTexto.contarVocales());
		
		//teclado.close();
	}
	

}
