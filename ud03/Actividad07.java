package ud03;
import java.util.*;
public class Actividad07 {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
			
		int numero;
			
		do {
			System.out.print("Introduzca un número: ");
			numero = tec.nextInt();
			
				
			if (numero>0) {
				
				System.out.println("El " + numero + " es positivo");
					
			}
			
			if (numero <0) {
				
				System.out.println("El " + numero + " es negativo");
			}
		}while (numero !=0);
		
		tec.close();
	}
}

