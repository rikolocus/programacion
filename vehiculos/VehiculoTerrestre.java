package vehiculos;

public class VehiculoTerrestre extends Vehiculo {
	
	final int numRuedas;

	public VehiculoTerrestre(String matricula, String modelo, int numRuedas) {
		super(matricula, modelo);
		this.numRuedas=numRuedas;
		// TODO Auto-generated constructor stub
	}
	
	public String imprimir() {
		return super.imprimir() + " Número de Ruedas "+numRuedas; 
	}

}
