package ud02;

import java.util.Scanner;

public class Restaurante {
	
	private int patatas;
	private int carne;
	
	public Restaurante(int patatas, int carne) {
		this.patatas=patatas;
		this.carne=carne;
	}
	public int getComensales() {
		return Math.min(patatas/2, carne)*3;
	}
	public void addCarne(int x) {
		carne +=x;
	}
	public void addPatatas (int y) {
		patatas +=y;
	}
	public double getCarne() {
		return carne;
	}
	public double getPatatas() {
		return patatas;
	}
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca los kilos de patatas: ");
		int kilospatatas = scanner.nextInt();
		System.out.print("\nIntroduzca los kilos de carne: ");
		int kiloscarne = scanner.nextInt();
		Restaurante capacidad = new Restaurante(kilospatatas, kiloscarne);
		scanner.close();
		System.out.println("El restaurante tiene capacidad para: " + capacidad.getComensales() + " clientes");
		
		capacidad.addPatatas(70);
		capacidad.addCarne(50);
				
		System.out.printf("Quedan %s kilos de patatas y %s kilos de carne", capacidad.getPatatas(), capacidad.getCarne());
		
	}

}
