package vehiculos;

public class Coche extends VehiculoTerrestre {

	private boolean aireAcondicionado;
	
	public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
		super(matricula, modelo, numRuedas);
		if (matricula.length()!=7||!matricula.substring(0, 4).matches("[0-9]+")||!matricula.substring(4).matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException ("La matricula debe contener 4 números y 3 letras");
		}
		this.setAireAcondicionado(aireAcondicionado);
		// TODO Auto-generated constructor stub
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	
	@Override
	public String imprimir() {
		return super.imprimir() + " Número de Ruedas: "+numRuedas+" Aire Acondicionado: "+aireAcondicionado; 
	}
}
