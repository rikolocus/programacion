package ud02;

import java.util.*;
public class Peso2 {

	private double kg;
	
	public Peso2(double kg)  { 
		this.kg=kg;
	}
	public double getLibras() {
		return kg/0.453;
	}
	public double getLingotes() {
		return kg/14.59;
	}
	public double getPeso(String unidad) {
		double resultado=0;
		
		switch (unidad) {
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
				System.out.println("La unidad introducida no es válida");
		}
		return resultado;
		
	}
	public static void main (String []args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduzca la unidad a convertir LB(Libras),Li(Lingotes),Oz(Onzas),P(Peniques),Q(Quintales): ");
		
		String unidad = tec.nextLine().toUpperCase();
		
		System.out.print("Introduzca los kilos a transformar: ");

		double kilos = tec.nextDouble();
		Peso2 peso = new Peso2(kilos);
		double resultado = peso.getPeso(unidad);
		System.out.printf(kilos + " kilos son: " + String.format("%.4f", resultado) + " " + unidad.toUpperCase());
		tec.close();
	}
}
