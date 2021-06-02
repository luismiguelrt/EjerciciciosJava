package EjerciciosAvanzados9;

import java.util.ArrayList;
import java.util.List;

public class MainConjunto {
	public static void main(String[] args) {
		List<Integer> T = new ArrayList<Integer>(10);
		List<Integer> A = new ArrayList<Integer>(10);
		List<Integer> P = new ArrayList<Integer>(10);
		List<Integer> E = new ArrayList<Integer>(10);
		
		
		Conjunto miConjunto = new Conjunto(10);

		System.out.println(T.size());
		
		T.add(12);
		T.add(100);
		T.add(50);
		T.add(04);
		T.add(40);
		
		A.add(52);
		A.add(15);
		A.add(10);
		A.add(82);
		A.add(50);
		
		
		A.add(20);
		A.add(15);
		A.add(50);
		A.add(04);
		A.add(40);
		A.add(40);
		T.forEach(t -> System.out.print(t + " "));
		System.out.println();
		A.forEach(t -> System.out.print(t + " "));
		System.out.println();
		
//		System.out.println(T.containsAll(A));
//		System.out.println(T.contains(A));
		
		//T.addAll(A);
		T.forEach(t -> System.out.print(t + " "));
		System.out.println();;
		miConjunto.add(A);
		
		System.out.println("mi conjunto: "+miConjunto.toString());
		miConjunto.add(T);
		System.out.println("mi conjunto: "+miConjunto.toString());
		System.out.println(miConjunto.size());
		miConjunto.remove(7);
		miConjunto.remove(6);
		miConjunto.remove(3);
		System.out.println("mi conjunto: "+miConjunto.toString());
		
		miConjunto.eliminar(15);
		miConjunto.eliminar(100);
		System.out.println("mi conjunto: "+miConjunto.toString());
		
		P.add(100);
		P.add(500);
		P.add(40);
		E.add(130);
		E.add(40);
		E.add(160);
		E.add(170);
		E.add(1230);
		
		miConjunto.add(T,A,P,E);
		System.out.println("mi conjunto: "+miConjunto.toString());

		
		
	}
}
