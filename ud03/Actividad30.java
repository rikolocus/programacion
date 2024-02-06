package ud03;

import java.util.*;

public class Actividad30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner (System.in);
		double notaMedia=0;
		for (int i=1; i<=3; i++) {
			System.out.print("Introduca una nota: ");
			double nota = tec.nextDouble();
			notaMedia+=nota;
		}
		System.out.printf("La media de las tres notas es: %s", notaMedia/3);
		tec.close();
	}

}
