package ud03;

import java.util.*;

public class Ejercicio46 {
	
	public static void main(String [] args) {
					
		Scanner tec = new Scanner(System.in);
		
		System.out.printf("Introduzca su nota: ");
		
		int nota= tec.nextInt();
		String calificacion= "";
		
		switch (nota) {

			case 5:
				calificacion="Suficiente";
				break;
			case 6:
				calificacion="Bien";
				break;
			case 7:
				calificacion="Notable";
				break;
			case 8:
				calificacion="Notable";
				break;
			case 9:
				calificacion="Sobresaliente";
				break;
			case 10:
				calificacion="Sobresaliente";
				break;
			default:
				calificacion="Insuficiente";
		}
		System.out.println("Su calificación es: " + calificacion);
		tec.close();
		
	}

}
