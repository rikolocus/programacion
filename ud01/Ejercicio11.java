package ud01;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner (System.in);
		
		System.out.print("Introduzca el radio de la circunferencia (cm): "); //A = πrr, L = 2πr;
		double r = tec.nextDouble();
		double π = 3.14159265358979323846;
		double A = π*r*r, L = 2*π*r;
		System.out.print("El área de la circunferencia es: " + String.format("%.2f centímetros", A));
		System.out.print("La longitud de la circunferencia es: " + String.format("%.2f centímetros", L));
		tec.close();
	}

}
