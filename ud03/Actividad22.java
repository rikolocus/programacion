package ud03;

import java.util.*;

public class Actividad22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		int contadorSuspenso=0;
		int contadorAprobado=0;
		for (int i=1; i<=6; i++) {
			
			System.out.print("Introduzca la nota del alumno: ");
			double nota = tec.nextDouble();
			
			if (nota<5) {
				contadorSuspenso++;
			} else {
				contadorAprobado++;
			}
		}
		tec.close();
		System.out.printf("Aprobados: %s\nSuspensos: %s\n",contadorAprobado, contadorSuspenso);
	}

}
