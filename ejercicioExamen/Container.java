package ejercicioExamen;

import java.util.*;

public class Container {

	public static void pesoTotal () {
		Scanner tec = new Scanner (System.in);
		double pesoTotal = 0;
		int contenedor=1;
		while (pesoTotal<=700&&contenedor<=8) {
			System.out.printf("Introduce el contenedor núm. %s (en toneladas): ", contenedor);
			double pesoIndividual = tec.nextDouble();
			pesoTotal +=pesoIndividual;
			contenedor++;
		}
		if(pesoTotal>700) {
			System.out.println("Ha excedido la carga.");
		}
		if (contenedor>8) {
			System.out.println("Ha excedido el número de contenedeores.");
		}
		System.out.printf("El número de contenedores es: %s\nEl peso total de carga es: %s\nEl peso medio del contenedores es %.2f", contenedor-1, pesoTotal, (pesoTotal/contenedor));
		tec.close();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pesoTotal();
	}

}
