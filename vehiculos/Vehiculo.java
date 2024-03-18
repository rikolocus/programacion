package vehiculos;

public abstract class Vehiculo {
	
	final String matricula;
	final String modelo;
	
	public Vehiculo (String matricula, String modelo) {
		this.matricula=matricula;
		this.modelo=modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String imprimir() {
		return "\nMatrícula: " + matricula + " Modelo: " + modelo;
	}
}
