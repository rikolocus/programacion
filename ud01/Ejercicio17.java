package ud01;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// E = m*c*c, c = 2.997925e8
		double c = 2.997925e8;
		Scanner tec = new Scanner (System.in);
		System.out.print("Introduzca la masa del cuerpo en kg: ");
		double masa = tec.nextDouble(), energia = masa*c*c;
		System.out.println("La energía es: " + String.format("%.2f julios", energia));
		tec.close();
	}
}
