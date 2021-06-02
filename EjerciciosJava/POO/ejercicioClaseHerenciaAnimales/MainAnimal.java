//  Luis Miguel Rubio Toledo

/*
 * Se pide implementar las clases en Java, creando además un programa principal en el que:
        ◦ Crear un objeto Perro y otro Gato. Haz que el perro trate de cazar al gato e 
        	imprime por pantalla el resultado de la cacería.
        ◦ Crea un ArrayList de 10 perros y uno de 10 gatos. 
        	Implementa el algoritmo para que cada perro trate de cazar a todos los gatos al menos una vez. 
        	Imprime por pantalla todos los gatos que no hayan sido cazados ni una sola vez. 
        	A continuación, imprime por pantalla los gatos ordenados ascendentemente por su número de vidas.
        ◦ Incluye en los perros un contador de gatos cazados, 
        	imprime por pantalla el listado de perros ordenados descendentemente por el número de gatos cazados.
 */

package ejercicioClaseHerenciaAnimales;

import java.util.ArrayList;
import java.util.*;

public class MainAnimal {

	//	static int gatosMuertos = 0;
	//	static int gatosNoCazados = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro("boby", "galgo", 100, 100, 100);
		Perro perro2 = new Perro(0, 0, 0);
		Gato gato1 = new Gato( 0, 0, 0);
		Gato gato2 = new Gato( 100, 100, 100);

		perro1.visualizar();
		perro2.visualizar();
		gato1.visualizar();
		//		System.out.println(perro1.cazar(gato));
		//		System.out.println(perro2.cazar(gato));

		int nPerros = 10;
		int nGatos = 10;
		System.out.println();
		System.out.println("-----------------------------------------------------------------");

		ArrayList<Perro> misPerros = new ArrayList<Perro>();
		//misPerros.add(new Perro("fifi", "yorsai", 3, 2, 5));
		for (int i = 0; i < nPerros; i++) {
			misPerros.add(new Perro("bob"+i, "galgo", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)));
		}
		misPerros.set(1,perro2);
		misPerros.set(0,perro1);
		//misPerros.add(perro1);

		//System.out.println(misPerros.size());;
		//misPerros.forEach(e -> System.out.println("nivel de caza: " + e.nivelCaza()));
		ArrayList<Gato> misGatos = new ArrayList<>();
		for (int i = 0; i < nGatos; i++) {
			misGatos.add(new Gato("sora"+i, "siames", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)));
		}
		misGatos.set(1,gato1);
		misGatos.set(0,gato2);
		System.out.println();
		//System.out.println(misGatos.size());;


		/*
		for (int i = 0; i < nPerros; i++) {
			for (int j = 0; j < nGatos; j++) {
//				System.out.println("---------");
				if(misGatos.get(j).getVidas() > 0) {
					misPerros.get(i).cazar(misGatos.get(j)) ;
//					System.out.println("perro " + i + " gato " +j + " --> " + misGatos.get(j).getVidas());
				}

//				if(misGatos.get(j).getVidas()== 0)
//					System.err.println("gato muerto");
//				System.out.println("---------");

			}

			System.out.println("gatos cazados del perro nº "+ i +": " + misPerros.get(i).getGatosCazados());
			System.out.println("gatos escapados del perro nº "+ i +": " + misPerros.get(i).getGatosEscapados());
			//System.out.println("vidas nº "+ i +": " + misGatos.get(i).getVidas());
		}
		 */

		for (Perro perro : misPerros) {
			for (Gato gato : misGatos) {
				if(gato.getVidas() > 0) {
					perro.cazar(gato);
					//System.out.println("perro " + i + " gato " +j + " --> " + misGatos.get(j).getVidas());
				}

			}
		}

		System.out.println("PERROS");
		misPerros.forEach(e -> System.out.println(e.toString()));
		System.out.println("--------------------------");
		System.out.println("GATOS");
		misGatos.forEach(e -> System.out.println(e.toString()));
		System.out.println();
		System.out.println();

		Collections.sort(misGatos);
		superGatos(misGatos);

		System.out.println("--------------------------");
		misGatos.forEach(e -> e.visualizar());


		Collections.sort(misPerros);
		System.out.println("--------------------------");
		misPerros.forEach(e -> e.visualizar());
		//Collections.sort(misGatos);
		//misGatos.sort(null);

		/*
		int n = (int) (Math.random() * 100) + 1;
		for (int i = 0; i < 10; i++) {
			n = (int) (Math.random() * 100) + 1;
			System.out.println(n);
		}
		 */
	}

	private static void superGatos(ArrayList<Gato> misGatos) {
		int gatosMuertos = 0;
		int gatosNoCazados = 0;
		System.out.println("----------------------");
		System.out.println("gatos muertos:");
		for (Gato gato : misGatos) {
			if(gato.getVidas() == 0)
			{
				gatosMuertos++;
				gato.visualizar();
			}
		}
		System.out.println("----------------------");
		System.out.println("gatos no cazados:");
		for (Gato gato : misGatos) {
			if(gato.getVidas() == 7)
			{
				gato.visualizar();
				gatosNoCazados++;
			}
		}
		System.out.println("----------------------");
		System.out.println("total muertos " + gatosMuertos);
		System.out.println("total no cazados " + gatosNoCazados);
	}

}
