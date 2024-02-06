package ud01;

import java.util.*;

public class Actividad03 {

	// Este programa calcula el área de un rectángulo;
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		double a, b;
		System.out.println("Calcule el área de un rectángulo.");
		System.out.print("Introduzca la base en metros: ");
		a = tec.nextDouble();
		System.out.print("Introduzca la altura en metros: ");
		b = tec.nextDouble();
		double c = a*b;
		System.out.println("El área de " + a + " X " + b + " es " + c + " metros cuadrados.");
		tec.close();
	}
}
