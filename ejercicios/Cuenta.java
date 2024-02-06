package ejercicios;

import java.util.Scanner;

public class Cuenta {
	
	public static int[] numeros (int numero) {
		int [] numeros = new int[3];
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce tres números: ");
		for (int i=0; i<numero; i++) {
			numeros[i]= tec.nextInt();
		}
		tec.close();
		return numeros;
	}
	public static int comprobar (int [] numero) {
		for (int i=0; i<numero.length; i++) {
			if (numero[i]==numero[i+1]-1&&numero[i]==numero[i+2]-2) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]= numeros(3);
		int comprobar =comprobar(numeros);
		if (comprobar(numeros)!=-1) {
			System.out.printf("Existe una secuencia desde el número: %s", comprobar);
		} else {
			System.out.println("No existe secuencia.");
		}
	}

}
