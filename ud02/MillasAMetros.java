package ud02;
import java.util.Scanner;
public class MillasAMetros {

	private double millasMarinas;
	public MillasAMetros(double millasMarinas) {
		this.millasMarinas=millasMarinas;
	}
	public double getMetros() {
		return (millasMarinas*1852);
	}
	public double getKilometros() {
		return (millasMarinas*1.852);
	}
	public double getChange(String MetroKilometro) {
		double resultado = 0.0;
		switch (MetroKilometro) {
			case ("M"):
				resultado=getMetros();
				break;
			case ("KM"):
				resultado=getKilometros();
		default:
			System.out.println("Unidad no válida");
		}
		return resultado;
	}
	public static void main (String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduzca las millas marinas ");
		double valor = tec.nextDouble();
		tec.nextLine();
		System.out.print("Introduzca la unidad a la que desea transformar M(Metros) o KM(Kilómetros): ");
		String unidadDestino = tec.nextLine().toUpperCase();
		MillasAMetros cambio = new MillasAMetros(valor);
		double resultado = cambio.getChange(unidadDestino);
		System.out.printf("El resultado del cambio de millas marinas a %s es: %.2f %s%n", unidadDestino, resultado, unidadDestino);
		tec.close();
		
	}
}
