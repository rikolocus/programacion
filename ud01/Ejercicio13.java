package ud01;

import java.util.*;

public class Ejercicio13 {

	public static void main (String []args) {
		Scanner tec = new Scanner (System.in);
		System.out.print("Introduce un número entero: ");
		int a = tec.nextInt();
		int b = a%10;
		System.out.print("La última cifra de " + a + " es " + b);
		tec.close();
	}
}