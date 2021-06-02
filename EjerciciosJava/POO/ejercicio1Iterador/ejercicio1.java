//  Luis Miguel Rubio Toledo

/*
 * Todos los métodos anteriores, en teoría, deberían hacer lo mismo, crear un array/arraylist de
	20 elementos, rellenarlos con: String0, String1, String2, … String19, String20 y, por último,
	mostrar todos los elementos almacenados.

 */

package ejercicio1Iterador;

import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ¿Todos estos métodos funcionan correctamente?
		 	no
		 *  ¿Cuáles presentan comportamientos incorrectos?
		 	los foreach
		 *   ¿A qué es debido esto? 
		 	porque solo recorren
		 *   ¿Cómo se podría solucionar?
		 	haciendo un for normal
		 */
		
//		System.out.println("pruebaArrayFor()");
//		pruebaArrayFor();
//		System.out.println("-------------------------------");
		
		
		System.out.println("pruebaArrayForEach()"); // no va
		pruebaArrayForEach();
		System.out.println("-------------------------------");
		
//		System.out.println("pruebaArrayListFor()");
//		pruebaArrayListFor();
//		System.out.println("-------------------------------");
		
//		System.out.println("pruebaArrayListForIni()"); //  no va
//		pruebaArrayListForIni();
//		System.out.println("-------------------------------");
		
//		System.out.println("pruebaArrayListForEach()"); //no va
//		pruebaArrayListForEach();
//		System.out.println("-------------------------------");
		
//		System.out.println("pruebaArrayListIterator()"); // no va
//		pruebaArrayListIterator();
//		System.out.println("-------------------------------");

	}

	private static void pruebaArrayFor()
	{
		String array[]=new String[20];
		for(int i=0; i<array.length; i++)
			array[i]="String"+i;
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}
	private static void pruebaArrayForEach()
	{
		String array[]=new String[20];
		int i=0;
		for(String actual:array)
			actual="String"+(i++);
		for(String actual:array)
			System.out.println(actual);
	}
	
	private static void pruebaArrayForEach2()
	{
		String array[]=new String[20];
		int i=0;
		for(String actual:array)
			actual="String"+(i++);
		for(String actual:array)
			System.out.println(actual);
	}
	
	
	private static void pruebaArrayListFor()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++)
			miArrayList.add("String"+i);
		for(int i=0; i<miArrayList.size(); i++)
			System.out.println(miArrayList.get(i));
	}
	private static void pruebaArrayListForIni()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		for(int i=0; i<20; i++)
		{
			String actual=miArrayList.get(i);
			actual="String"+i;
		}
		for(int i=0; i<miArrayList.size(); i++)
			System.out.println(miArrayList.get(i));
	}
	private static void pruebaArrayListForEach()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		int i=0;
		for(String actual:miArrayList)
			actual="String"+(i++);
		for(String actual:miArrayList)
			System.out.println(actual);
	}
	private static void pruebaArrayListIterator()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		int i=0;
		Iterator<String> itInicio=miArrayList.iterator();
		while(itInicio.hasNext())
		{
			String actual=itInicio.next();
			actual="String"+(i++);
		}
		Iterator<String> it=miArrayList.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}


}
