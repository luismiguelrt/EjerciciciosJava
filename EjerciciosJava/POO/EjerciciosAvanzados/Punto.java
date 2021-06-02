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

public class Punto {

	// componente x y una componente y

	private double x, y;

	public Punto() {
		this(0, 0);
	}

	public Punto(double x, double y) {
		// construye un objeto con los datos pasados por parámetros.
		this.x = x;
		this.y = y;
	}

	public void desplaza(double dx) {
		// desplaza la componente x la cantidad dx.
		this.x = dx;
	}

	public void desplaza(double dx, double dy) {
		// desplaza ambas componentes las cantidades dx en el eje x y dy en la
		// componente y.
		desplaza(dx);
		this.y = dy;
	}

	public double distanciaEuclidea(Punto otro) {
		// calcula y devuelve la distancia euclídea entre el punto invocante y el punto
		// otro.
		double diferenciaX = this.x - otro.x;
		double diferenciaY = this.y - otro.y;

		// double distanciaEuclidea = Math.sqrt(Math.pow(diferenciaX, 2) +
		// Math.pow(diferenciaY, 2));
		// return distanciaEuclidea;

		return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
	}

	public void muestra() {
		// muestra por consola la información relativa al punto.
		System.out.println("x: " + this.x + "\t y: " + this.y);
	}

	@Override
	public String toString() {
		return "[x=" + this.x + ", y=" + this.y + "]";
	}

}
