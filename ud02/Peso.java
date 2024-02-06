package ud02;

import java.util.Scanner;
public class Peso {

	private double kg;
	public Peso(double kg) {
		this.kg= kg;
	}
	public double getLibras() {
		return (kg/0.453);
	}
	public double getLingotes() {
		return (kg/14.59);
	}
	public double getPeso(String unidadDestino) {
		double resultado = 0.0;
		
		switch (unidadDestino) {
			case "LB":
				resultado = getLibras();
				break;
			case "Li":
				resultado = getLingotes();
				break;
			case "Oz":
				resultado = kg/0.02835;
				break;
			case "P":
				resultado = kg/0.00155;
				break;
			case "Q":
				resultado = kg/43.3;
				break;
			default:
				System.out.println("Unida no válida");
				
		}
		return resultado;
	}
	public static void main (String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduzca el valor en kg a transformar: ");
		double valor = tec.nextDouble();
		tec.nextLine();
		System.out.print("Introduzca la unidad a la que desea transformar LB(Libras),Li(Lingotes),Oz(Onzas),P(Peniques),Q(Quintales): ");
		String unidadDestino = tec.nextLine().toUpperCase();
		Peso peso = new Peso(valor);
		double resultado = peso.getPeso(unidadDestino);
		System.out.printf("El resultado del cambio de kg a %s es: %.4f %s%n", unidadDestino, resultado, unidadDestino);
		tec.close();
	}
}
