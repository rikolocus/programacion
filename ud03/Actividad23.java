package ud03;

import java.util.*;

public class Actividad23 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduzca un número de sueldos a comprobar: ");
		int numero = tec.nextInt();
		double sueldoInicial=0;
		
		for (int i=1; i<numero; i++) {
			
			System.out.print("Introduzca el sueldo: ");
			double sueldo = tec.nextDouble();
			
			if (sueldo>sueldoInicial) {
				sueldoInicial = sueldo;
			}
		}
		tec.close();
		System.out.printf("El sueldo más alto es el de %s euros.", sueldoInicial);
	}

}
