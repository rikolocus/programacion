package ud01;

import java.util.*;

public class Actividad02 {
	
	// Esto es un conversor de euros a pesetas;
	public static void main (String[] args) {
			
		Scanner tec = new Scanner(System.in); // Introduce la utilidad de añadir datos;
		int a;// Crea las variables;
		System.out.println("Esto es un convertidor de pesetas a euros.");
		System.out.print("Introduce el importe en pesetas ");
		a = tec.nextInt(); // Introduce el importe;
		double b = (double) a; // Convierte un número entero en real;
		b = a / 166.3860; // Realiza la conversión;
		String c = String.format("%.2f", b); // Reduce el número a dos decimales;
		System.out.println(a + " pesetas son " + c + " euros."); // Muestra el resultado;
		tec.close();
	}
}
