package ud03;

public class Actividad02 {
		
	public static void main(String [] args) {
		
		int contador=0;
		int numero=1;
		
		while (contador<5) {
			if (numero%2==0) {
				System.out.println(numero);
				contador++;
				
			}
			numero++;
		}
	}
}