package vehiculos;

public class VehiculoAereo extends Vehiculo {
	
	final int numAsientos;
	
	public VehiculoAereo(String matricula, String modelo, int numAsientos) {
		super(matricula, modelo);
		if (matricula.length()!=10||!matricula.substring(0,4).matches("[a-zA-Z]+")||!matricula.substring(4).matches("[0-9]+")) {
			throw new IllegalArgumentException ("La matrícula debe tener 4 letras y 6 números");
		}
		this.numAsientos=numAsientos;
		// TODO Auto-generated constructor stub
	}
	
	public String imprimir() {
		return super.imprimir() + " Número de Asientos "+numAsientos; 
	}

	

}
