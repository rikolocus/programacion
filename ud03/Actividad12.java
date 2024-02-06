package ud03;

import java.util.*;

public class Actividad12 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int i=0;
		int media =0;
		int contador =0;
		
		while (i>=0) {
			
			System.out.print("Introduzca un número para sacar la media (Para salir ponga un número negativo) ");
			i= tec.nextInt();
			media +=i;
			contador++;
		}
		System.out.println("El promedio de los números introducidos es: " + (media/contador));
		tec.close();
	}
}
