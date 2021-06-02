//  Luis Miguel Rubio Toledo

/*
 * Respecto a la clase Perro:
    • Hereda de Animal y sus atributos son mordisco, olfato y velocidad (enteros del 1 al 100).
    • Implementa el método boolean cazar(Gato) que devuelve true si el perro consigue cazar al gato 
    	y false en caso contrario. 
    Para calcular dicha circunstancia comparamos la habilidad de caza del perro con la de escapar del gato:
    1. La habilidad de caza del perro corresponde a la media de sus atributos.
    2. La habilidad de escape del gato corresponde a la media de sus atributos 
    	(calculada y devuelta en su método escapar())
    3. Si la habilidad de caza del perro es mayor a la habilidad de escape del gato
     	entonces el perro caza al gato (disminuyéndose una vida al gato). Sino el gato escapa.
 */

package ejercicioClaseHerenciaAnimales;


public class Perro extends Animal implements Comparable<Perro>{
	private int mordisco;
	private int velocidad;
	private int olfato;
	private int gatosCazados = 0;
	private int gatosEscapados = 0;

	/**
	 * CONSTRUCTORES
	 */
	public Perro() {
		super("","");
		this.setMordisco(0);
		this.setVelocidad(0);
		this.setOlfato(0);
		//this.setGatosCazados(0);
	}
	/**
	 * @param nombre
	 * @param raza
	 */
	public Perro(String nombre, String raza) {
		this();
		super.nombre = nombre;
		super.raza = raza;
	}

	/**
	 * @param mordisco
	 * @param velocidad
	 * @param olfato
	 */
	public Perro(int mordisco, int velocidad, int olfato) {
		super("","");
		if( mordisco >= 0 && mordisco <= 100)
			this.mordisco = mordisco;
		if( velocidad >= 0 && velocidad <= 100)
			this.velocidad = velocidad;
		if( olfato >= 0 && olfato <= 100)
			this.olfato = olfato;

		//this.setGatosCazados(0);
	}

	public Perro(String nombre, String raza, int mordisco, int velocidad, int olfato) {
		this( mordisco, velocidad, olfato);
		super.nombre = nombre;
		super.raza = raza;
	}

	/**
	 * GETTERS Y SETTERS
	 */
	public int getMordisco() {
		return mordisco;
	}
	public void setMordisco(int mordisco) {
		if( mordisco >= 0 && mordisco <= 100)
			this.setMordisco(mordisco);
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		if( velocidad >= 0 && velocidad <= 100)
			this.setVelocidad(velocidad); 
	}
	public int getOlfato() {
		return olfato;
	}
	public void setOlfato(int olfato) {
		if( olfato >= 0 && olfato <= 100)
			this.setOlfato(olfato);
	}

	public int getGatosCazados() {
		return gatosCazados;
	}
	/*
	public void setGatosCazados(int gatosCazados) {
		this.gatosCazados = gatosCazados;
	}
	 */
	public int getGatosEscapados() {
		return gatosEscapados;
	}

	public boolean cazar(Gato gato) {

		if(nivelCaza() > gato.escapar()) {
			gato.pierdeVida();
			gatoCazado();
			return true;
		}else {
			gatoEscapado();
			return false;
		}
	}

	public int nivelCaza() {
		return (this.mordisco + this.olfato + this.velocidad)/3;
	}

	@Override
	public void visualizar() {

		String visualiza = "Perro " +  super.nombre + " [mordisco=" + mordisco + ", velocidad=" + velocidad 
				+ ", olfato=" + olfato + ", gatosCazados=" + gatosCazados + ", gatosEscapados=" 
				+ gatosEscapados + "] media: " + nivelCaza();
		System.out.println(visualiza);
		//System.out.println("media del perro: " + nivelCaza());

	}

	private void gatoCazado() {
		this.gatosCazados++;
	}
	private void gatoEscapado() {
		this.gatosEscapados++;
	}

	@Override
	public String toString() {
		return "Perro " +  super.nombre + " [mordisco=" + mordisco + ", velocidad=" + velocidad + ", olfato=" + olfato + ", gatosCazados="
				+ gatosCazados + ", gatosEscapados=" + gatosEscapados + "]";
	}
	
	@Override
	public int compareTo(Perro o1) {
		if(this.gatosCazados < o1.gatosCazados) {
			return 1;
		}
		else if(this.gatosCazados == o1.gatosCazados) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
