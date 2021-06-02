//	Luis Miguel Rubio Toledo

/*
 * 9. Modelar una casa con muchas bombillas, 
 * de forma que cada bombilla se pueda encender o apagar individualmente. 
 * Para ello hacer una clase Bombilla con una variable privada que indique si está encendida o apagada, 
 * así como un método que nos diga el estado de una bombilla concreta. 
 * Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las bombillas quedan apagadas. 
   Cuando el fusible se repara, las bombillas vuelven a estar encendidas o apagadas, 
 * según estuvieran antes del percance. 
 * Cada bombilla se enciende y se apaga individualmente, pero solo responde que está encendida 
 * si su interruptor particular está activado y además hay luz general.
 */

package ejercicio9;

public class Bombilla {
	
	private static boolean fusible;
	private static boolean luzGeneral;
	public static int contadorBombillas = 0;
	private boolean estadoBombilla; //variable privada que indique si está encendida o apagada, 
	//boolean ;
	//private String bombilla; //variable privada que indique si está encendida o apagada, 
	
	
	
	Bombilla(){
		estadoBombilla = false;
		luzGeneral = true;
		contadorBombillas++;
		fusible = true;
	}
	
	
	// un método que nos diga el estado de una bombilla concreta.
	public void estadoBombilla() {
		if(estadoBombilla && fusible)
			System.out.println("encendida");
		else
			System.out.println("apagada");
	}
	
	/*
	private boolean estadoEncendida() {
		return estadoBombilla;
	}
	*/
	
	public static boolean fusibleRoto() {
		
		return fusible = false;
	}
	public static boolean fusibleReparado() {
		return fusible = true;
	}
	
	public static boolean interruptorGeneral() {
		if(luzGeneral)
			luzGeneral = false;		
		else
			luzGeneral = true;
		
		return luzGeneral;
	}
	public static void estadoInterruptor() {
		if(luzGeneral && fusible)
			System.out.println("luz encendida");	
		else
			System.out.println("luz apagada");	
		
		//return fusibles;
	}
	
	 public boolean interruptor() {
		 //boolean aux;
		 if(estadoBombilla)
			 estadoBombilla = false;
		 else
			 estadoBombilla = true;
		 //estadoBombilla = aux;
		 return estadoBombilla;
	 }
}
