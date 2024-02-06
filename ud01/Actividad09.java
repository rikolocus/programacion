package ud01;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Actividad09 {
	
	// Este programa genera el resultado del sorteo de la ONCE;
	public static void main (String[] args) {
		
		// Obtén la fecha de hoy
        LocalDate fechaHoy = LocalDate.now();
        
        // Define un formato para mostrar la fecha (opcional)
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Convierte la fecha en una cadena con el formato especificado
        String fechaFormateada = fechaHoy.format(formatoFecha);
		
		Random random = new Random(); // Crea el objeto Random para que sea aleatorio;
		int numAleatorio = random.nextInt(100000); // Crea un número entre 00000 y 99999;
				
		String numAleatorioFormateado = String.format("%05d", numAleatorio);// Formatea el número como una cadena de 5 dígitos con ceros a la izquierda;
		
		int numAleatorioSerie = random.nextInt(121); // Crea un número entre 000 y 120;
		
		String numAleatorioSerieFormateado = String.format("%03d", numAleatorioSerie); // Formatea el número como una cadena de 3 dígitos con ceros a la izquierda;
		
		System.out.println("El cupón premiado del día " + fechaFormateada + " es " + numAleatorioFormateado + " serie número " + numAleatorioSerieFormateado + ".");
	}
}
