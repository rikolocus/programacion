package ud03;

import java.util.*;

public class Actividad11 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int suma = 0;
		int i=1;
		while (i!=0) {
			System.out.print("Introduzca un número (Para salir seleccione el 0): ");
			i = tec.nextInt();
			suma +=i;
		}
		System.out.print("Los números introducidos suman: "+ suma);
		tec.close();
	}
}
