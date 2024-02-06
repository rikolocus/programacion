package ud01;

import java.util.*;

public class Actividad17 {

	//Programa que calcula la nota necesaria a sacar en el segundo examen para obtener la nota deseada (1ºExamen 40%, 2ºExamen 60%);
	public static void main(String[] args) {
		
		// Introduce la función de entrada de datos;
		Scanner tec = new Scanner(System.in);
		
		// Crea los objetos;
		double notaExamen1, notaNeceExamen2, notaDeseada;
		
		// Introduce la nota del primer examen;
		System.out.print("Introduce la nota del primer examen: ");
		notaExamen1 = tec.nextDouble();
		
		// Introduce la nota deseada;
		System.out.print("¿Qué nota quieres sacar en el trimestre? ");
		notaDeseada = tec.nextDouble();
		
		//Realiza las operaciones en función del valor de cada examen y muestra el resultado;
		notaNeceExamen2 = (notaDeseada - notaExamen1 * 0.4) /0.6;
		String notaFormateada = String.format("%.2f", notaNeceExamen2); // Reduce el número a dos decimales;
		System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un "+ notaFormateada + " en el segundo examen.");
		tec.close();
	}
}