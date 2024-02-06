package ejercicioExamen;

public class Hospital {
	
	private int codHospital;
	private String nombreHospital;
	private String direccion;
	private int telefono;
	private int codPostal;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	
	public Hospital (int codHospital, String nombreHospital, String direccion, int telefono,int codPostal,int habitacionesTotales, int habitacionesOcupadas) {
		this.codHospital=codHospital;
		this.nombreHospital=nombreHospital;
		this.direccion=direccion;
		this.telefono=telefono;
		this.codPostal=codPostal;
		this.habitacionesTotales=habitacionesTotales;
		this.habitacionesOcupadas=habitacionesOcupadas;
	}
	//GET
	public int getCodHosp () {
		return codHospital;
	}

	public String getNombreHosp () {
		return nombreHospital;
	}
	public String getDireccion () {
		return direccion;
	}
	public int getTelefono () {
		return telefono;
	}
	public int getCodPostal () {
		return codPostal;
	}
	public int getHabitacionesTotales () {
		return habitacionesTotales;
	}
	public int getHabitacionesOcupadas () {
		return habitacionesOcupadas;
	}
	//SET
	public void setCodHosp (int codHospital) {
		this.codHospital=codHospital;
	}
	public void setNombreHospital (String nombreHospital) {
		this.nombreHospital=nombreHospital;
	}
	public void setDireccion (String direccion) {
		this.direccion=direccion;
	}
	public void setHabitacionesTotales (int habitacionesTotales) {
		this.habitacionesTotales=habitacionesTotales;
	}
	public void setHabitacionesOcupadas (int habitacionesOcupadas) {
		this.habitacionesOcupadas=habitacionesOcupadas;
	}
	public boolean ingreso () {
		if(habitacionesOcupadas<habitacionesTotales) {
			habitacionesOcupadas++;
			return true;
		} else {
			return false;
		}
	}
	public boolean alta () {
		if (habitacionesOcupadas!=0) {
			habitacionesOcupadas--;
			return true;
		} else {
			return false;
		}
	}
	public void mostrarHospital () {
		System.out.printf("Nombre: %s\nCódigo Hospital: %s\nDirección: %s\nTeléfono: %s\nCódigo Postal: %05d\nHabitaciones Ocupadas: %s\nHabitaciones Totales: %s\n", nombreHospital, codHospital, direccion, telefono, codPostal,habitacionesOcupadas,habitacionesTotales);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospitalRibera = new Hospital(1,"Hospital Ribera", "calle Ulisses", 965868378, 3581, 150,100);
		hospitalRibera.mostrarHospital();
		hospitalRibera.setHabitacionesTotales(150);
		hospitalRibera.setHabitacionesOcupadas(50);
		hospitalRibera.mostrarHospital();
		hospitalRibera.ingreso();
		hospitalRibera.mostrarHospital();
		hospitalRibera.alta();
		hospitalRibera.mostrarHospital();

	}

}
