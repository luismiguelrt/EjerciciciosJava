//  Luis Miguel Rubio Toledo

/*
 * En este ejercicio, se pretende crear un iterador de arrays de la clase genérica (T). Para ello, crea
una clase llamada IteradorArrayPropio poniendo que implementa la interfaz Iterator<T>. Esta
clase deberá tener un constructor que reciba un array de tipo T; el código de la clase, será similar
al siguiente: 

 */
package ejercicio2Iterador;

import java.util.Iterator;
public class IteradorArrayPropio<T> implements Iterator<T>
{
	T[] miArray;
	int miIndice;
	
	
	public IteradorArrayPropio(T[] array)
	{
		this.miArray = array;
		this.miIndice = 0;
	}
	
	@Override
	public boolean hasNext()
	{
		/*
		boolean resultado = true;
		try {
			T actual = miArray[miIndice];
		}catch (Exception e) {
			// TODO: handle exception
			resultado = false;
		}
		return resultado;
		*/
		
		return miIndice < miArray.length;
	}
	
	@Override
	public T next()
	{
		/*
		T actual = miArray[miIndice];
		miIndice++;
		return actual;
		*/
		
		return miArray[miIndice++];
	}
}
