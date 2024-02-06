package ud03;

import java.util.*;

public class Actividad41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int combinacionCaja=4321;
		int intentos = 4;
		
		while (intentos>0) {
			System.out.print("Introduzca la combinación: ");
			int pruebaCaja=tec.nextInt();
			if (pruebaCaja==combinacionCaja) {
				System.out.println("Enhorabuena, la caja se ha abierto");
			} else {
				intentos--;
				System.out.printf("Le quedan %s intentos\n", intentos);
			}
		}
		if (intentos ==0) {
			System.out.println("Ha superado el número de intentos");
		}
		tec.close();
	}

}
