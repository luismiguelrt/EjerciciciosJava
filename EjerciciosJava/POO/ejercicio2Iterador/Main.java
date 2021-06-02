//  Luis Miguel Rubio Toledo

package ejercicio2Iterador;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pruebaIterator();

	}
	
	public static void pruebaIterator()
	{
		String[] mArray=new String[10];
		for(int i=0; i< mArray.length; i++) 
			mArray [i] ="String "+i;
		
		System.out.println("Usando ForEach");
		for(String actual: mArray)
			System.out.println(actual);
		
		System.out.println("Usando iterador propio");
		Iterator<String> it = new IteradorArrayPropio(mArray);
		while(it.hasNext()) 
			System.out.println(it.next());
	}
}
