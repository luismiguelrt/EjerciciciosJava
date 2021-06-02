package ejercicioClaseHerencia;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona implements Visualizar{

	private List<Asignatura> matriculacion;

	public Alumno(){
		super();
		this.matriculacion = new ArrayList<Asignatura>();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param email
	 */
	public Alumno(String nombre, String apellido, String dni, String email, List<Asignatura> matriculacion) {
		super(nombre, apellido, dni, email);
		this.matriculacion = matriculacion;
	}
	/*
	public synchronized List<Asignatura> getMatriculacion() {
		return matriculacion;
	}

	public synchronized void setMatriculacion(List<Asignatura> matriculacion) {
		this.matriculacion = matriculacion;
	}
	 */	

	public boolean matricular(Asignatura asig) {
		//TODO
		boolean matriculado = false;
		/*
		for (final Asignatura asignatura : matriculacion) {
			if(!asignatura.getNombre().equals(asig.getNombre())) {
				matriculado = true;
				matriculacion.add(asig);
			}
		}
		 */

		if (!matriculacion.contains(asig)) {
			matriculacion.add(asig);
			matriculado = true;
		}
		return matriculado;
	}


	@Override
	public void visualizarAsig() {
		// TODO Auto-generated method stub
		for (final Asignatura asignatura : matriculacion) {
			asignatura.visualizar();
		}
		//System.out.println("---------------------------");
		//matriculacion.forEach(room -> System.out.println(room.getNombre()));

	}

	@Override
	public void visualizarAsig(int fecha) {
		// TODO Auto-generated method stub
		for (final Asignatura asignatura : matriculacion) {
			if(fecha == asignatura.getAnyoIni())
				asignatura.visualizar();
		}
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		//System.out.println(this.nombre.substring(0,12) + "\t" + this.apellido.substring(0,12) + "\t" + this.dni.substring(0,10) + "\t" + this.email);
		//System.out.println(this.nombre.format("%-16s", str) + "\t" + this.apellido.substring(0,12) + "\t" + this.dni.substring(0,10) + "\t" + this.email);
		//this.nombre.strip().
		//System.out.println(this.email);
		System.out.println(String.format("%-16s",this.nombre).substring(0,16) + "\t" + String.format("%-16s",this.apellido).substring(0,16) + "\t" + String.format("%-12s",this.dni) + "\t" + this.email);
	}



}
