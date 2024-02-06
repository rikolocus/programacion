package ud4;

import java.util.*;

public class Edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner (System.in);
		
		int [] edad = new int [5];
		int edad1 = 0;
		for (int i=0; i<edad.length; i++) {
			
			boolean validez = false;
			
			while (!validez) {
				
				try {
					System.out.printf("Introduce la edad de la persona %s: ", (i+1));
					edad1 = tec.nextInt();
					tec.nextLine();
					
					if (edad1>=0 && edad1<=110) {
						edad [i] = edad1;
						validez = true;
					} else {
						System.out.print("El rango debe ser entre 0 y 110\n");
					}
					
				} catch (Exception e) {
					System.out.print("Introduzca un número válido\n");
					tec.nextLine();
				}
				
			}
		}
		
		int [] edad2 = new int [5];
		int edad3 = 0;
		boolean salida = true;
		double media = 0;
		for (int i=0; i<edad2.length; i++) {
			
			boolean validez2=false;
												
				try {
					System.out.printf("Introduce la edad de la persona %s: ", (i+1));
					edad3 = tec.nextInt();
					tec.nextLine();
						
					if (edad3>=0 && edad3<=110) {
						edad2[i] = edad3;
						media += edad3;
						validez2 = true;
					} else {
						System.out.print("Ha introducido un número erróneo");
						salida = false;
						break;
					}
						
				} catch (Exception e) {
					System.out.print("Ha introducido un número erróneo");
					salida = false;
					break;
				}
		}
		if (salida == true) {
			System.out.printf("La edad media es: %s\n", (int)(media/edad2.length));
		}
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
		tec.close();
	}
}
