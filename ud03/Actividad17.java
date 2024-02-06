package ud03;

import java.util.*;

public class Actividad17 {
	
	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		int i;
		String tabla = "";
		long factorial =1;
		System.out.print("Introduza un número para calcular su factorial: ");
		int j = tec.nextInt();
		
		for (i=1; i<=j; i++) {

			factorial *=i;
			tabla +=i;
			if (i<j) {
				tabla +=" * ";
			}
		tec.close();
		}
		System.out.printf("%s! = %s = %s", j, tabla, factorial);

	}

}
