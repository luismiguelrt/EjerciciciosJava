//Luis Miguel Rubio Toledo

/*
 * 3. Escribir la clase Punto que representa un punto de dos dimensiones 
 * (con una componente x y una componente y ), con los métodos:

Punto (double x, double y): que construye un objeto con los datos pasados por parámetros.

void desplaza (double dx): que desplaza la componente x la cantidad dx. 

void desplaza (double dx, double dy): que desplaza ambas componentes las cantidades dx en el eje x y dy en la componente y. 

double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea entre el punto invocante y el punto otro. 

void muestra(): muestra por consola la información relativa al punto. 

 */
package EjerciciosAvanzados;

//	import java.util.Calendar;
//	import java.util.GregorianCalendar;

public class PuntoMain {

	public static void main(String[] args) {

		// Punto(-2, 4) y Punto(2, 4)
		// solucion 4
		Punto p1 = new Punto(-2, 4);
		Punto p2 = new Punto(2, 4);
		double distancia = p1.distanciaEuclidea(p2);

		p1.muestra();
		p2.muestra();
		System.out.println(distancia);

		System.out.println("-------------------------");

		// Punto(-2, 6) y Punto(-5, 2);
		// solucion 5
		p1.desplaza(-2, 6);
		p2.desplaza(-5, 2);
		distancia = p1.distanciaEuclidea(p2);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(distancia);

	}

}
