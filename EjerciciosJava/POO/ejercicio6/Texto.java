package ejercicio6;


/*
 * 6. Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características: 

	La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor. 
	Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible. 
	Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido. 

	Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto. 
 */

public class Texto {

	private final int longitud;
	// private char[] cadena;
	private String texto;

	//private final static char[] vocalesMinusculas = {'a', 'e', 'i', 'o', 'u' };
	//private final static char[] vocalesMayusculas = {'A', 'E', 'I', 'O', 'U' };

	Texto(int longitud) {
		this.longitud = longitud;
		this.texto = "";
		// this.cadena = new char[this.longitud];

	}
	
	public String getTexto() {
		return texto;
	}

	private void setTexto(String texto) {
		if (texto.length() <= longitud) 
			this.texto = texto;
	}
	/*
	public char[] getCadena() {
		return cadena;
	}

	public void setCadena(char[] cadena) {
		if(cadena.length <= this.longitud)
			this.cadena = cadena;
	}
	 */

	public void concatInicio (String texto) {

		int tamanio = texto.length()+this.texto.length();
		String aux = "";
		if (tamanio <= longitud) {
			System.out.println("entro");
			aux = texto + this.texto;
			setTexto(aux);
		}
	}

	public void concatFinal (String texto) {
		int tamanio = texto.length()+this.texto.length();
		String aux = "";
		if (tamanio <= longitud) {
			//System.out.println("entro");
			aux = this.texto + texto;
			setTexto(aux);
		}
	}

	public int contarVocales() {
		int contador = 0;
		for (int i = 0; i < this.texto.length(); i++) {

			switch (texto.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				contador++;
				break;
			}
		}
		return contador;
	}

}