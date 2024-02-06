package ud02;

public class Rebajas {
	
	double precioRebajado, precioOriginal;
	
	public Rebajas () {
	}
	public Rebajas(double precioRebajado, double precioOriginal) {
		this.precioRebajado = precioRebajado;
		this.precioOriginal = precioOriginal;
	}
	public double porcentajePrecioFinal(double precioRebajado, double precioOriginal) {
		return (precioOriginal-precioRebajado)/precioOriginal;
	}
	public static void main (String [] args) {

		Rebajas reb1 = new Rebajas();
		double jersey = reb1.porcentajePrecioFinal(50, 200);
		System.out.println("El precio del jersey se ha rebajado al " + String.format("%.0f%%\n", jersey*100));
	}
}
