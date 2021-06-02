package ejercicioClaseHerencia.v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona implements Visualizar, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1617312332329951274L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String direccion;
	List<Asignatura> imparte;

	/**
	 * 
	 */
	public Profesor() {
		super();
		this.imparte = new ArrayList<Asignatura>();
		this.direccion = "";
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param email
	 */
	public Profesor(String nombre, String apellido, String dni, String email, String direccion, List<Asignatura> imparte) {
		super(nombre, apellido, dni, email);
		this.direccion = direccion;
		this.imparte = imparte;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/*
	public synchronized List<Asignatura> getImparte() {
		return imparte;
	}

	public synchronized void setImparte(List<Asignatura> imparte) {
		this.imparte = imparte;
	}
	 */	
	public boolean asignar(Asignatura asig) {
		boolean matriculado = false;
		/*
		for (final Asignatura asignatura : matriculacion) {
			if(!asignatura.getNombre().equals(asig.getNombre())) {
				matriculado = true;
				matriculacion.add(asig);
			}
		}
		 */

		if (!imparte.contains(asig)) {
			imparte.add(asig);
			matriculado = true;
		}
		return matriculado;
	}

	@Override
	public void visualizarAsig() {
		for (final Asignatura asignatura : imparte) {
			asignatura.visualizar();
		}
		//System.out.println("---------------------------");
		//matriculacion.forEach(room -> System.out.println(room.getNombre()));

	}

	@Override
	public void visualizarAsig(int fecha) {
		for (final Asignatura asignatura : imparte) {
			if(fecha == asignatura.getAnyoIni())
				asignatura.visualizar();
		}
	}

	@Override
	public void visualizar() {
//		System.out.println(this.nombre.substring(0,12) + "\t" + this.apellido.substring(0,12) + "\t" + this.dni.substring(0,10) + "\t" + this.email);
//		System.out.println(this.nombre.substring(0,16) + "\t" + this.apellido.substring(0,12) + "\t" + this.dni.substring(0,10) + "\t" + this.email);
//		this.nombre.strip();
		//System.out.println(super.nombre);
		System.out.println(	String.format("%-16s",this.nombre).substring(0,16) + "\t" + 
							String.format("%-16s",this.apellido).substring(0,16) + "\t" + 
							String.format("%-12s",this.dni) + "\t" + 
							String.format("%-24s",this.email).substring(0,24) + "\t" + 
							String.format("%-24s",this.direccion).substring(0,24));
	}
/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [direccion=");
		builder.append(direccion);
		builder.append(", imparte=");
		builder.append(imparte);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
*/




}
