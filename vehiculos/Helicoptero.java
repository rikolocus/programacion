package vehiculos;

public class Helicoptero extends VehiculoAereo {

	private int numHelices;
	
	public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
		super(matricula, modelo, numAsientos);
		this.numHelices=numHelices;
		// TODO Auto-generated constructor stub
	}

	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}
	@Override
	public String imprimir() {
		return super.imprimir() + " Número de Helices: "+numHelices; 
	}

}
