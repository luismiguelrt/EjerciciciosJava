//  Luis Miguel Rubio Toledo

/*
 * 	Respecto a la clase Animal, será una clase abstracta y se deben declarar sus atributos
 *  con la visibilidad adecuada para que puedan ser accedidos desde sus subclases. 
 *  Sus atributos son nombre, y raza.
 */
package ejercicioClaseHerenciaAnimales;

public abstract class Animal {
	protected String nombre;
	protected String raza;
	
	
	/**
	 * @param nombre
	 * @param raza
	 */
	public Animal() {
		this.nombre = "";
		this.raza = "";
	}
	
	public Animal(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public abstract void visualizar();
	
}
