package ud01;

import java.util.*;

public class Ejercicio07 {
	
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario;
        Scanner tec = new Scanner(System.in);

        // Solicitar al usuario la longitud de la habitación;
        System.out.print("Introduce la longitud de la habitación en metros: ");
        double longitud = tec.nextDouble();

        // Solicitar al usuario la anchura de la habitación;
        System.out.print("Introduce la anchura de la habitación en metros: ");
        double anchura = tec.nextDouble();

        // Calcular la superficie (área) de la habitación;
        double superficie = longitud * anchura;

        // Mostrar la superficie de la habitación;
        System.out.println("La superficie de la habitación es: " + superficie + " metros cuadrados");

        // Cerrar el Scanner;
        tec.close();
    }
}
