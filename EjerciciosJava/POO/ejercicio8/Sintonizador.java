//	Luis Miguel Rubio Toledo

/*
 * 8. Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM; 
 * concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down) 
 * la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
 *  Supondremos que el rango de frecuencias a manejar oscila entre los 80 Mhz y los 108 MHz y que, al inicio, 
 *  el controlador sintonice a 80 MHz. Si durante una operación de subida o bajada se sobrepasa uno de los dos límites, 
 *  la frecuencia sintonizada debe pasar a ser la del extremo contrario. 
 *  Escribir un pequeño programa principal para probar su funcionamiento. 
 */

package ejercicio8;

public class Sintonizador {
		
	private float frecuencia; // 80 Mhz y los 108 MHz
	public Sintonizador() {
		// TODO Auto-generated constructor stub
		frecuencia = 80f;
	}
	
//  permita subir (up) o bajar (down) la frecuencia (en saltos de 0.5 MHz)
	public void up(){
		frecuencia += 0.5;
		if (frecuencia > 108)
			frecuencia = 80f;
	}
	public void down(){
		frecuencia -= 0.5;
		if (frecuencia < 80)
			frecuencia = 108f;
	}
	
	private float getFrecuencia() {
		return frecuencia;
	}
	
	public void display() {
		System.out.println(getFrecuencia());
	}
	
}
