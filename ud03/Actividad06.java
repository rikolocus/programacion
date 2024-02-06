package ud03;

import java.util.*;

public class Actividad06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner tec = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.print("Introduzca un número para calcular su cuadrado: ");
			numero = tec.nextInt();
		
			
			if (numero>=0) {
			
				System.out.println("El cuadrado de " + numero + " es " + (numero*numero));
				
			}
		}while (numero>=0);
		
			System.out.println("El número es negativo");
		tec.close();
	}
}
