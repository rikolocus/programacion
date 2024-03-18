package vehiculos;

public class Moto extends VehiculoTerrestre {

	private String color;
	
	public Moto(String matricula, String modelo, int numRuedas, String color) {
		super(matricula, modelo, numRuedas);
		this.setColor(color);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String imprimir() {
		return super.imprimir() + " Número de Ruedas: "+numRuedas+" Color: "+color; 
	}
}
