package ud02;

public class Hospital {

	private int codHospital, telefono, codPostal, habitacionesTotales, habitacionesOcupadas;
	private String nombreHospital, direccion, poblacion;
	
	public Hospital (int codHospital, String nombreHospital, String direccion, int telefono, String poblacion, int codPostal, int habitacionesTotales, int habitacionesOcupadas) {
		this.codHospital=codHospital;
		this.codPostal=codPostal;
		this.direccion=direccion;
		this.habitacionesOcupadas=habitacionesOcupadas;
		this.habitacionesTotales=habitacionesTotales;
		this.nombreHospital=nombreHospital;
		this.poblacion=poblacion;
		this.telefono=telefono;
	}
	//Setters
	public void setcodHospital(int codHospital) {
		this.codHospital=codHospital;
	}
	public void setnombreHospital(String nombreHospital) {
		this.nombreHospital=nombreHospital;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion=poblacion;
	}
	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal=codPostal;
	}
	public void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas=habitacionesOcupadas;
	}
	public void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales=habitacionesTotales;
	}
	//Getters
	public int getcodHospital() {
		return codHospital;
	}
	public String getnombreHospital() {
		return nombreHospital;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public int getTelefono() {
		return telefono;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}
	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}
	public boolean ingreso() {
		if (habitacionesOcupadas<habitacionesTotales) {
			habitacionesOcupadas++;
			return true;
		} else {
			return false;
		}
	}
	public boolean alta() {
		if (habitacionesOcupadas>0) {
			habitacionesOcupadas--;
			return true;
		} else {
			return false;
		}
	}
	public void mostrarDatos() {
		System.out.printf("Código Hospital: %s\nNombre Hospital: %s\nDirección: %s\nTeléfono: %s\nPoblación: %s\nCódigo Postal: %s\nHabitaciones Totales: %d\nHabitaciones Ocupadas: %d\n", codHospital, nombreHospital, direccion, telefono, poblacion,codPostal, habitacionesTotales, habitacionesOcupadas);
    }
	
	public static void main(String [] args) {
		Hospital hospitalRibera= new Hospital(1, "Hospital Ribera", "Calle La Rambla 1", 965868377, "Benidorm", 03502, 50, 10);
		
		hospitalRibera.setHabitacionesTotales(60);
		System.out.println("El número total de habitaciones del Hospital Ribera es: "+ hospitalRibera.getHabitacionesTotales());
		
		hospitalRibera.ingreso();
		
		System.out.println("El número de habitaciones ocupadas es: "+ hospitalRibera.getHabitacionesOcupadas());
		
		hospitalRibera.alta();
		
		System.out.println("El número de habitaciones ocupadas es: "+ hospitalRibera.getHabitacionesOcupadas());
		
		hospitalRibera.mostrarDatos();
		
	}	
}