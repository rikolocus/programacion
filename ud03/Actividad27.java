package ud03;

import java.util.*;

public class Actividad27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduzca la hora actual: ");
		int hora = tec.nextInt();
		
		switch (hora) {
			
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("Buenos días");
				break;
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:	
				System.out.println("Buenas tardes");
				break;
			case 21:
			case 22:
			case 23:
			case 24:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:		
				System.out.println("Buenas noches");
				break;
			default:
				System.out.println("Hora errónea");
		}
		tec.close();
	}

}
