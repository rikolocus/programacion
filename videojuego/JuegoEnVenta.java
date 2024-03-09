package videojuego;

public class JuegoEnVenta extends Juego {
	
	private int numCopiasDisponibles;
	private double precio;

	public JuegoEnVenta(String t, String f, int a, double p, int n) {
		super(t, f, a);
		this.numCopiasDisponibles=n;
		this.precio=p;
		// TODO Auto-generated constructor stub
		
	}
	//Metodo venta
	public void vender () {
		if (numCopiasDisponibles>0) {
			numCopiasDisponibles--;
		} else {
			System.out.println("No quedan copias diponibles para la venta");
		}
	}
	
	//Datos venta
	@Override
	public String toString() {
		return super.toString() + "\nPrecio: " + precio + "\nCopias disponibles: " + numCopiasDisponibles;
	}
	

}
