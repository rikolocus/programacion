package ud01;

import java.util.*;

public class Prueba09 {

	public static void main (String []args) {
		Scanner tec = new Scanner(System.in);
		int segundosTotales;
		System.out.println("Introduce cantidad de segundos: ");
		segundosTotales = tec.nextInt();
		
		int dias, horas, minutos, segundos;
		int segundosDia = 24*60*60, segundosHora = 60*60, segundosMinuto = 60;
		dias = segundosTotales / segundosDia;
		horas = segundosTotales%segundosDia/segundosHora;
		minutos = segundosTotales%segundosHora/segundosMinuto;
		segundos = segundosTotales%segundosMinuto;
		System.out.println(segundosTotales + " segundos son:");
		System.out.println(dias + " días:");
		System.out.println(horas + " horas");
		System.out.println(minutos + " minutos");
		System.out.println(segundos + " segundos");
		tec.close();
	}
}