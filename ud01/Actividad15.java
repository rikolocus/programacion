package ud01;

import java.util.*;

public class Actividad15 {
	
	// Programa que El resultado será verdadero si el usuario tiene menos de 30 años e ingresa más de 30000 o si es menor o igual a 28 años y tiene un nivel de estudios mayor a 3;
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int edad, nivelEstudios; 
		double ingresos;
		
		System.out.print("Introduza su edad :");
		edad = tec.nextInt();
		System.out.print("Introduzca su nivel de estudios del 1-4: ");
		nivelEstudios = tec.nextInt();
		System.out.print("Introduzca sus ingresos anuales: ");
		ingresos = tec.nextInt();
		
		boolean jasp = (edad < 30 && ingresos > 28000) || (nivelEstudios > 3 && edad <= 28);
		
		System.out.println("¿El usuario tiene <30 años y cobra >28000 euros o tiene <=28 años y su nivel de estudios es >3?\n" + jasp);
		tec.close();
	}
}
