package ud02;

import java.util.Scanner;

public class Temperatura {
	
	//Método para pasar de Celsius a Farenheit;
	public static double celsiusToFarenheit (double celsius) {

		double farenheit = (1.8 * celsius) + 32;	
		return farenheit;
	}
	
	//Método para pasar Farenheit a Celsius;
	public static double farenheitToCelsius (double farenheit) {
		
		double celsius3 = (farenheit-32)/1.8;
		return celsius3;
	}
	public static void main (String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce los grados celsius: ");
		double celsius = tec.nextDouble();
		double farenheit = celsiusToFarenheit (celsius);
		System.out.println(celsius + " grados celsius son: " + farenheit + " grados farenheit.");
		
		System.out.print("Introduce los grados farenheit: ");
		double farenheit2 = tec.nextDouble();
		double celsius2 = farenheitToCelsius (farenheit);
		System.out.println(farenheit2 + " grados farenheit son: " + celsius2 + " grados celsius.");
		tec.close();
	}
}
