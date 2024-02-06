package ejercicioExamen;

import java.util.Scanner;

public class Cuenta {
	
	public static int[] numeros (int cantidad) {
		Scanner tec = new Scanner (System.in);
		int[] numeros = new int[cantidad];
		System.out.println("Introduce 7 números: ");
		for (int i=0; i<cantidad; i++) {
			numeros [i] = tec.nextInt();
		}
		tec.close();
		return numeros;
	}
	public static int comprobar (int[] numeros) {
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]==numeros[i+1]-1&&numeros[i] == numeros[i+2]-2) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int [6];
		numeros = numeros(6);
		int comprobar = comprobar(numeros);
		if (comprobar!=-1) {
			System.out.printf("La secuencia empieza en el número: %s", comprobar+1);
		} else {
			System.out.printf("No hay secuencia");
		}

	}

}
