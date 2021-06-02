//  Luis Miguel Rubio Toledo

package empresaferroviaria;

import java.util.Date;

public class Locomotoras {
	/*	
	 * Locomotoras: disponen de una matrícula (que las identifica), 
	 * la potencia de sus motores y una antigüedad (año de fabricación). 
	 * Además, cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento. 
	 */
	// TODO terminar clase
	protected final String matricula;
	protected float potencia;
	protected Date  antiguedad;
	protected Mecanicos  mecanico;
	
	public Locomotoras(String matricula) {
		// TODO Auto-generated constructor stub
		//this();
		this.matricula = matricula;
		potencia = 0;
		antiguedad = new Date();
		mecanico = new Mecanicos();
	}
	
}
