package ud02;

import java.util.*;
public class Finanzas {
	
	private double cambio;

	// Constructor por defecto que establece el cambio Dólar-Euro en 1.02
	public Finanzas() {
	    cambio = 1.02;
	}
 
	// Constructor que permite configurar el cambio Dólar-Euro a una cantidad personalizada
	public Finanzas(double cambio) {
	    this.cambio = cambio;
	}

	// Método para convertir dólares a euros
	public double dolaresToEuros(double dolares) {
	    return dolares / cambio;
	}

	// Método para convertir euros a dólares
	public double eurosToDolares(double euros) {
	    return euros * cambio;
	}

	public static void main(String[] args) {
	// Crear una instancia de Finanzas con el constructor por defecto
	    Finanzas finanzasPorDefecto = new Finanzas();
	        
	// Realizar conversiones con el tipo de cambio por defecto (1.02)
	    double dolares = 100;
	    double euros = finanzasPorDefecto.dolaresToEuros(dolares);
	    System.out.println(dolares + " dólares son " + euros + " euros");

	    euros = 200;
	    dolares = finanzasPorDefecto.eurosToDolares(euros);
	    System.out.println(euros + " euros son " + dolares + " dólares");

	    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tipo de cambio Dólar-Euro personalizado: ");
        double tipoCambioPersonalizado = scanner.nextDouble();

        Finanzas finanzasPersonalizado = new Finanzas(tipoCambioPersonalizado);

        System.out.print("Introduce la cantidad en dólares: ");
        double dolares2 = scanner.nextDouble();
        double euros2 = finanzasPersonalizado.dolaresToEuros(dolares2);
        System.out.println(dolares2 + " dólares son " + euros2 + " euros");

        System.out.print("Introduce la cantidad en euros: ");
        double euros3 = scanner.nextDouble();
        double dolares3 = finanzasPersonalizado.eurosToDolares(euros3);
        System.out.println(euros3 + " euros son " + dolares3 + " dólares");

        scanner.close();
	}
}
