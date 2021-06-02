//  Luis Miguel Rubio Toledo

/*
 * 7. Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilarse y desapilarse,
  	se encolan y desencolan. La diferencia es que se desencola el primer elemento encolado y no el último, 
  	como en las colas del autobús o del cine. El primero que llega es el primero que sale de la cola 
  	(vamos a suponer que nadie se cuela). Por tanto, los elementos se encolan y 
  	desencolan en extremos opuestos de la estructura, llamados primero 
  	(el que está primero y será el próximo en abandonar la cola) y 
  	último (el que llegó último). Se pide implementar la clase ColaTabla 
  	en la que los elementos Integer encolados se guardan en una tabla. 
 */

package EjerciciosAvanzados7;

import java.util.Arrays;

public class ColaTabla {
	// LIFO integer 

	private int numero[] ; // tabla = array

	ColaTabla() {
		this.numero = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}


	private static final int[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

	public boolean isEmpty() {
		// saber si esta vacio o no la pila
		return numero.length == 0 ? true : false;
	}

	public void encolar(int n) {
		push(n);
	}
	
	private void push(int n) {
		// meter en el array
		int aux[] = new int[size()+1];
		for (int i = 0; i < size(); i++) {
			aux[i] = numero[i];
		}
		aux[size()] = n;

		numero = new int[aux.length];
		for (int i = 0; i < aux.length; i++) {
			numero[i] = aux[i];
		}
	}

	public void desencolan() {
		pop();
	}
	
	private void pop() {
		// sacar del array 
		if(!isEmpty()) {
			int aux[] = new int[size()-1];
			
			for (int i = 0; i < aux.length; i++) {
				aux[i] = numero[i+1];
			}

			numero = new int[aux.length];
			for (int i = 0; i < aux.length; i++) {
				numero[i] = aux[i];
			}
		}
	}

	public Integer peek() {
		// mostrar el ultimo del array 
		if(!isEmpty()) {
			return numero[0];
		}
		return null;
	}

	public int size() {
		// mostrar tamaño de la pila
		return this.numero.length;
	}

	@Override
	public String toString() {
		if(isEmpty())
			return null;
		else
			return Arrays.toString(numero);
	}



	/*
	empty()	boolean	The method checks the stack is empty or not.
	push(E item)	E	The method pushes (insert) an element onto the top of the stack.
	pop()	E	The method removes an element from the top of the stack and returns the same element as the value of that function.
	peek()	E	The method looks at the top element of the stack without removing it.
	search(Object o)	int	The method searches the specified object and returns the position of the object.
	 */


}
