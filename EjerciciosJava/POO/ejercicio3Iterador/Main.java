package ejercicio3Iterador;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pruebaIterable();
	}

	public static void pruebaIterable()
	{
		MiArray<String> mArray=new MiArray<String>(new String[10]);
		
		for(int i=0; i<10; i++) 
			mArray.add(i, "String "+(i+1));
		
		System.out.println("Usando ForEach del array");
		for(String actual:mArray.getArray()) 
			System.out.println(actual);
		
		System.out.println("Usando ForEach");
		for(String actual:mArray) 
			System.out.println(actual);
		
		System.out.println("Usando iterador propio");
		Iterator<String> it=mArray.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
	}


}
