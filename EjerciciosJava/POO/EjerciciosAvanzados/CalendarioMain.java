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

package EjerciciosAvanzados;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarioMain {

	static PuestoFronterizo miPuesto = new PuestoFronterizo();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar foo = new GregorianCalendar();

		Calendario fecha1 = new Calendario(2020, 2, 29);
		foo.set(2020, 1, 29);

		/*
		 * Calendario fecha2 = new Calendario(2020, 15, 37); Calendario fecha3 = new
		 * Calendario(2020, 3, 1); Calendario fecha4 = new Calendario(1987, 12, 26);
		 * Calendario fecha5 = new Calendario(2021, 2, 26); Calendario fecha6 = new
		 * Calendario(2021, 2, 26);
		 */

		fecha1.mostrarFecha();
		System.out.println(foo.getTime());

		foo.add(Calendar.DATE, 365);
		fecha1.incrementarDia(365);

		fecha1.mostrarFecha();
		// System.out.println("dia: "+foo.DAY_OF_MONTH+" mes: "+(foo.MONTH+1)+ " año:
		// "+foo.YEAR);
		System.out.println(foo.getTime());
		/*
		 * fecha2.mostrarFecha(); fecha3.mostrarFecha(); fecha4.mostrarFecha();
		 * fecha5.mostrarFecha(); fecha6.mostrarFecha();
		 * 
		 * if(fecha1.iguales(fecha6)) System.out.println("son iguales");
		 * 
		 * if(fecha1.iguales(fecha5)) System.out.println("son iguales");
		 */
		// fecha1.mostrarFecha();

		// teclado.close();
		/*
		 * System.out.println(creCalendario(2021, 2, 26));
		 * System.out.println(creCalendario(2020, 3, 37));
		 * System.out.println(creCalendario(2020, 15, 1));
		 * System.out.println(creCalendario(1987, 12, 31));
		 * System.out.println(creCalendario(2021, 2, 29));
		 * System.out.println(creCalendario(2020, 2, 29));
		 */

	}

	/* ----------------------- PRUEBAS ---------------------- */
	/*
	 * static String creCalendario(int anyo, int mes, int dia) { String fecha=""; if
	 * (anyo >= 1900 && anyo <= 2021){
	 * 
	 * if(mes >= 1 && mes <= 12) { switch (mes) { case 1: case 3: case 5: case 7:
	 * case 8: case 10: case 12: if(dia>=1 && dia<=31) fecha = "dia: " + dia
	 * +" mes: " + mes + " año: " + anyo; break; case 2: if (anyo%4==0) { if(dia>=1
	 * && dia<=29) fecha = "dia: " + dia +" mes: " + mes + " año: " + anyo; }else
	 * if(dia>=1 && dia<=28) fecha = "dia: " + dia +" mes: " + mes + " año: " +
	 * anyo;
	 * 
	 * break; case 4: case 6: case 9: case 11: //case 4: if(dia>=1 && dia<=30) fecha
	 * = "dia: " + dia +" mes: " + mes + " año: " + anyo; break; }
	 * 
	 * }
	 * 
	 * } return fecha; }
	 */

}
