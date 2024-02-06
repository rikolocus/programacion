package ud03;

import java.util.*;

public class Actividad13 {

	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int N = tec.nextInt();
		int contador = 1;
		while (N>contador) {
			
			System.out.print(contador+"\n");
			contador++;
			
		}
		System.out.print(N);
		tec.close();
	}
	
	
}
