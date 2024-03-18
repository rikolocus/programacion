package vehiculos;

public class Submarino extends VehiculoAcuatico {
	
	private double profundidadMaxima;

	public Submarino(String matricula, String modelo, double eslora, double profundidadMaxima) {
		super(matricula, modelo, eslora);
		this.setProfundidadMaxima(profundidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public double getProfundidadMaxima() {
		return profundidadMaxima;
	}

	public void setProfundidadMaxima(double profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}
	
	@Override
	public String imprimir() {
		return super.imprimir() + " Eslora: "+eslora+" Profuncidad Máxima: "+profundidadMaxima; 
	}

}
