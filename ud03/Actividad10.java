package ud03;

import java.util.*;

public class Actividad10 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int numAleatorio = (int) (Math.random()*100)+1;
		do {
		System.out.print("Adivine el número: ");
		int i= tec.nextInt();
			if (numAleatorio>i) {
				System.out.print("El número es  mayor\n");
			} else if (numAleatorio<i) {
				System.out.print("El número es menor\n");
			} else {
				System.out.println("Has adivinado el número");
				break;
			}
		}
		while (true);
		tec.close();
	}
}
