package vehiculos;

public class VehiculoAcuatico extends Vehiculo {
	
	final double eslora;

	public VehiculoAcuatico(String matricula, String modelo, double eslora) {
		super(matricula, modelo);
		if (matricula.length()<3|| matricula.length()>10||!matricula.chars().allMatch(Character::isLetter)) {
			throw new IllegalArgumentException ("La matrícula debe tener entre 3 y 10 letras");
		}
		this.eslora=eslora;
		// TODO Auto-generated constructor stub
	}
	
	public String imprimir() {
		return super.imprimir() + " Eslora "+eslora; 
	}


}
