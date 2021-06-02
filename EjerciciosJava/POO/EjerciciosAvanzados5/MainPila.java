package EjerciciosAvanzados5;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> pila = new Stack<>();  
		PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
		//Queue<Integer> cola = new Queue<>();
		PilaTab1a miPila = new PilaTab1a();
		
		
		System.out.println("pila normal: " + pila.empty());
		System.out.println("mi pila: " + miPila.empty());
		
		
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.push(7);
		pila.push(8);
		pila.add(200);
		pila.push(100);
		
		System.out.println();
		System.out.println("pila normal: "+ pila.toString() + "  " + pila.empty());
		
		miPila.apilar(3);
		miPila.apilar(4);
		miPila.apilar(5);
		miPila.apilar(7);
		miPila.apilar(8);
		miPila.apilar(200);
		miPila.apilar(100);
		System.out.println("mi pila: "+ miPila.toString() + "  " + miPila.empty());
		
		
		pila.pop();
		pila.pop();
		miPila.desapilar();
		miPila.desapilar();
		
		System.out.println();
		System.out.println("-------------- pop x2 ---------------");
		System.out.println("pila normal: "+ pila.toString() + "  " + pila.empty());
		System.out.println("mi pila: "+ miPila.toString() + "  " + miPila.empty());
		
		System.out.println("mostrar ultimo pila normal: " + pila.peek());
		System.out.println("mostrar ultimo mi pila: " + miPila.peek());
		
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();
		System.out.println("pila normal: "+ pila.toString() + "  " + pila.empty());
		//System.out.println("pila normal: "+ pila.peek());
		
		miPila.desapilar();
		miPila.desapilar();
		miPila.desapilar();
		miPila.desapilar();
		miPila.desapilar();
		System.out.println("mi pila: "+ miPila.toString() + "  " + miPila.empty());
		System.out.println("mi pila: "+ miPila.peek());
		miPila.desapilar();miPila.desapilar();miPila.desapilar();miPila.desapilar();
		
		/*
		cola.add(3);
		cola.add(4);
		cola.add(5);
		cola.add(7);
		cola.add(8);
		cola.add(200);
		cola.add(100);
		System.out.println(cola.peek());
		System.out.println(cola.toString());
		
		miPila.toString();
		System.out.println("tamaño: " + miPila.size());
		*/
		

	}

}
