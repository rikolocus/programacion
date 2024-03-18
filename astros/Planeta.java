package astros;

import java.util.ArrayList;

public class Planeta extends Astros{

	private double distanciaAlSol;
	private double orbitaAlSol;
	private ArrayList<Object> satelites;
	
	public Planeta() {
		
	}
	public Planeta (String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia, double distanciaAlSol, double orbitaAlSol, ArrayList<Object> satelites) {
		this.nombre=nombre;
		this.masa=masa;
		this.diametroMedio=diametroMedio;
		this.periodoRotacion=periodoRotacion;
		this.periodoTraslacion=periodoTraslacion;
		this.distanciaMedia=distanciaMedia;
		this.distanciaAlSol=distanciaAlSol;
		this.orbitaAlSol=orbitaAlSol;
		this.satelites=satelites;
	}

	//GET
	public double getDistanciaAlSol() {
		return distanciaAlSol;
	}
	public double getOrbitaAlSol() {
		return orbitaAlSol;
	}
	public ArrayList<Object> getSatelites() {
		return satelites;
	}
	//SETTERS
	public void setDistanciaAlSol(double distanciaAlSol) {
		this.distanciaAlSol=distanciaAlSol;
	}
	public void setOrbitaAlSol(double orbitaAlSol) {
		this.orbitaAlSol=orbitaAlSol;
	}
	public void setSatelites(ArrayList<Object> satelites) {
		this.satelites=satelites;
	}
	@Override
	public void mostrarDatos() {
		System.out.println("Planeta data: " + nombre);
		System.out.printf("  Masa: %.2f\n", masa); // Use printf for formatted output
		System.out.printf("  Diametro medio: %.2f\n", diametroMedio);
		System.out.printf("  Periodo Rotacion: %.2f\n", periodoRotacion);
		System.out.printf("  Periodo Traslacion: %.2f\n", periodoTraslacion);
		// ... and so on for other properties using printf
		System.out.printf("  Distancia al sol: %.2f\n", distanciaAlSol);
		System.out.printf("  Orbita al sol: %.2f\n", orbitaAlSol);

		// Handle Satellites (if any)
		if (satelites != null && !satelites.isEmpty()) {
			System.out.print("  Satélites: ");
	        for (Object satelite : satelites) {
	            System.out.print(satelite + " ");
	        }
	        System.out.println();
		} else {
			 System.out.println("  No satelites encontrados.");
		 }
	}	
}
