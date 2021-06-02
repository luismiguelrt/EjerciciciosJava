//  Luis Miguel Rubio Toledo

/*
 * 9. Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias: 
 	en primer lugar, en una lista puede haber elementos repetidos, mientras que en un conjunto, no. 
 	Además, en una lista el orden de inserción de los elementos puede ser relevante, 
 	mientras que en un conjunto solo interesa si un elemento pertenece o no al conjunto y no el lugar que ocupa. 
 	Se pide implementar la clase Conjunto utilizando una lista para almacenar números Integer.
 	En particular, implementar los siguientes métodos: 






	Eliminar del conjunto los elementos de otro que se pasa como parámetro. 
	Decir si un elemento que se le pasa como parámetro pertenece o no al conjunto. 
	Representar el conjunto con una cadena de caracteres.
 */

package EjerciciosAvanzados9;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
	private List<Integer> miLista;
	private final int tamanyo = 10;


	//  Dos constructores: , 

	/**
	 * uno por defecto que cree la lista con capacidad para 10 números
	 * @param miLista 
	 */
	public Conjunto() {
		//this.tamanyo = 10;
		this.miLista = new ArrayList<Integer>(tamanyo);
	}
	/**
	 * @tamanyo --> se le pasa como argumento el tamaño inicial de la lista. 
	 * @param miLista 
	 */

	public Conjunto(int tamanyo) {
		this.miLista = new ArrayList<Integer>(tamanyo);
	}

	//  Obtener el número de elementos insertados en el conjunto. 
	public int size() {
		return this.miLista.size();
	}

	//	Insertar un número en el conjunto. Si ya estaba, no se inserta. 
	public boolean add(int numero){
		if(!this.miLista.contains(numero)) {
			this.miLista.add(numero);
			return true;
		}

		return false;
	}

	//	Añadir al conjunto los elementos de otro que se pasa como parámetro.
	public boolean add(List<Integer> obj) {
		Conjunto C = new Conjunto();
		List<Integer> aux = new ArrayList<Integer>();

		for (Integer integer : obj) {
			if(!this.miLista.contains(integer)) {
				C.add(integer);
			}
		}
		
		for (int i = 0; i < C.size(); i++) {
			aux.add(C.get(i));
		}
		if(!aux.isEmpty()) {
			
			this.miLista.addAll(aux);
			return true;
		}
		
		return false;
	}
	private int get(int n) {
		return this.miLista.get(n);
	}
	/*
	private boolean isNum(int num) {
		for (int i = 0; i < this.miLista.size(); i++) {
			if(miLista.get(i) == num)
				this.miLista.remove(i);
		}
	}
	*/
	
	//TODO 
	public boolean add(List<Integer> ... obj) {
		List<Integer> aux = new ArrayList<Integer>();
		Conjunto C = new Conjunto();
		
		for (Integer integer : this.miLista) {
			C.add(integer);
		}
	        
		for (List<Integer> integer : obj) {
			C.add(integer);
		}
		for (int i = 0; i < C.size(); i++) {
			aux.add(C.get(i));
		}
		
		if(!aux.isEmpty()) {
			this.miLista = aux;
			return true;
		}
		return false;
	}

	//	Eliminar un elemento que se pasa como parámetro. Si no estaba, no se hace nada
	public boolean eliminar(int numero){

		for (int i = 0; i < size(); i++) {
			if(this.miLista.get(i) == numero) {
				this.miLista.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(int indice){
		if(indice >= 0 && indice < this.size()) {
			this.miLista.remove(indice);
			return true;
		}

		return false;
	}
	
	public boolean remove(List<Integer> obj){
		List<Integer> aux = new ArrayList<Integer>();

		for (Integer integer : obj) {
			if(!this.miLista.contains(integer)) {
				aux.add(integer);

			}
		}
		if(!aux.isEmpty()) {
			this.miLista.removeAll(aux);
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Conjunto [miLista=" + miLista + "]";
	}


}
