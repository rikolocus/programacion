package ejercicioExamen;

import java.util.Scanner;

public class MayorTresNumeros {
	
	public static int[] numeroMayor(int numero) {
		Scanner tec = new Scanner (System.in);
		int[] numeros = new int [3];
		System.out.println("Introduce tres números: ");
		for (int i=0; i<numero; i++) {
			numeros[i] = tec.nextInt();
		}
		tec.close();
		return numeros;
	}
	public static int comprobarMayor (int [] numeros) {
		int resultado= numeros [0];
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]>resultado) {
				resultado = numeros[i];
			}
		}
		return resultado;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prueba = numeroMayor(3);
		System.out.printf("%s", comprobarMayor(prueba));
	}

}
