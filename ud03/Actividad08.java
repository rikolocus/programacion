package ud03;

import java.util.*;

public class Actividad08 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int i;
		
		do {
		System.out.println("Introduzca un número: ");
		
		i=tec.nextInt();
		
		if (i==0) {
			
			System.out.printf("Se termina la secuencia");
			
		} else if (i%2==1) {
				
			System.out.printf("El número %s es impar.\n", i);
			
		} else if (i%2==0){
			
			System.out.printf("El número %s es par.\n", i);
		}
		
		}while (i !=0);
		tec.close();
	}
}
