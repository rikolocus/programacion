package ud01;

import java.util.*;

public class Ejercicio05 {

	// Escribir un programa que: Lea desde teclado dos valores enteros. Llama a las variables v1 y v2. Muestra los valores introducidos por el usuario. Intercambia el valor de v1 y v2 (v1 pasa a valer lo que valía v2 y viceversa).	Muestra de nuevo los valores, ahora con su valor intercambiado.;
	
	public static void main (String arg[]){
		
		// Crea un objeto para leer la entrada;
		Scanner tec = new Scanner(System.in);
		
		// Introduce dos variables;
		int v1, v2;
			
		// El usuario introduce dos valores enteros;
		System.out.print("Introduce el primer valor (v1): ");
		v1 = tec.nextInt();
		System.out.print("Introduce el segundo valor (v2): ");
		v2 = tec.nextInt();
		
		// Se cierra la función;
		tec.close();
		
		// Mostrar los valores introducidos por el usuario;
        System.out.println("Antes de intercambiar \t v1: " + v1 + " \t y  v2: " + v2);
        
        // Intercambiar los valores de v1 y v2
        int temp = v1;
        v1 = v2;
        v2 = temp;
        
        // Mostrat los valores intercambiados;
        System.out.println("Después de intercambiar  v1: " + v1 + " \t y  v2: " + v2);
    }
}
