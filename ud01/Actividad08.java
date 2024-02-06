package ud01;

import java.util.*;

public class Actividad08 {
	
	// Este programa genera letras de forma aleatoria;
	public static void main (String[] args) {
		
		Random random = new Random(); // Crea el objeto Random para que sea aleatorio;
		int numAleatorio = random.nextInt(26) + 65; // Crea un número entre 65 y 90 correspondiente a letras mayúsculas;
		
		char letraAleatoria = (char) numAleatorio;
		
		System.out.println("Se va a generar una letra aleatoria " + letraAleatoria);
	}
}