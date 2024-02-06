package ejercicios;

import java.util.Scanner;

public class Container {

	
	public static void contenedores () {
		int contenedor1=1;
		double pesoTotal=0;
		Scanner tec = new Scanner (System.in);
		while (contenedor1<=8&&pesoTotal<=700) {
			System.out.printf("Introduce el peso del contenedor %s: ", contenedor1);
			pesoTotal+=tec.nextDouble();
			contenedor1++;
		}
		if (contenedor1 >8 ) {
			System.out.println("Se ha excedido el número de contenedores.");
		}
		if (pesoTotal>700) {
			System.out.println("Se ha excedido el peso");
		}
		System.out.printf("Peso Total: %.2f\nNúmero de contenedores: %s\nMedia: %.2f", pesoTotal,contenedor1-1,pesoTotal/(contenedor1-1));
		tec.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contenedores();
	}

}
