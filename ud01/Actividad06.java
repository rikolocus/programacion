package ud01;

import java.util.*;

public class Actividad06 {
	
	// Conversor de MiB a KiB
	public static void main (String[] args) {
	
		Scanner tec = new Scanner(System.in);
		double a, b;
		System.out.println("Convierta MiB en KiB.");
		System.out.print("Introduzca MiB: ");
		a = tec.nextDouble();
		b = a * 1024;
		System.out.print(a + " Mebibytes son: " + b + " Kibibytes.");
		tec.close();
	}
}
