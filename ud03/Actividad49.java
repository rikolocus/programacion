package ud03;

import java.util.Scanner;

public class Actividad49 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner (System.in);
		String ivaRed = "Reducido";
		String ivaNor = "iva";
		String ivaSuper = "SuperRed";
		String codPromo = "Navidad2023";
		double precioFinal;
		double ivaReducido = 10.0/100;
		double ivaSuperReducido = 4.0/100;
		double ivaNormal = 21.0/100;
		double codigoPromo = 10.0/100;
		double ivaCalculado=0;
		double descuento=0;
		System.out.print("Introduzca el precio del producto (sin IVA): ");
		double precio = tec.nextDouble();
		System.out.print("IVA aplicable (Reducido, SuperRed, iva): ");
		String iva = tec.next();
		System.out.print("Introduzca el código de descuento: ");
		String codigo = tec.next();
		if (iva.equals (ivaRed)) {
			ivaCalculado += precio * ivaReducido;
		} else if (iva.equals (ivaSuper)) {
			ivaCalculado += precio * ivaSuperReducido;
		} else if (iva.equals (ivaNor)) {
			ivaCalculado += precio * ivaNormal;
		}
		if (codigo.equals (codPromo)) {
			descuento += precio * codigoPromo;
		}
		precioFinal = precio+ivaCalculado-descuento;
		System.out.printf("Base Imponible: %s€\nSu IVA:%s€\nDescuento: %s€\nPrecio Final: %s€", precio, ivaCalculado, descuento, precioFinal);
		tec.close();
	}
}
