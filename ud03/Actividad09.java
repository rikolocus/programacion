package ud03;

import java.util.*;

public class Actividad09 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int i;
		int j=0;
				
		do {
		System.out.println("Introduca un número: ");
		i= tec.nextInt();
		
		j++;
		
		}while (i>=0);
		System.out.printf("El número introducido es negativo y ha introducido %s números.", j);
		tec.close();
	}
}
