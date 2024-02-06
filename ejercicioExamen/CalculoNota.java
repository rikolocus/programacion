package ejercicioExamen;

import java.util.Scanner;

public class CalculoNota {

	public static void calculo () {
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce la nota uno: ");
		double notaUno = tec.nextDouble();
		double porcentajeNota = notaUno*40/100;
		System.out.println("Introduce la nota deseada: ");
		double notaDeseada = tec.nextDouble();
		double notaNecesaria = (notaDeseada - porcentajeNota)/0.6;
		System.out.printf("La nota necesaria es: %s", notaNecesaria);
		tec.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculo();
	}

}
