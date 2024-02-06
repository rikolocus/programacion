package ud03;

import java.util.*;

public class Actividad25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int contadorSuspenso=0;
		for (int i=1; i<=5; i++) {
			
			System.out.print("Introduca la nota del alumno: ");
			double nota = tec.nextDouble();
			
			if (nota<5) {
				contadorSuspenso++;
			}
		}
		System.out.printf("%s alumnos han suspendido.", contadorSuspenso);
		tec.close();
	}

}
