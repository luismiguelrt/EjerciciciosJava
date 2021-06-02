//Luis Miguel Rubio Toledo

/*
 * 2. Diseñar la clase Calendario que representa un fecha concreta (año, mes y día). 
 * La clase debe disponer de los métodos: 

 *	Calendario (int año, int mes, int dia: 
 		que crea un objeto con los datos pasados como parámetros, 
 		siempre y cuando, la fecha que representen sea correcta. 

void incrementarDia(int cantidad): que incrementa la fecha del calendario en el número de días especificados. 

void incrementarMes (int cantidad): que incrementa la fecha del calendario en el número de meses especificados. 

void incrementarAño (int cantidad): que incrementa la fecha del calendario en el número de años especificados, salvo que el año resultante sea el 0 (que no existió). void mostrar muestra la fecha por consola. 

boolean iguales (Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas. 
 */
package EjerciciosAvanzados;

//	import java.util.Calendar;
//	import java.util.GregorianCalendar;

public class Calendario {

	protected int anyo, mes, dia;

	// Calendar calendario = new GregorianCalendar();
	// Calendar c = new GregorianCalendar();

	/**
	 * @param anyo
	 * @param mes
	 * @param dia
	 */
	Calendario(int anyo, int mes, int dia) {

		if (anyo >= 1900 && anyo <= 2021) {

			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						this.anyo = anyo;
						this.mes = mes;
						this.dia = dia;
					}
					break;
				case 2:
					if (anyo % 4 == 0) {
						if (dia >= 1 && dia <= 29) {
							this.anyo = anyo;
							this.mes = mes;
							this.dia = dia;
						}
					} else if (dia >= 1 && dia <= 28) {
						this.anyo = anyo;
						this.mes = mes;
						this.dia = dia;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30) {
						this.anyo = anyo;
						this.mes = mes;
						this.dia = dia;
					}
					break;
				}

			}

		}

		/*
		 * if( (anyo >= 1900 && anyo <= 2021) && (mes >= 1 && mes <= 12) && (dia >= 1 &&
		 * dia <= 31)) { c.set(anyo, mes-1, dia);
		 * 
		 * this.dia = c.get(Calendar.DATE); this.mes = c.get(Calendar.MONTH); this.anyo
		 * = c.get(Calendar.YEAR); } c.set(anyo, mes-1, dia-1); this.dia =
		 * c.get(Calendar.DATE); this.mes = c.get(Calendar.MONTH); this.anyo =
		 * c.get(Calendar.YEAR);
		 */
	}

	void incrementarDia(int cantidad) {

		int miDia = this.dia + cantidad;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (!(miDia >= 1 && miDia <= 31)) {
				incrementarMes(1);
				cantidad -= 31;
				incrementarDia(cantidad);
			} else
				this.dia = miDia;
			break;
		case 2:
			if (anyo % 4 == 0) {
				if (!(miDia >= 1 && miDia <= 29)) {
					incrementarMes(1);
					cantidad -= 29;
					incrementarDia(cantidad);
				} else
					this.dia = miDia;
			} else if (!(miDia >= 1 && miDia <= 28)) {
				incrementarMes(1);
				cantidad -= 28;
				incrementarDia(cantidad);
			} else
				this.dia = miDia;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (!(miDia >= 1 && miDia <= 30)) {
				incrementarMes(1);
				cantidad -= 30;
				incrementarDia(cantidad);
			} else
				this.dia = miDia;
			break;
		}

		/*
		 * c.add(Calendar.DAY_OF_MONTH, cantidad); this.dia = c.get(Calendar.DATE);
		 * this.mes = c.get(Calendar.MONTH); this.anyo = c.get(Calendar.YEAR);
		 */
	}

	void incrementarMes(int cantidad) {
		int mimes = this.mes + cantidad;
		if (!(mimes >= 1 && mimes <= 12)) {
			cantidad -= 12;
			incrementarAño(1);
			incrementarMes(cantidad);
		} else
			this.mes = mimes;
		/*
		 * c.add(Calendar.MONTH, cantidad); this.dia = c.get(Calendar.DATE); this.mes =
		 * c.get(Calendar.MONTH); this.anyo = c.get(Calendar.YEAR);
		 */

	}

	void incrementarAño(int cantidad) {
		/*
		 * que incrementa la fecha del calendario en el número de años especificados,
		 * salvo que el año resultante sea el 0 (que no existió).
		 */
		if (this.anyo > 0)
			this.anyo += cantidad;
		/*
		 * c.add(Calendar.YEAR, cantidad); this.dia = c.get(Calendar.DATE); this.mes =
		 * c.get(Calendar.MONTH); this.anyo = c.get(Calendar.YEAR);
		 */
	}

	boolean iguales(Calendario otraFecha) {
		boolean esIgual = false;
		/*
		 * que determina si la fecha invocante y la que se pasa como parámetro son
		 * iguales o distintas.
		 */

		if (otraFecha.anyo == this.anyo && otraFecha.mes == this.mes && otraFecha.dia == this.dia)
			esIgual = true;

		return esIgual;
	}

	// void mostrar muestra la fecha por consola.
	public void mostrarFecha() {
		System.out.println(" dia: " + this.dia + " mes: " + this.mes + " año: " + this.anyo);
	}

}
