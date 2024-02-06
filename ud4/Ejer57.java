package ud4;
import java.util.*;
public class Ejer57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner (System.in);
		
		
		int [] edad4 = new int [5];
		int edad5 = -1;
		boolean validez3 = false;
		
		while (!validez3) {
			
			for (int i=0; i<edad4.length; i++) {
				
				try {
					System.out.printf("Introduce la edad de la persona %s: ", (i+1));
					edad5 = tec.nextInt();
					tec.nextLine();
					
					if (edad5>=0 && edad5<=110) {
						edad4 [i] = edad5;
						validez3 = true;
					} else {
						System.out.print("El rango debe ser entre 0 y 110\n");
						
						validez3=false;
						break;
					}
					
				} catch (Exception e) {
					System.out.print("Introduzca un número válido\n");
					tec.nextLine();
					validez3=false;
					break;
				}
				
			}
		}

	}

}
