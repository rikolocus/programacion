package ud01;

import java.util.*;

public class Ejercicio02 {
	
	public static void main (String arg[]){
		// ¿Es posible escribir dos instrucciones en la misma línea de un programa? Sí, siempre y cuando se terminen los comandos en ;
		Scanner sc=new Scanner(System.in); double a, b, c; System.out.println("Introduce un número real"); a = sc.nextDouble(); System.out.println("Introduce un número real");b = sc.nextDouble(); System.out.println("Introduce un número real"); c = sc.nextDouble();System.out.println("El resultado de multiplicar los tres números es "+(a * b * c)); sc.close();
		// ¿Se puede "romper" una instrucción entre varias líneas? Sí se puede;
		int resultado = 8 +
	               12;
		int 
		probando = 4 + 15;
		System.out.println("El resultado de sumar 8+12 es "+ resultado);
		System.out.println("El resultado de sumar 4+15 es "+ probando);
		// Algunos lenguajes de programación dan un valor por defecto a las variables cuando las declaramos sin inicializarlas. Otros no permiten usar el contenido de una variable que no haya sido previamente inicializada. ¿Cuál es comportamiento de Java?;
		// int g; System.out.println(g);
		// Existe un error en el que "g" no ha sido definido y por lo tanto no funciona. Exception in thread "main" java.lang.Error: Unresolved compilation problem: The local variable g may not have been initialized at ejerciciosJavaJuanAlbertoSolera/ejercicios.Ejercicio02.main(Ejercicio02.java:17);
		// Sí se puede, algunos variables como boolean dan como valor por defecto false.
		int f = 1;
		System.out.println(f);
		// Al darle valor a "f", no se produce el error de compilación, para que funcione el presente ejercicio solo hace falta borrar int g; System.out.println(g) o darle un valor; 
		}
}