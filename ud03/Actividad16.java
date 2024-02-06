package ud03;

public class Actividad16 {
	
	public static void main (String [] args) {
		
		int impar;
		int contador=1;
		long producto=1;
		
		for (impar=1; contador<=10; impar+=2) {
			
			producto*=impar;
			contador++;
		}
		System.out.print("El producto de los 10 primeros números impares es: "+ producto);
	}

}
