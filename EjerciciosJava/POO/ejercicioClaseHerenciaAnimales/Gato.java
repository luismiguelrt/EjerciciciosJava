//  Luis Miguel Rubio Toledo

/*
 * 	Respecto a la clase Gato:
    • Hereda de Animal y sus atributos son vista, oído, reflejos (enteros del 1 al 100) 
    	y vidas (entero inicializado al valor 7).
    • Implementa el método int escapar() que devuelve la habilidad de escape del gato, 
    	siendo el valor devuelto la media de sus atributos.
 */
package ejercicioClaseHerenciaAnimales;

public class Gato extends Animal implements Comparable<Gato>{
	private int vista, oido, reflejos, vidas = 7;

	/**
	 * CONSTRUCTORES
	 */
	public Gato() {
		super("","");
		this.setVista(0);
		this.setOido(0);
		this.setReflejos(0);
		//this.setVidas(7);
	}
	/**
	 * @param nombre
	 * @param raza
	 */
	public Gato(String nombre, String raza) {
		this();
		super.nombre = nombre;
		super.raza = raza;
	}

	public Gato(int vista, int oido, int reflejos) {
		super("","");
		if( vista >= 0 && vista <= 100)
			this.setVista(vista);
		if( oido >= 0 && oido <= 100)
			this.setOido(oido);
		if( reflejos >= 0 && reflejos <= 100)
			this.setReflejos(reflejos);

		//this.setVidas(7);
	}

	public Gato(String nombre, String raza, int vista, int oido, int reflejos) {
		this( vista, oido, reflejos);
		super.nombre = nombre;
		super.raza = raza;
	}

	/**
	 * GETTERS Y SETTERS
	 */
	public  int getVista() {
		return vista;
	}
	public  void setVista(int vista) {
		if( vista >= 0 && vista <= 100)
			this.vista = vista;
	}
	public int getOido() {
		return oido;
	}
	public void setOido(int oido) {
		if( oido >= 0 && oido <= 100)
			this.oido = oido;
	}
	public int getReflejos() {
		return reflejos;
	}
	public void setReflejos(int reflejos) {
		if( reflejos >= 0 && reflejos <= 100)
			this.reflejos = reflejos;
	}
	public int getVidas() {
		return vidas;
	}
	/*
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	 */

	public int escapar() {
		return (this.vista + this.oido + this.reflejos) / 3;
	}

	public void pierdeVida() {
		if (getVidas() > 0)
			this.vidas--;
		else {
			System.err.println("error");
		}
	}

	@Override
	public void visualizar() {
		String visualiza = "Gato " +  super.nombre +  " [vista=" + vista + ", oido=" + oido 
				+ ", reflejos=" + reflejos + ", vidas=" + vidas + "] media: " + escapar();
		System.out.println(visualiza);
		//System.out.println("media del gato: " + escapar());
	}

	@Override
	public String toString() {
		return "Gato " +  super.nombre +  " [vista=" + vista + ", oido=" + oido + ", reflejos=" + reflejos + ", vidas=" + vidas + "]";
	}

	@Override
	public int compareTo(Gato otroGato) {

		if(this.vidas < otroGato.vidas) {
			return 1;
		}
		else if(this.vidas == otroGato.vidas) {
			return 0;
		}
		else {
			return -1;
		}
		// return (this.vidas - otroGato.vidas);
	}
}
