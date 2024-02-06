package ud03;

import java.util.*;

public class Actividad51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		int numero;
	    do {
	        System.out.print("Introduzca un número del 20 al 99: ");
	        numero = tec.nextInt();

	        if (numero < 20 || numero > 99) {
	            System.out.println("Error: el número está fuera del rango.");
	        }
	    } while (numero < 20 || numero > 99);
	    
		int decena=numero/10;
		int unidades=numero%10;
		String numeroLetras = "";
		
		switch (decena) {
		
			case 2:
				if (numero==20)  {
					numeroLetras += "veinte";
				} else {
					numeroLetras += "veinti";
				}
				break;
			case 3:
				numeroLetras += "treinta";
				break;
			case 4:
				numeroLetras += "cuarenta";
				break;
			case 5:
				numeroLetras += "cincuenta";
				break;
			case 6:
				numeroLetras += "sesenta";
				break;
			case 7:
				numeroLetras += "setenta";
				break;
			case 8:
				numeroLetras += "ochenta";
				break;
			case 9:
				numeroLetras += "noventa";
				break;
		}
		if (numero >30 && numero<100) {
			numeroLetras +=" y ";
		}
		switch (unidades) {
			
			case 1:
				numeroLetras += "uno";
				break;
			case 2:
				numeroLetras += "dos";
				break;
			case 3:
				numeroLetras += "tres";
				break;
			case 4:
				numeroLetras += "cuatro";
				break;
			case 5:
				numeroLetras += "cinco";
				break;
			case 6:
				numeroLetras += "seis";
				break;
			case 7:
				numeroLetras += "siete";
				break;
			case 8:
				numeroLetras += "ocho";
				break;
			case 9:
				numeroLetras += "nueve";
				break;
		}
		System.out.println(numeroLetras);
		tec.close();
	}
}
