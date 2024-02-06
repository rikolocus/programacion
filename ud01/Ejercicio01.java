package ud01;

import java.util.*;

public class Ejercicio01 {
	// Se trata de un programa en el que se introducen números enteros y aparece en pantalla los números introducidos junto al texto;
	// En caso de introducir números reales aparece este error: Exception in thread "main" java.util.InputMismatchException at java.base/java.util.Scanner.throwFor(Scanner.java:947)	at java.base/java.util.Scanner.next(Scanner.java:1602)	at java.base/java.util.Scanner.nextInt(Scanner.java:2267) at java.base/java.util.Scanner.nextInt(Scanner.java:2221) at ejerciciosJavaJuanAlbertoSolera/ejercicios.Ejercicio01.main(Ejercicio01.java:9);
	// En caso de carácteres aparece el mismo error;
	// En caso de borrar el comando import java.util.* aparece este error: Exception in thread "main" java.lang.Error: Unresolved compilation problems: Scanner cannot be resolved to a type Scanner cannot be resolved to a type	at ejerciciosJavaJuanAlbertoSolera/ejercicios.Ejercicio01.main(Ejercicio01.java:8) La clase preestablecida Scanner no la puede ejecutar;

	public static void main (String arg[]){
		Scanner tec = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce un número entero");
		a = tec.nextInt();
		System.out.println("Introduce otro número entero");
		b = tec.nextInt();
		System.out.println("Los números introducidos son " + a + " y " + b);
		tec.close();
	}
}
