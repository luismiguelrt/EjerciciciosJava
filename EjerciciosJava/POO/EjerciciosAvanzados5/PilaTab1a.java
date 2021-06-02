//  Luis Miguel Rubio Toledo

/*
 * 5. Una pila es una estructura dinámica de datos donde 
 * los elementos se insertan (se apilan) y se retiran (se desapilan) 
 * siguiendo la norma de que el último que se apila será 
 * el primero en desapilarse, como ocurre con una pila de platos: 
 * cuando vamos a retirar un plato de una pila a nadie se le ocurre tirar de uno de los de abajo; 
 * retiramos (desapilamos) el que está encima de todos, que fue el último en ser apilado. 
 * Se llama cima de la pila al último elemento apilado (o al primer elemento a desapilar). 
 * Las funciones fundamentales de una pila son, por tanto, apilar() y desapilar(). 

	Implementar la clase PilaTab1a para números Integer, donde se usa una tabla para guardar los elementos apilados. 
 */

package EjerciciosAvanzados5;

import java.util.Arrays;

public class PilaTab1a {
	// LIFO integer 

	private int numero[] ; // tabla = array

	PilaTab1a() {
		this.numero = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}


	private static final int[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

	public boolean empty() {
		// saber si esta vacio o no la pila
		return numero.length == 0 ? true : false;
	}

	public void apilar(int n) {
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

	public void desapilar() {
		pop();
	}
	
	private void pop() {
		// sacar del array 
		if(!empty()) {
			int aux[] = new int[size()-1];
			for (int i = 0; i < aux.length; i++) {
				aux[i] = numero[i];
			}

			numero = new int[aux.length];
			for (int i = 0; i < aux.length; i++) {
				numero[i] = aux[i];
			}
		}
	}

	public Integer peek() {
		// mostrar el ultimo del array 
		if(!empty()) {
			return numero[size()-1];
		}
		return null;
	}

	public int size() {
		// mostrar tamaño de la pila
		return this.numero.length;
	}

	@Override
	public String toString() {
		if(empty())
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
