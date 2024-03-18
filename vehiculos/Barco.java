package vehiculos;

public class Barco extends VehiculoAcuatico {
	
	private boolean motor;
	
	public Barco(String matricula, String modelo, double eslora, boolean motor) {
		super(matricula, modelo, eslora);
		this.setMotor(motor);
		// TODO Auto-generated constructor stub
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	@Override
	public String imprimir() {
		return super.imprimir() + " Eslora: "+eslora+" Motor?: "+motor; 
	}
}
