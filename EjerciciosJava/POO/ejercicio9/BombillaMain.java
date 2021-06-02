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

public class BombillaMain {
	
	public static void main(String[] args) {
		Bombilla bom1 = new Bombilla();
		Bombilla bom2 = new Bombilla();
		Bombilla bom3 = new Bombilla();
		Bombilla bom4 = new Bombilla();
		
		Bombilla.estadoInterruptor();
		Bombilla.interruptorGeneral();
		Bombilla.estadoInterruptor();
		Bombilla.interruptorGeneral();
		Bombilla.estadoInterruptor();
		
		bom1.interruptor();
		bom1.estadoBombilla();
		bom1.interruptor();
		bom1.estadoBombilla();
		Bombilla.fusibleRoto();
		
		
		bom2.interruptor();
		bom2.estadoBombilla();
		
		Bombilla.estadoInterruptor();
		Bombilla.interruptorGeneral();
		bom3.interruptor();
		bom3.estadoBombilla();
		Bombilla.fusibleReparado();
		Bombilla.estadoInterruptor();
		Bombilla.interruptorGeneral();
		Bombilla.estadoInterruptor();
		
		
		bom2.estadoBombilla();
		bom3.interruptor();
		bom4.interruptor();
		bom3.estadoBombilla();
		bom4.estadoBombilla();
		/*
		bom2.estadoBombilla();
		bom3.estadoBombilla();
		bom4.estadoBombilla();
		*/
	 }
}
