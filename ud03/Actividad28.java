package ud03;

import java.util.*;

public class Actividad28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner (System.in);
		System.out.println("Introduzca un número del 1 al 7: ");
		int dia = tec.nextInt();
		String diaSemana="";
		
		switch (dia) {
		
			case 1:
				diaSemana="Lunes";
				break;
			case 2:
				diaSemana="Martes";
				break;
			case 3:
				diaSemana="Miércoles";
				break;
			case 4:
				diaSemana="Jueves";
				break;
			case 5:
				diaSemana="Viernes";
				break;
			case 6:
				diaSemana="Sábado";
				break;
			case 7:
				diaSemana="Domingo";
				break;
			default:
				diaSemana="Error";
		}
		System.out.printf("El día de la semana introducido es el %s.",diaSemana);
		tec.close();
	}

}
