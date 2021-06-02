//  Luis Miguel Rubio Toledo

/*	Crea una función que reciba una array de dos dimensiones de enteros y devuelva si la matriz es regular o irregular
     * 
     * static boolean esRegular(int[][] miArray) //devuelve true si regular, false si irregular
     * 
     * Crea una función que reciba una array de dos dimensiones de enteros y devuelva si la matriz es cuadrada o no cuadrada
     * 
     * 
     * static boolean esCuadrada(int[][] miArray) //devuelve true si cuadrada, false en caso contrario
     * 
     * Regular -> todas las filas tienen el mismo número de columnas.
     * Cuadrada -> matriz regular con el mismo número de filas y columnas
     *  
     * */
        

package ejercicioFunciones;


public class EjercicioFunciones6 {

	public static void main(String[] args) {
		
		int[][] matriz1= {{0,0}, {1,1}};
        int[][] matriz2= {{0,0, 4, 4}, {2,8, 5, 6}, {45,23, 42, 67}};
        int[][] matriz3= {{1,1}, {0, 1, 2}};
        int[][] matriz4= {{0,0,5}, {2,8}, {45,23, 42,5}};
        
        System.out.print("Regulares: "+esRegular(matriz1)); //true
        System.out.print(" "+esRegular(matriz2)); //true
        System.out.println(" "+esRegular(matriz3)); //false
        System.out.println(" "+esRegular(matriz4)); //false
        
        System.out.print("Cuadradas: "+esCuadrada(matriz1)); //true
        System.out.print(" "+esCuadrada(matriz2)); //false
        System.out.println(" "+esCuadrada(matriz3)); //false
        //System.out.println(" "+esCuadrada(matriz4)); //false

	}

	static boolean esRegular(int[][] miArray){
		int[] aux = new int[miArray.length];
		int aux2 = miArray.length;
		boolean regular = false;
		
		for (int i = 0; i < miArray.length; i++) {
			aux[i] = miArray[i].length;
		}
		
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux.length/2; j++) {
				if(aux[i] == aux[j])
					aux2--;
			}
		}
		if (aux2 == 0)
			regular = true;
		return regular;
	}
	
    static boolean esCuadrada(int[][] miArray) 
    {
    	int[] aux = new int[miArray.length];
		int aux2 = miArray.length;
		int contador = 0;
		boolean esCuadrada = false;
		
		for (int i = 0; i < miArray.length; i++) {
			aux[i] = miArray[i].length;
		}
		for (int i = 0; i < miArray.length; i++) {
				if(aux2 ==  miArray[i].length)
					contador++;
		}
		if (contador == aux2)
			esCuadrada = true;
		return esCuadrada;
    }


	

}
