package ud03;

import java.util.*;

public class Actividad19 {
	
	public static void main (String [] args) {
		
		try (Scanner tec = new Scanner(System.in)) {
			double suma=0;
			int contador, contadorMayores1000=0;
			
			for (contador=1; contador<=10; contador++) {
				
				System.out.print("Introduzca el sueldo del empleado: ");
				double sueldo = tec.nextDouble();
				suma +=sueldo;
				if (sueldo>1000) {
					contadorMayores1000++;
				}
			}
			tec.close();
			System.out.printf("La suma total de los sueldos introducidos es: %s€.\n%s son sueldos mayores a 1000€", suma, contadorMayores1000);
		}
		
	}
}
