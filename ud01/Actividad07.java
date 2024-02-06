package ud01;

import java.util.*;

public class Actividad07 {
	
	// Conversor de KiB a MiB
	public static void main (String[] args) {
	
		Scanner tec = new Scanner(System.in);
		double a, b;
		System.out.println("Convierta KiB en MiB.");
		System.out.print("Introduzca el número de KiB: ");
		a = tec.nextDouble();
		b = a / 1024;
		System.out.print(a + " Kibibytes son: " + b + " Mebibytes.");
		tec.close();
	}
}