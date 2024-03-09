package videojuego;

public class JuegoEnAlquiler extends Juego {
	
	private double precio;
	private int numCopiasDisponibles;
	private int numDiasAlquilado;
	
	//Constructor con datos superClase + precio + copias disponibles + dias que se alquilan
	public JuegoEnAlquiler(String t, String f, int a, double p, int n, int d) {
		super(t, f, a);
		precio = p;
		numCopiasDisponibles = n;
		numDiasAlquilado = d;
	}
	
	//Método alquilar
	public void alquilar () {
		if (numCopiasDisponibles>0) {
			numCopiasDisponibles--;
		} else {
			System.out.println("No quedan copias disponibles");
		}
	}
	
	//Método devolver
	public void devolver () {
		numCopiasDisponibles++;
	}
	
	// Datos del juego a devolver
	@Override
	public String toString() {
		return super.toString() + "Precio: " + this.precio + "\nCopias Disponibles: " + this.numCopiasDisponibles + "\nDías de alquiler: "
				+ this.numDiasAlquilado;
	}
}
