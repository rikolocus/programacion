package ud03;

import java.util.*;

public class Ejercicio35 {
	
	public static void main(String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int i;
		int suma=0;
		int j;
		
		do {
			System.out.print("Introduzca cinco edades: ");
			suma=0;
			for (j=1; j<=5; j++) {
				i = tec.nextInt();
				suma +=i; 
			}
			System.out.println("La suma de las edades es: " + suma);
		
		}
		while (suma<200);
		
		tec.close();
	}
	
}
