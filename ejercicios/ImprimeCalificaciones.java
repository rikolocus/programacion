package ejercicios;

import java.util.Scanner;

public class ImprimeCalificaciones {
	
	public static double[] notas (int cantidad) {
		Scanner tec = new Scanner (System.in);
		double [] notas = new double [cantidad];
		System.out.println("Introduce 10 calificaciones: ");
		for (int i=0; i<cantidad; i++) {
			notas [i] = tec.nextDouble();
		}
		tec.close();
		return notas;
	}
	public static int aprobados (double [] notas) {
		int aprobados=0;
		for (double calificacion:notas) {
			if (calificacion >= 5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	public static int sobresalientes (double [] notas) {
		int sobresalientes=0;
		for(double calificacion:notas) {
			if (calificacion>=9) {
				sobresalientes++;
			}	
		}
		return sobresalientes;
	}
	public static double media (double [] notas) {
		int sumaNotas=0;
		for (double calificacion:notas) {
			sumaNotas+=calificacion;
		}
		return sumaNotas/notas.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notas[] = notas(10);
		System.out.printf("Aprobados: %s\nSobresalientes: %s\nMedia: %.2f", aprobados(notas),sobresalientes(notas),media(notas));
	}

}
