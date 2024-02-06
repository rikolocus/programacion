package ud01;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce un número con decimales: ");
		double a = tec.nextDouble();
		System.out.print("El número " + a + ",redondeado a un decimal es " + Math.round(a*10.0)/10.0);
		tec.close();
	}
}
