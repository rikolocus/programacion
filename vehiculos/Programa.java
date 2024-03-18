package vehiculos;

import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		 
		VehiculoTerrestre t1 = new VehiculoTerrestre("1234", "VT", 4);
		VehiculoAcuatico a1 = new VehiculoAcuatico("ABCDEFG", "VA", 15);
		VehiculoAereo ae1 = new VehiculoAereo ("ABCD123456", "VAE", 6);
		Coche c1 = new Coche("1234ABC", "I30", 4, true);
		Coche c2 = new Coche("1235ABC", "Sportage", 3, false);
		c2.setAireAcondicionado(true);
		Moto m1 = new Moto("123456", "CB600F", 2, "blanca");
		Barco b1 = new Barco("BCDEFGH", "VA1", 12, true);
		Submarino s1 = new Submarino("CDEFGHI", "VA2", 20, 200);
		Avion av1 = new Avion("ABCD456789", "VAE", 10, 80);
		Helicoptero h1 = new Helicoptero("ABCD987654", "VAH", 6, 2);
		ArrayList<Object> serieVehiculos = new ArrayList<>();
		serieVehiculos.add(t1);
		serieVehiculos.add(a1);
		serieVehiculos.add(ae1);
		serieVehiculos.add(c1);
		serieVehiculos.add(c2);
		serieVehiculos.add(m1);
		serieVehiculos.add(b1);
		serieVehiculos.add(s1);
		serieVehiculos.add(av1);
		serieVehiculos.add(h1);
		serieVehiculos.forEach(elemento -> {
			if(elemento instanceof VehiculoTerrestre) {
				System.out.print(((VehiculoTerrestre)elemento).imprimir());
			}else if (elemento instanceof VehiculoAcuatico) {
				System.out.print(((VehiculoAcuatico)elemento).imprimir());
			}else if (elemento instanceof VehiculoAereo) {
				System.out.print(((VehiculoAereo)elemento).imprimir());
			}else if (elemento instanceof Coche) {
				System.out.print(((Coche)elemento).imprimir());
			}else if (elemento instanceof Moto) {
				System.out.print(((Moto)elemento).imprimir());
			}else if (elemento instanceof Barco) {
				System.out.print(((Barco)elemento).imprimir());
			}else if (elemento instanceof Submarino) {
				System.out.print(((Submarino)elemento).imprimir());
			}else if (elemento instanceof Avion) {
				System.out.print(((Avion)elemento).imprimir());
			}else if (elemento instanceof Helicoptero) {
				System.out.print(((Helicoptero)elemento).imprimir());
			}
		});
	}
}

