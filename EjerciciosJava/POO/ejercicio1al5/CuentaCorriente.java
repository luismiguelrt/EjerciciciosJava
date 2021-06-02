// Luis Miguel Rubio Toledo

/*
 * 1. Diseñar la clase CuentaCorriente, sabiendo que los datos necesarios son: 
 * 	saldo, límite de descubierto, nombre y DNI del titular. 
 * Las operaciones típicas con una cuenta corriente son: 
 * 
 * Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de -50 euros. 
 * 
 * Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto.
 *  El método debe indicar si ha sido posible llevar a cabo la operación. 
 *  
 *  Ingresar dinero: se incrementa el saldo. 
 *  
 *  Mostrar información: muestra la información disponible de la cuenta corriente. 
 *  
 *  
 *  2. En la clase CuentaCorriente sobrecargar los constructores para que permitan crear objetos: 

·       Solo con el saldo inicial, no serán necesarios los datos del titular. Por defecto el límite de descubierto será 0 euros. 

·       Con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta. 

 *	3. Para la clase CuentaCorriente escribir un programa que compruebe 
 *	el funcionamiento de sus métodos, incluidos los constructores. 
 *
 *	4. Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde lases externas y la visibilidad de sus atributos para que: 

·       saldo y limite no sean visibles para otras clases. 

·       nombre sea público para cualquier clase. 

·       dni solo sea visible por clases vecinas. 

	Realizar un programa para comprobar la visibilidad de los atributos. 
	
 *	5. Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
 * Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente. 
 * Diseñar un método que permita modificar el nombre del banco 
 * (al que pertenecen todas las cuentas corrientes).

 */

package ejercicio1al5;

public class CuentaCorriente {
	
	private static String banco;
	
	private String nombre; 
	String DNI;
	private double saldo;
	private double limite;
	
	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
		nombre = "";
		DNI = "";
		saldo = 0;
		limite = -50;
	}
	
	public CuentaCorriente(String nombre, String DNI){
		this();
		this.nombre = nombre;
		this.DNI = DNI;
	}
	
	public CuentaCorriente(double saldo){
		this();
		this.saldo = saldo;
		this.limite = 0;
	}
	public CuentaCorriente(String DNI, double saldo, double descubierto){
		this(saldo);
		this.DNI = DNI;
		this.limite = descubierto;
	}
	
	static {
		banco = "BANCO";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void setDescubierto(double descubierto) {
		this.limite = descubierto;
	}
	
	private double getDescubierto() {
		return this.limite;
	}
	
	
	public void sacarDinero(double sacarDindero) {
		if(this.limite <= (this.saldo-sacarDindero)) {
			this.saldo -= sacarDindero;
			System.out.println("has sacado: " + sacarDindero);
		}else {
			System.out.println("no es posible sacar dinero");
		}
	}
	
	public void ingresarDinero(double ingresar) {
		this.saldo += ingresar;
	}
	
	public void showInformacion() {
		System.out.println("---------DATOS DE LA CUENTA CORRIENTE DE "+banco+"------------");
		System.out.println("tu nombre es: " + getNombre());
		System.out.println("tu DNI es: " + getDNI());
		System.out.println("tu saldo es: " + getSaldo());
		System.out.println("Máximo descubierto es: " + getDescubierto());
	}

	static String getBanco() {
		return banco;
	}

	static void setBanco(String banco) {
		CuentaCorriente.banco = banco;
	}
	
	 
}
