package ud03;

import java.util.*;

public class Ejercicio04 {

	public static void main(String [] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int nota;
		String calificacion= "";
		
		System.out.println("Introduzca su nota: ");
		nota = tec.nextInt();
		
		if (nota<5) {
			calificacion="Insuficiente";
		}
		else {
			if (nota>=5 && nota<6) {
				calificacion="Suficiente";
			}
			if (nota>=6 && nota<7) {
				calificacion="Bien";
			}
			if (nota>=7 && nota<9) {
				calificacion="Notable";
			}
			if (nota>=9 && nota<=10) {
				calificacion="Excelente";
			}
		}
		System.out.printf("Su nota es %s.", calificacion);
		tec.close();
	}
		
}
