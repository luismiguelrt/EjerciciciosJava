package EjerciciosAvanzados6;

public class MainPilaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaLista miPila = new PilaLista();
		
		System.out.println("mi pila: "+ miPila.toString() + "  " + miPila.empty());
		miPila.apilar(20);
		miPila.apilar(30);
		miPila.apilar(40);
		miPila.apilar(10000);
		System.out.println("mi pila: "+ miPila.toString() + "  " + miPila.empty());
		
		
		System.out.println();
		miPila.desapilar();
		System.out.println("mi pila: "+ miPila.toString() + "  " + miPila.empty());
		System.out.println("mostrar ultimo mi pila: " + miPila.peek());
		miPila.desapilar();
		miPila.desapilar();
		miPila.desapilar();
		miPila.desapilar();
		miPila.desapilar();
		
		
		miPila.desapilar();
		miPila.desapilar();
		System.out.println("mostrar ultimo mi pila: " + miPila.peek());
		System.out.println("mi pila: "+ miPila.size() + "  " + miPila.empty());
		System.out.println(miPila.toString());;

		

	}

}
