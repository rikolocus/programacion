package ud01;

import java.util.*;

public class Ejercicio08 {
	
	public static void main(String[] args) {
	
		// Crear un objeto Scanner para leer la entrada del usuario;
	    Scanner tec = new Scanner(System.in);

	    // Solicitar al usuario la medida a convertir en pies;
	    System.out.print("Introduce la longitud en pies: ");
	    double longitud = tec.nextDouble();

	    // Calcular la conversión en yardas, pulgadas, centímetros y metros;
	    double pulgadas = longitud * 12;
	    double yardas = longitud / 3;
	    double centímetros = pulgadas * 2.54;
	    double metros = centímetros / 100;

	    // Mostrar las conversiones;
	    System.out.println(longitud + " pies son " + pulgadas + " pulgadas");
	    System.out.println(longitud + " pies son " + yardas + " yardas");
	    System.out.println(longitud + " pies son " + centímetros + " centímetros");
	    System.out.println(longitud + " pies son " + metros + " metros");
	    
	    // Cerrar el Scanner;
	    tec.close();
	}
}
