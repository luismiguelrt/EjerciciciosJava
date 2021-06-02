//  Luis Miguel Rubio Toledo

package EjerciciosAvanzados7;

import java.util.LinkedList;
import java.util.Queue;

public class MainCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stack<Integer> pila = new Stack<>();  
		//PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
		Queue<Integer> cola = new LinkedList<Integer>();
		//Queue<Integer> cola = new PriorityQueue<Integer>();
		//Queue<Integer> cola = new Queue<>();
		ColaTabla miCola = new ColaTabla();
		
		System.out.println("cola normal: " + cola.isEmpty());
		System.out.println("mi cola: " + miCola.isEmpty());
		
		cola.add(3);
		cola.add(4);
		cola.add(5);
		cola.add(7);
		cola.add(8);
		cola.add(200);
		cola.add(100);
		
		
		miCola.encolar(3);
		miCola.encolar(4);
		miCola.encolar(5);
		miCola.encolar(7);
		miCola.encolar(8);
		miCola.encolar(200);
		miCola.encolar(100);
		
		System.out.println();
		System.out.println("queue: "+ cola.toString() + "  " + cola.isEmpty() + " peek --> " + cola.peek());
		System.out.println("mi cola: "+ miCola.toString() + "  " + miCola.isEmpty()  + " peek --> " + miCola.peek());
		
		cola.poll();
		//cola.poll();
		miCola.desencolan();
		System.out.println("cola normal " + cola.toString());
		System.out.println(miCola.toString());
		
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		miCola.desencolan();
		System.out.println(miCola.toString());
		

	}

}
