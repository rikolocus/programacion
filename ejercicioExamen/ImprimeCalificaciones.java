package ejercicioExamen;

import java.util.Scanner;

public class ImprimeCalificaciones {
	
	public static double[] ingresaNotas (int calificaciones) {
		Scanner tec = new Scanner (System.in);
		double []notas= new double[calificaciones];
		System.out.printf("Introduce las 10 notas: ");
		for (int i=0; i<calificaciones;i++) {
			notas[i] = tec.nextDouble();
		}
		tec.close();
		return notas;
	}
	public static int aprobados (double [] calificaciones) {
		int aprobados=0;
		for (double calificacion:calificaciones) {
			if (calificacion>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	public static int sobresalientes (double [] calificaciones) {
		int sobresalientes=0;
		for (double calificacion:calificaciones) {
			if (calificacion>=9) {
				sobresalientes++;
			}
		}
		return sobresalientes;
	}
	public static double media (double [] calificaciones) {
		double sumaNotas=0;
		for(double calificacion:calificaciones) {
			sumaNotas+=calificacion;
		}
		return sumaNotas/calificaciones.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] calificacion = ingresaNotas(10);
		int aprobados = aprobados(calificacion);
		int sobresalientes = sobresalientes (calificacion);
		double media = media (calificacion);
		System.out.printf("Aprobados: %s\nSobresalientes: %s\nPromedio: %.2f", aprobados, sobresalientes, media);
	}

}
