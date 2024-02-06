package ud01;

import java.util.*;

public class Ejercicio04 {

	// Escribir un programa que lea un entero desde teclado, lo multiplique por 2, y a continuación escribe el resultado en la pantalla;
	
	public static void main (String arg[]){
		
		// Crea un objeto para leer la entrada;
		Scanner tec = new Scanner(System.in);
		
		// Introduce dos variables;
		int a, b;
		
		// Muestra el texto;
		System.out.println("Escribe un número:");
		
		// El usuario introduce el número;
		a = tec.nextInt();
		
		// Se dobla el valor introducido;
		b = a * 2;
		
		// Muestra el texto con el resultado;
		System.out.println("El doble de " + a + " es " + b );
		
		// Cierra la función;
		tec.close();
	}
}
