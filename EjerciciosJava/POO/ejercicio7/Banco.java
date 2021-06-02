//	Luis Miguel Rubio Toledo

/*
 * 7. Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central. 
 	Los bancos tienen las siguientes restricciones: 

 * Siempre tienen que tener un nombre, que no puede ser modificado. 
 * Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros al crearse.
 * El capital y la dirección de un banco son modificables. 
 
 * 
 */

package ejercicio7;

public class Banco {
	
	private final String nombre;
	private String direccion;
	private double capital;
	/**
	 * @param nombre
	 * @param direccion
	 * @param capital
	 */
	Banco(String nombre){
		this.nombre = nombre;
		this.direccion = "";
		this.capital = 5200000;  //5.2 millones de euros al crearse.
	}
	
	public Banco(String nombre, String direccion) {
		this(nombre);
		this.direccion = direccion;
	}
	
	public Banco(String nombre, double capital) {
		this(nombre);
		this.capital = capital;
	}
	
	public Banco(String nombre, String direccion, double capital) {
		this(nombre, direccion);
		this.capital = capital;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public  double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
}
