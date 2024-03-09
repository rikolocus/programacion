package videojuego;

public class Juego {

	protected String titulo;
	protected String fabricante;
	protected int año;
	
	//Constructor
	public Juego (String t, String f, int a) {
		titulo = t;
		fabricante = f;
		año = a;
	}
	//Getter
	public String getTitulo() {
		return titulo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public int getAño() {
		return año;
	}
	
	//Datos juego
	@Override
	public String toString() {
		return "Título: " + this.titulo + "\nFabricante: " + this.fabricante + "\nAño\n" ;
	}
	//Compruebo que no existe ya el videjuego
	public boolean equals (Object o) {
		if (o == this) {
			return true;
		}
		if (o == null || getClass()!= o.getClass()) {
			return false;
		}
		final Juego juego1= (Juego)o;
		return this.titulo.equals(juego1.titulo) && this.año == juego1.año;
	}
	//Ordenación de los títulos ****** revisar este compare
	public int compareTo (Juego o) {
		int tituloCompare = this.titulo.compareTo(o.titulo);
		if (tituloCompare==0) {
			int fabricanteCompare = this.fabricante.compareTo(o.fabricante);
			if (fabricanteCompare==0) {
				return Integer.compare(this.año, o.año);
			}
		return fabricanteCompare;
		}
		return tituloCompare;
	}

	public static void main(String[] args) {
		Juego juego1 = new Juego ("hola", "hola", 1950);
		Juego juego2 = new Juego ("hola", "hola", 1952);
		Juego juego3 = new Juego ("hola", "pepe", 1953);
		Juego juego4 = new Juego ("pico", "pepe", 1954);
		Juego juego5 = new Juego ("leches", "hola", 1950);
		System.out.println(juego1.compareTo(juego2));
		System.out.println(juego3.compareTo(juego2));
		System.out.println(juego5.compareTo(juego2));
		System.out.println(juego4.compareTo(juego2));
		System.out.println(juego1.compareTo(juego5));
		
		
	}
}