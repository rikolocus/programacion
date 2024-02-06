package ejercicioExamen;

import java.util.Scanner;

public class Container2 {

	public static void pesoTotal() {
		double peso=0;
		int contenedor=1;
		Scanner tec = new Scanner (System.in);
		do {
			System.out.printf("Introduzca el peso del contenedor núm. %s (en toneladas): ", contenedor);
			peso += tec.nextDouble();
			contenedor++;
		} while (contenedor <=8 && peso <=700);
		if (contenedor>8) {
			System.out.print("Ha excedido el núm. de contenedores");
		}
		if (peso>700) {
			System.out.print("Ha excedido del peso");
		}
		tec.close();
		System.out.printf("El número de contenedores es: %s\nEl peso total es: %.2f\nLa media es: %.2f", contenedor-1, peso, peso/(contenedor-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
