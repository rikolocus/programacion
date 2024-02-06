package ud03;

import java.util.*;

public class Ejercicio58 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int a, b;
		do {
				
			try {
				System.out.println("Introduzca dos números enteros para realizar división: ");
				a=tec.nextInt();
				b=tec.nextInt();
					
				if (a <= 0 || b <= 0) {
					System.out.println("Ambos números deben ser mayores que 0");
		            tec.nextLine();
		            continue;
		        }
				
			} catch (ArithmeticException  e) {
				System.out.println("Debe introducir un número superior a 0");
				tec.nextLine();
				continue;
				
			} catch (InputMismatchException  e) {
				System.out.println("Ha escrito una cadena de texto, debe introducir un número entero");
				tec.nextLine();
				continue;
			} catch (NumberFormatException e) {
				System.out.println("Ha escrito un número real, debe introducir un número entero");
				tec.nextLine();
				continue;
			}
			
			break;
		} while (true);
		
		double resultado = (double)a/b;
		System.out.printf("%d/%d = %.2f", a, b, resultado);
		tec.close();
	}
}
