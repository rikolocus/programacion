package ud03;

import java.util.*;

public class Actividad15 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int contador=1;
		int suma = 0;
		
		while (contador<=15){
			System.out.print("Introduzca un número: ");
			int i= tec.nextInt();
			suma +=i;
			contador++;
		}
		System.out.println("La suma de los números introducidos por el usuario es: " + suma);
		tec.close();
	}

}
