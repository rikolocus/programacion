package ud03;

import java.util.*;

public class Actividad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		int edadMedia = 0;
		double alturaMedia = 0;
		int contadorMas18 = 0;
		int contadorMas175 =0;
		for (int i=1; i<=5; i++) {
			
			System.out.print("Introduzca la edad y la altura del alumno.\nEdad: ");
			int edad = tec.nextInt();
			System.out.print("Altura en metros:");
			double altura = tec.nextDouble();
			edadMedia += edad;
			alturaMedia += altura;
			
			if (edad>18) {
				contadorMas18++;
			} else {
			}
			if (altura>1.75) {
				contadorMas175++;
			} else {
			}
			
		}
		tec.close();
		System.out.printf("La edad media de los alumnos es %s años y la altura media es %s metros.\n%s alumnos son mayores de 18 años.\n%s miden más de 1.75 metros.", edadMedia/5, alturaMedia/5, contadorMas18, contadorMas175);
	}

}
