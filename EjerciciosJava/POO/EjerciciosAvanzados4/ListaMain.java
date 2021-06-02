package EjerciciosAvanzados4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista miLista1 = new Lista();
		Lista miLista2 = new Lista(20);
		
		ArrayList<Integer> foo = new ArrayList<Integer>(20);
		List otraLista = new ArrayList();
		//foo.add("bla");
		
		
		
		System.out.println("tamaño: " + otraLista.size());
		System.out.println("tamaño: " + foo.size());
		System.out.println("tamaño: " + miLista1.length());
		System.out.println("tamaño: " + miLista2.length());
		
		foo.add(10);
		foo.add(20);
		foo.add(15);
		foo.add(12);
		foo.add(3);
		System.out.println("foo: " + foo.toString());
		
		foo.add(2,200);
		System.out.println("foo: " + foo.toString());
		System.out.println(foo.get(0));
		
		for (int i = 0; i < 10; i++) {
			miLista1.add(i+1);
		}
		
		System.out.println("mi lista: " + miLista1.toString());
		miLista1.add(150,2);
		miLista1.add(33,15);
		miLista1.add(150,6);
		System.out.println("mi lista: " + miLista1.toString());
		
		int indice = miLista1.find(150);
		System.out.println(indice);
		System.out.println(miLista1.find(200));
		System.out.println(miLista1.find(0));
		/*
		miLista1.remove(3);
		miLista1.remove(0);
		miLista1.remove(10);
		miLista1.remove(4);
		
		System.out.println("mi lista: " + miLista1.toString());
		*/
		
		
		/*
		miLista2.add(500);
		miLista2.add(600);
		miLista2.add(700);
		miLista1.add(miLista2);
		System.out.println("mi lista: " + miLista1.toString());
		*/
		//System.out.println("tamaño: " + miLista1.length());
		//System.out.println("tamaño: " + miLista2.length());
		/*
		miLista1.addFirt(200);
		miLista1.addFirt(40);
		miLista1.addFirt(50);
		System.out.println(miLista1.toString());
		
		miLista2.addFirt(20);
		miLista2.addFirt(60);
		miLista2.add(3);
		miLista2.add(5);
		miLista2.add(8);
		miLista2.addFirt(100);
		System.out.println(miLista2.toString());
		*/
		/*
		int[] r1 = new int[10];
		int[] aux = new int[10+1];
		
		for (int i = 0; i < 10; i++) {
			aux[i] = i;
		}
		r1 = new int[10+1];
		for (int i = 0; i < aux.length; i++) {
			r1[i] = aux[i];
		}
		r1[10] = 100;
		System.out.println(Arrays.toString(r1));
*/
	}

}
