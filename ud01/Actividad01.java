package ud01;

import java.util.*;

public class Actividad01 {

	// Esto es un conversor de euros a pesetas;
	public static void main (String[] args) {
		
		Scanner tec = new Scanner(System.in); // Introduce la utilidad de añadir datos;
		double a, b;  // Crea las variables;
		System.out.println("Esto es un convertidor de euros a pesetas.");
		System.out.print("Introduce el importe en euros ");
		a = tec.nextDouble(); // User introduce el importe;
		b = a * 166.3860; // Realiza la conversión;
		int c = (int) b; // Cambia el número real en entero;
		System.out.println(a + " euros son " + c + " pesetas."); // Muestra el resultado;
		tec.close();
	}
}
