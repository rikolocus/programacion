package ud07;

import java.util.*;

public class Actividad02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mínimos y máximos para calcular un número aleatorio
		int min = 5;
		int max = 60;
		int minPersonas = 0;
		int maxPersonas = 50;
		
		//Calcula las personas aleatorias
		int personasAleatoria = (int) (Math.random()*(maxPersonas-minPersonas+1)+minPersonas);
		
		double precioTotal = 0;
		
		//ArrayList de edades
		ArrayList<Integer> edades = new ArrayList<>();
		
		//Bucle para incorporar la edad según el númPersonas y sumar el precioTotal cobrado
		for (int i=0; i<personasAleatoria; i++) {
			int edadAleatoria = (int) (Math.random()*(max-min+1)+min);
			edades.add(edadAleatoria);
			if (edadAleatoria<=10) {
				precioTotal +=5;
			} else if (edadAleatoria>10&&edadAleatoria<=17) {
				precioTotal +=7.5;
			} else {
				precioTotal +=9.5;
			}
		}
		
		//Muestra datos
		System.out.printf("Hay un total de %s personas en la cola\nEl precio total es de %s euros\n%s", personasAleatoria,precioTotal,edades);
	}
}
