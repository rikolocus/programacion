package astros;

public class Satelite extends Astros {

	private double distanciaAlPlaneta;
	private double orbitaPlanetaria;
	
	//GET
	public double getDistanciaAlPlaneta() {
		return distanciaAlPlaneta;
	}
	public double getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}
	//SETTERS
	public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
		this.distanciaAlPlaneta=distanciaAlPlaneta;
	}
	public void setOrbitaPlanetaria(double orbitaPlanetaria) {
		this.orbitaPlanetaria=orbitaPlanetaria;
	}
	//DATOS
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.printf("Planeta data:" + nombre);
		System.out.printf("  Masa: %.2f\n", masa); // Use printf for formatted output
		System.out.printf("  Diametro medio: %.2f\n", diametroMedio);
		System.out.printf("  Periodo Rotacion: %.2f\n", periodoRotacion);
		System.out.printf("  Periodo Traslacion: %.2f\n", periodoTraslacion);
		// ... and so on for other properties using printf
		System.out.printf("  Distancia al Planeta: %.2f\n", distanciaAlPlaneta);
		System.out.printf("  Orbita planetaria: %.2f\n", orbitaPlanetaria);
	}
}
