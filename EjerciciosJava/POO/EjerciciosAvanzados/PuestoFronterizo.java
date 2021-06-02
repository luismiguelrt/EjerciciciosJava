//Luis Miguel Rubio Toledo

/*
 * 1. En un puesto fronterizo recogemos diariamente la información referente al tránsito de personas. 
 * Para una persona nos interesa almacenar 
 * su DNI y nombre completo. 
 * Se pide diseñar una aplicación que presente las siguientes opciones: 

	Paso de frontera.
	Mostrar todas las personas. 
	Búsqueda por nombre. 
	Búsqueda por DNI. 
 */
package EjerciciosAvanzados;

public class PuestoFronterizo {

	private String[] nombre;
	private String[] DNI;
	private final int TAMANYO = 200;
	int contador = 0;

	public PuestoFronterizo() {
		this.DNI = new String[TAMANYO];
		this.nombre = new String[TAMANYO];
	}

	public void crearPersonas(String nombre, String DNI) {
		this.DNI[contador] = DNI;
		this.nombre[contador] = nombre;
		contador++;
	}

	public void mostrarPersonas() {
		for (int i = 0; i < contador; i++) {
			System.out.println("nombre: " + nombre[i] + " DNI: " + DNI[i]);
			// System.out.println(DNI[i]);
		}
	}

	private String mostrarPersonas(int contador) {
		String aux;
		aux = "nombre: " + nombre[contador] + " DNI: " + DNI[contador];
		// System.out.println(DNI[i]);
		return aux;
	}

	public void buscarNombre(String nombre) {
		// funcion buscar por nombre (void)
		for (int i = 0; i < contador; i++) {
			if (this.nombre[i].contains(nombre))
				System.out.println(mostrarPersonas(i));
		}
	}

	void buscarDNI(String DNI) {
		// funcion buscar por dni (void)
		for (int i = 0; i < contador; i++) {
			if (this.DNI[i].contains(DNI))
				System.out.println(mostrarPersonas(i));
		}
	}

}
