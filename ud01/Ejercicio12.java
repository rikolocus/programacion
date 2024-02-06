package ud01;

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random dado = new Random();
		
		int d1 = 1, d2 = 2, r1 = dado.nextInt(6) + 1, r2 = dado.nextInt(6) + 1, p = r1 + r2;
		
		System.out.println("Dado " + d1 + " : " + r1);
		System.out.println("Dado " + d2 + " : " + r2);
		System.out.println("La puntuación total es: " + p);
	}
}
