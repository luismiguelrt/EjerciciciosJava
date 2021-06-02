package ejercicioClaseHerencia;

import java.util.regex.Pattern;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String email;

	public Persona(){
		this("", "", "", "");
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param email
	 */
	public Persona(String nombre, String apellido, String dni, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		setDni(dni);
		setEmail(email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(comprobarDNI(dni))
			this.dni = dni;
		else {
			this.dni = "";
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (validarEmail(email))
			this.email = email;
		else {
			this.email = "";
		}
	}

	public boolean comprobarDNI(String dni) {
		ValidadorDNI valida = new ValidadorDNI(dni);
		return valida.validar();
	}

	private boolean validarEmail (String miEmail) {
		// Patrón para validar el email
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		return pattern.matcher(miEmail).matches();

	}


}
