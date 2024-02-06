package ud01;

import java.util.*;

public class Ejercicio09 {

	//Escribir un programa que, dada una cantidad de segundos, introducida por teclado, la desglose en días, horas, minutos y segundos;
	public static void main(String[] args) {
		
		// Crear un objeto Scanner para leer la entrada;
	    Scanner tec = new Scanner(System.in);
	    
	    // Solicitar la cantidad de segundos;
        System.out.print("Introduce una cantidad de segundos: ");
        int segundosTotales = tec.nextInt();

        // Calcular días, horas, minutos y segundos;
        int dias, horas, minutos, segundos;
		int segundosDia = 24*60*60, segundosHora = 60*60, segundosMinuto = 60;
		dias = segundosTotales / segundosDia;
		horas = segundosTotales%segundosDia/segundosHora;
		minutos = segundosTotales%segundosHora/segundosMinuto;
		segundos = segundosTotales%segundosMinuto;
		
        // Mostrar el desglose;
        System.out.println("Desglose en:");
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        // Cerrar el Scanner;
        tec.close();
    }
}
