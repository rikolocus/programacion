package ud01;

import java.util.*;

public class Actividad18 {

	// Programa que dado un importe en euros nos indique el mínimo número de billetes y la cantidad sobrante de euros;
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("¿Cuantos euros tienes? ");
		double dineroTiene = tec.nextDouble();
		
		double billete500 = 500;
		double billete200 = 200;
		double billete100 = 100;
		double billete50 = 50;
		double billete20 = 20;
		double billete10 = 10;
		double billete5 = 5;
		
		int billetes500 = (int) (dineroTiene/billete500);
		int billetes200 = (int) (dineroTiene >= billete200 ? (dineroTiene - (billetes500 * billete500)) / billete200 : 0);
		int billetes100 = (int) (dineroTiene >= billete100 ? (dineroTiene - (billetes500 * billete500 + billetes200 * billete200)) / billete100 : 0);
		int billetes50 = (int) (dineroTiene >= billete50 ? (dineroTiene - (billetes500 * billete500 + billetes200 * billete200 + billetes100 * billete100)) / billete50 : 0);
		int billetes20 = (int) (dineroTiene >= billete20 ? (dineroTiene - (billetes500 * billete500 + billetes200 * billete200 + billetes50 * billete50)) / billete20 : 0);
		int billetes10 = (int) (dineroTiene >= billete20 ? (dineroTiene - (billetes500 * billete500 + billetes200 * billete200 + billetes50 * billete50 + billetes20 * billete20)) / billete10 : 0);
		int billetes5 = (int) (dineroTiene >= billete20 ? (dineroTiene - (billetes500 * billete500 + billetes200 * billete200 + billetes50 * billete50 + billetes20 * billete20 + billetes10 * billete10)) / billete5 : 0);
		double sobra = dineroTiene - (billetes500 * billete500 + billetes200 * billete200 + billetes50 * billete50 + billetes20 * billete20 + billetes10 * billete10 + billetes5 * billete5);
		
		if(billetes500 > 0) {
			System.out.println(billetes500 + " billetes de " + (int)billete500 + " €.");
		}
		if(billetes200 > 0) {
			System.out.println(billetes200 + " billetes de " +(int)billete200 + " €.");
		}
		if(billetes100 > 0) {
			System.out.println(billetes100 + " billetes de " +(int)billete100 + " €.");
		}
		if(billetes50 < 0) {
			System.out.println(billetes50 + " billetes de " +(int)billete50 + " €.");
		}
		if(billetes20 > 0) {
			System.out.println(billetes20 + " billetes de " +(int)billete20 + " €.");
		}
		if(billetes10 > 0) {
			System.out.println(billetes10 + " billetes de " +(int)billete10 + " €.");
		}
		if(billetes5 > 0) {
	        System.out.println(billetes5 + " billetes de " +(int)billete5 + " €.");
		}
		if(sobra > 0) {
			String sobran = String.format("%.2f", sobra);
			System.out.println("Sobran " + sobran + " €.");
		}
		tec.close();
	}
}
