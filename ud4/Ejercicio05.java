package ud4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio05 {
	
	public static void main (String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduzca el número de array: ");
		
		int cantidadArray= tec.nextInt();
		int[] v = new int[cantidadArray];
		int[] t = new int[cantidadArray];
		
		for (int i=0; i<cantidadArray; i++) {
			System.out.print("Introduzca un número: ");
			v[i] = tec.nextInt();
		}
		t[0] = v[0];
		for (int i=1; i<Array.getLength(t); i++) {
			t[i] = t[i-1] + v[i];
		}
		for (int i=0; i<Array.getLength(t); i++) {
			System.out.printf("t[%s] = %s\n", i, t[i]);
		}
		tec.close();
	}
}
