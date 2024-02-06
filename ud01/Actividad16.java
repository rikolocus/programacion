package ud01;

public class Actividad16 {

	//Programa que calcula el importe de un producto;
	public static void main(String[] args) {
		float a, b, c;
		a = 120; // Precio;
		b = a - a*15/100; // Precio-Descuento;
		c = b + b*21/100; // Precio-Decuento+IVA;
		System.out.println("La cazadora tiene un importe de "+ a + " euros sin el descuento y sin IVA.\nDescontándole el 15%, quedaría  " + b + " y sumándole el IVA del 21%, se queda en " +c + " euros.");
	}
}
