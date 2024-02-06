package ud03;

import java.util.*;

public class Actividad21 {

	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduzca un número para mostrar su tabla de multiplicar: ");
		int numero = tec.nextInt();
		
		System.out.printf("Tabla del %s:\n", numero);
		
		for (int i=0; i<=10; i++) {
			
			System.out.printf("%s * %s = %s\n", numero, i, (numero*i));
		}
		tec.close();
	}
}
