package ud01;

import java.util.*;

public class Actividad04 {
	
	// Este programa calcula el área de un triángulo;
	public static void main(String[] args) {
			
		Scanner tec = new Scanner(System.in);
		double a, b;
		System.out.println("Calcule el área de un triángulo.");
		System.out.print("Introduzca la base en metros: ");
		a = tec.nextDouble();
		System.out.print("Introduzca la altura en metros: ");
		b = tec.nextDouble();
		double c = a*b/2;
		System.out.println("El área de un triángulo de base y altura " + a + " X " + b + " es " + c + " metros cuadrados.");
		tec.close();
	}
}
