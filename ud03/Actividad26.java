package ud03;

import java.util.*;

public class Actividad26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner (System.in);
		int contadorMultiplo3=0;
		
		for (int i=1; i<=5; i++) {
			System.out.print("Introduzca un número: ");
			int numero = tec.nextInt();
			
			if (numero%3==0) {
				contadorMultiplo3++;
			}
		}

		System.out.printf("%s son múltiplo de tres.", contadorMultiplo3);
		tec.close();
	}

}
