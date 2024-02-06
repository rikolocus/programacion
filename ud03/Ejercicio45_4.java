package ud03;

public class Ejercicio45_4 {
	
	public static void main (String [] args) {
		
		char caracter = '*';
		char espacio =' ';
		for (int i=1; i<=3; i++) {
			
			for (int j=1; j<=7; j++) {
				
				if(i==1||j==1||i==3||j==7) {
					System.out.print(caracter);
				} else {
					System.out.print(espacio);
				}
			}
			System.out.println();
		}
	}
}
