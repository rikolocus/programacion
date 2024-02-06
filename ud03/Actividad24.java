package ud03;

import java.util.*;

public class Actividad24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int contadorNegativo=0;
		for (int i=1; i<=10; i++) {
			System.out.print("Introduzca un número: ");
			int numero = tec.nextInt();
			
			if (numero<0) {
				contadorNegativo++;
			}
		}
		tec.close();
		System.out.printf("Se han introducido %s números negativos.", contadorNegativo);
	}

}
