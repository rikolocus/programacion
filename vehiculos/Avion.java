package vehiculos;

public class Avion extends VehiculoAereo {

	private double tiempoVueloMax;
	
	public Avion(String matricula, String modelo, int numAsientos, double tiempoVueloMax) {
		super(matricula, modelo, numAsientos);
		this.tiempoVueloMax=tiempoVueloMax;
		// TODO Auto-generated constructor stub
	}

	public double getTiempoVueloMax() {
		return tiempoVueloMax;
	}

	public void setTiempoVueloMax(double tiempoVueloMax) {
		this.tiempoVueloMax = tiempoVueloMax;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + " Tiempo de Vuelo Máximo: "+tiempoVueloMax; 
	}
}
