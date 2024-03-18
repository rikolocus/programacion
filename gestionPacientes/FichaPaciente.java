package gestionPacientes;

public class FichaPaciente {
	
	private String nombre;
	private String apellidos;
	private int edad;

	public FichaPaciente (String nombre, String apellidos, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	public String getNombre() {
	    return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public int getEdad() {
		return this.edad;
	}
}
