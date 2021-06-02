//Luis Miguel Rubio Toledo

/*
 * 4. Las listas son estructuras dinámicas de datos, donde se pueden insertar o 
  	eliminar elementos de un determinado tipo sin limitación de espacio. 
  	Implementar la clase Lista correspondiente a una lista de números de la clase Integer. 
  	Los números se guardarán en una tabla. 
  	Cuando falte espacio para un nuevo elemento, la tabla se redimensionará, incrementando la capacidad de la lista. 
  	Entre los métodos de la clase, se incluirán: 

 *	Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números, 
 	y otro al que se le pasa como argumento el tamaño inicial de la tabla. 
 *	Obtener el número de elementos insertados en la lista. 
 *	Insertar un número al final de la lista. 
 *	Insertar un número al principio de la lista. 
 *	Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro. 
 *	Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
 *	Eliminar un elemento cuyo índice en la lista se pasa como parámetro. 
 *	Obtener el elemento cuyo índice se pasa como parámetro. 
 *	Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolver -1. 
 *	Representar la lista con una cadena de caracteres. 
 */
package EjerciciosAvanzados4;

import java.util.Arrays;

public class Lista {

	private int numero[] ; // tabla = array
	private int size;
	private int cursor;
	//transient Object[] elementData;

	// TODO Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números, 
	/**
	 * @param numero
	 */
	Lista() {
		//this.numero = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		//this.numero = new int[10];
		this(10);
	}
	
	// private static final int[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	
 	//  otro al que se le pasa como argumento el tamaño inicial de la tabla. 
	Lista(int numero) {
		this.size = numero;
		this.numero = new int[size];
		this.cursor = 0;
	}
	
	//  Obtener el número de elementos insertados en la lista. 
	public int size() {
		return cursor;
	}
	
	public int length() {
		return numero.length;
	}
	
	//  Insertar un número al final de la lista. 
	public void add(int num) {
		if(this.cursor < this.size){
			this.numero[this.cursor] = num;
			
		}else {
			this.size++;
			int[] aux = new int[size];
			
			for (int i = 0; i < size(); i++) {
				aux[i] = this.numero[i];
			}
			this.numero = new int[size];
			for (int i = 0; i < aux.length; i++) {
				this.numero[i] = aux[i];
			}
			this.numero[cursor] = num;
			
		}
		this.cursor++;
	}
	
	//  Insertar un número al principio de la lista. 
	public void addFirt(int num) {
		
		this.size++;
			int[] aux = new int[size];
			aux[0] = num;
			for (int i = 0; i < size(); i++) {
				aux[i+1] = this.numero[i];
			}
			
			this.numero = new int[size];
			for (int i = 0; i < aux.length; i++) {
				this.numero[i] = aux[i];
			}
			
			this.cursor++;
	}
	
	//  Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro. 
	public void add(Lista num) {
		
		size += num.size();
		int[] aux = new int[size];

		for (int i = 0; i < size(); i++) {
			aux[i] = this.numero[i];
		}

		for (int i = size(); i < aux.length; i++) {
			aux[i] = num.get(i-size());
		}
		cursor += num.size();
		
		this.numero = new int[size];
		for (int i = 0; i < aux.length; i++) {
			this.numero[i] = aux[i];
		}
		
	}
	
	//  Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
	public void add(int num, int indice) {

		if(indice < size) {
			size++;
			int[] aux = new int[size];
			
			for (int i = 0; i < indice; i++) {
				aux[i] = this.numero[i];
				
			}
			
			aux[indice] = num;
			for (int i = indice+1; i < aux.length; i++) {
				aux[i] = this.numero[i-1];
				
			}

			this.numero = new int[size];
			for (int i = 0; i < aux.length; i++) {
				this.numero[i] = aux[i];
			}
			if(cursor < indice)
				cursor = (indice + 1);
			else
				cursor++;
		}


	}

	
	//  Eliminar un elemento cuyo índice en la lista se pasa como parámetro. 
	public void remove(int indice) {
		if(indice < size) {
			size--;
			int[] aux = new int[size];
			//cursor = size();
			for (int i = 0; i < indice; i++) {
				aux[i] = this.numero[i];
				
			}
			
			for (int i = indice; i < aux.length; i++) {
				aux[i] = this.numero[i+1];
				
			}
			
			this.numero = new int[size];
			for (int i = 0; i < aux.length; i++) {
				this.numero[i] = aux[i];
			}
			
			cursor--;
		}


	}
	
	//  Obtener el elemento cuyo índice se pasa como parámetro. 
	public Integer get(int i) {
		if(i >= 0 && i < size())
			return numero[i];
		else
			return null;
		//return numero[i];
	}
	
	//  Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolver -1. 
	public int find(int num) {

		int indice = 0;
		boolean existe = false;
		for (int i = 0; i < numero.length; i++) {
			if(num == numero[i] && !existe) {
				indice = i;
				existe = true;
			}
			if(!existe) {
				indice = -1;
			}
		}
		return indice;
	}
	
	//  Representar la lista con una cadena de caracteres. 
	@Override
	public String toString() {
		
		String aux = "[";
		//String aux = "[";
		if (size() == 0)
			aux += "0]";
		if (size() < size ) {
			for (int i = 0; i < size(); i++) {
				if(i < size()-1)
					aux += this.numero[i] +", ";
				else
					aux += this.numero[i] + "]";
			}
			
		}else
			aux = Arrays.toString(numero);
		
		return aux;
	}

	

}
