package ud03;

import java.util.*;

public class Actividad29 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner (System.in);
		System.out.print("Introduzca el número de horas trabajadas: ");
		int horas=tec.nextInt();
		int sueldoSemanal=0;
		int horasExtra=0;
		
		if (horas<=40) {
			sueldoSemanal= horas*12;
		} else {
			sueldoSemanal= 40*12;
			horasExtra= (horas-40)*16;
		}
		System.out.printf("El suelo semanal del empleado es de: %s euros", (sueldoSemanal+horasExtra));
		tec.close();
	}

}
