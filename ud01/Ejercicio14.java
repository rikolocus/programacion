package ud01;

import java.util.*;

public class Ejercicio14 {

	public static void main (String []args) {
		Scanner tec = new Scanner (System.in);
		System.out.print("Introduce un número entero: ");
		int a = tec.nextInt(), c = 10;
		int b = a%100/c;
		System.out.print("La penúltima cifra de " + a + " es " + b);
		tec.close();
	}
}
