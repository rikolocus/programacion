package ud4;

import java.util.*;

public class Ejercicio01 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		double altura[] = new double[5];
		
		for (int i=0;i<altura.length; i++) {
			System.out.print("Introduzca altura de la persona en metros:");
			altura[i] = tec.nextDouble();
		
		}
		for (int j=1; j<=altura.length; j++) {
			System.out.printf("Persona %s: %s metros\n",j,altura[(j-1)]);
		}
		tec.close();
	}
}
