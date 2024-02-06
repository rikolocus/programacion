package ud03;

import java.util.*;

public class Ejercicio39 {
	
	public static void main(String [] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int N,j;
		System.out.print("Introduzca un número para realizar la tabla de multiplicar: ");
		N=tec.nextInt();
		
			for (int i=1; i<=N; i++) {
				
				System.out.printf("Tabla del %s:\n", i);
				
				for (j=0; j<=10; j++) {
					
					System.out.printf("%s por %s, %s\n", i, j, i*j);
				}
				
			}
		tec.close();
	}
}
