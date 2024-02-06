package ud03;

import java.util.*;

public class Ejercicio58_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = null;
		int posicion=0;
		Scanner tec = new Scanner(System.in);
		do {	
			try {
				System.out.println("Introduce tu nombre: ");
				nombre = tec.nextLine();
		
				if (nombre.isEmpty()) {
                    throw new IllegalArgumentException("El nombre no puede estar vacío.");
               
                }
				
				System.out.println("Introduce la posición: ");
				posicion = tec.nextInt();
			
				if (posicion>=nombre.length()|| posicion<1) {
					throw new IllegalArgumentException("Debe introducir una posición entre 1 y la longitud máxima de su nombre.");
			
				}
				
				break;
				
			} catch (InputMismatchException e){
			
				System.out.println("Ha introducido un tipo de dato que no corresponde con un String.");
				tec.nextLine();
				continue;
			
			} catch (NumberFormatException e) {
				System.out.println("Ha escrito un número real, debe introducir un número entero");
				tec.nextLine();
				continue;
			
			} catch (ArithmeticException  e) {
				System.out.println("Debe introducir un número superior a 0");
				tec.nextLine();
				continue;
				
			} catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
                
            }		
			
		} while(true);
		char letra = nombre.charAt(posicion - 1);
		System.out.printf("La letra de la posición %d es %s.", posicion, letra);
		tec.close();
	}
	
}
