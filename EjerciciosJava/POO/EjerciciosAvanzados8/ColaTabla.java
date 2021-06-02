//  Luis Miguel Rubio Toledo

/*
 
 8. Repetir el problema anterior, usando una Lista para guardar los elementos encolados.
 
 */

package EjerciciosAvanzados8;

import java.util.Arrays;

public class ColaTabla {
	// LIFO integer 

//	private int numero[] ; // tabla = array
	private Lista miLista;

	ColaTabla() {
//		this.numero = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		this.miLista = new Lista();
	}


//	private static final int[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

	public boolean isEmpty() {
		// saber si esta vacio o no la pila
		//return numero.length == 0 ? true : false;
		return miLista.size() == 0 ? true : false;
	}

	public void encolar(int n) {
		push(n);
	}
	
	private void push(int n) {
		// meter en el array
		/*
		int aux[] = new int[size()+1];
		for (int i = 0; i < size(); i++) {
			aux[i] = numero[i];
		}
		aux[size()] = n;

		numero = new int[aux.length];
		for (int i = 0; i < aux.length; i++) {
			numero[i] = aux[i];
		}
		*/
		miLista.add(n);
	}

	public void desencolan() {
		pop();
	}
	
	private void pop() {
		
		// sacar del array 
		/*
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
		*/
		if(!isEmpty()) {
			
			miLista.remove(0);
		}
	}

	public Integer peek() {
		// mostrar el ultimo del array 
		/*
		if(!isEmpty()) {
			return numero[0];
		}
		*/
		if(!isEmpty()) {
			return miLista.get(0);
		}
		return null;
	}

	public int size() {
		// mostrar tamaño de la pila
//		return this.numero.length;
		return this.miLista.size();
	}

	@Override
	public String toString() {
		/*
		if(isEmpty())
			return null;
		else
			return Arrays.toString(numero);
		*/
		if(isEmpty()) {
			return "";
		}else {
			return miLista.toString();
		}
	}



	/*
	empty()	boolean	The method checks the stack is empty or not.
	push(E item)	E	The method pushes (insert) an element onto the top of the stack.
	pop()	E	The method removes an element from the top of the stack and returns the same element as the value of that function.
	peek()	E	The method looks at the top element of the stack without removing it.
	search(Object o)	int	The method searches the specified object and returns the position of the object.
	 */


}
