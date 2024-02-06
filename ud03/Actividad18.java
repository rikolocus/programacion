package ud03;

import java.util.*;

public class Actividad18 {

	public static void main (String [] args) {
		
		Scanner tec =new Scanner(System.in);
		int positivos=0, contadorPositivos=0;
		int negativos=0, contadorNegativos=0;
		int ceros=0;
		for (int i=1; i<=10; i++) {
			
			System.out.print("Introduzca un número: ");
			int numero=tec.nextInt();
			
			if (numero<0) {
				negativos += numero;
				contadorNegativos++;
			} else if (numero>0) {
				positivos += numero;
				contadorPositivos++;
			} else {
				ceros++;
			}
		}
		tec.close();
		System.out.printf("La media de los números positivos es: %s.\nLa media de los números negativos es: %s.\nSe han introducido %s ceros.", (positivos/contadorPositivos), (negativos/contadorNegativos), ceros);
	}
	
}
