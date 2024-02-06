package ud01;

import java.util.*;

public class Actividad05 {

	// Este programa calcula el sueldo de un empleado;
	public static void main(String[] args) {
				
		Scanner tec = new Scanner(System.in);
		int a, b;
		System.out.println("Calcule el importe a abonar a su empleado.");
		System.out.print("Introduzca el número de horas semanales: ");
		a = tec.nextInt();
		b = a * 12;
		System.out.print("El importe a abonar por " + a + " horas es: " + b + " euros.");
		tec.close();
	}
}