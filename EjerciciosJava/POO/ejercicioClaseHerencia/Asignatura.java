package ejercicioClaseHerencia;



public class Asignatura {

	private String nombre;
	private String curso;
	private int anyoIni;
	private int anyoFin;

	/**
	 * @param nombre
	 * @param curso
	 * @param anyoIni
	 * @param anyoFin
	 */
	public Asignatura(String nombre, String curso, int anyoIni, int anyoFin) {
		this.nombre = nombre;
		this.curso = curso;
		this.anyoIni = anyoIni;
		this.anyoFin = anyoFin;
	}

	public void visualizar() {
		//TODO
		//System.out.println("nombre: " + getNombre() + " curso: " + getCurso());
		//System.out.println("tiempo: " + getAnyoIni() + "/" + getAnyoFin());

		System.out.println(String.format("%-12s",this.nombre).substring(0,12) + "  " + String.format("%-12s",this.curso).substring(0,12) + this.anyoIni + "\t\t" + this.anyoFin);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnyoIni() {
		return anyoIni;
	}

	public void setAnyoIni(int anyoIni) {
		this.anyoIni = anyoIni;
	}

	public int getAnyoFin() {
		return anyoFin;
	}

	public void setAnyoFin(int anyoFin) {
		this.anyoFin = anyoFin;
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		if (nombre != other.nombre)
			return false;
		if (curso != other.curso)
			return false;
		if (anyoIni != other.anyoIni)
			return false;
		if (anyoFin != other.anyoFin)
			return false;
		return true;
	}
	*/
	
	

}
