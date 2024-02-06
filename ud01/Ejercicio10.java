package ud01;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main (String[]args) {
		
		final double G = 6.67430e-11;
		Scanner tec = new Scanner (System.in);
		System.out.print("Se va a calcular la fuerza de atracción entre dos cuerpos");
		System.out.print("Introduzca la masa del primer cuerpo (kg): ");
		double m1 = tec.nextDouble();
		System.out.print("Introduzca la masa del segundo cuerpo (kg): ");
		double m2 = tec.nextDouble();
		System.out.print("Introduzca la distancia entre los cuerpos (metros): ");
		double d = tec.nextDouble();
		double F = (G*m1*m2/d*d);
		System.out.print("La fuerza de atracción entre ambos cuerpos es: " + String.format("%.12f N", F));
		tec.close();
	}
}