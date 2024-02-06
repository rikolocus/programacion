package ud02;

import java.time.LocalDate;

public class Medico {

	private int codMedico, telefono, codPostal;
	private String nombre, apellidos, dni, direccion, poblacion, especialidad;
	private double sueldo, retencion;
	private LocalDate fechaNacimiento;
	public Medico (int codMedico, String nombre, String apellidos, String dni, String direccion, int telefono, String poblacion, int codPostal, LocalDate fechaNacimiento, String especialidad, double sueldo ){
		this.codMedico=codMedico;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.direccion=direccion;
		this.telefono=telefono;
		this.poblacion=poblacion;
		this.codPostal=codPostal;
		this.fechaNacimiento=fechaNacimiento;
		this.especialidad=especialidad;
		this.sueldo=sueldo;
	}
	
	//getter
	public int getCodMedico(){
		return codMedico;
	}

	public String getNombre(){
		return nombre;
	}

	public String getApellidos(){
		return apellidos;
	}

	public String getDni(){
		return dni;
	}
	
	public String getDireccion(){
		return direccion;
	}

	public int getTelefono(){
		return telefono;
	}

	public String getPoblacion(){
		return poblacion;
	}

	public int getCodPostal(){
		return codPostal;
	}

	public LocalDate getFechaNacimiento(){
		return fechaNacimiento;
	}

	public String getEspecialidad(){
		return especialidad;
	}
	
	public double getSueldo(){
		return sueldo;
	}
	
	//setter
	public void setCodMedico(int codMedico){
		this.codMedico=codMedico;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}

	public void setDni(String dni){
		this.dni=dni;
	}
	
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}

	public void setTelefono(int telefono){
		this.telefono=telefono;
	}

	public void setPoblacion(String poblacion){
		this.poblacion=poblacion;
	}

	public void setCodPostal(int codPostal){
		this.codPostal=codPostal;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento){
		this.fechaNacimiento=fechaNacimiento;
	}

	public void setEspecialidad(String especialidad){
		this.especialidad=especialidad;
	}
	
	public void setSueldo(double sueldo){
		this.sueldo=sueldo;
	}
	
	//
	
	public void setRetencionMedico(double porcentajeRetencion){
		double retencion = (porcentajeRetencion/100)*sueldo;
		this.retencion=retencion;
	}
	public double getRetencionMedico() {
		return retencion;
	}
	public double sueldoFinal(){
		return (sueldo-retencion);
	}

	public void mostrarDatos (){
		System.out.printf("Código Médico: %s\nNombre: %s\nApellidos: %s\nDNI: %s\nDirección: %s\nTeléfono: %s\nPoblación: %s\nCódigo Postal: %s\nFecha de Nacimiento: %s\nEspecialidad: %s\nSueldo: %s€\n", codMedico, nombre, apellidos, dni, direccion, telefono, poblacion, codPostal, fechaNacimiento, especialidad, sueldo);
	}

	public static void main (String[] args){
		Medico medicoDigestivo = new  Medico(1, "Paco", "Montes Alvado", "12345678P", "Calle Ramblas 1", 965881212, "Benidorm", 03501, LocalDate.of(1980, 1, 1), "Digestivo", 3500);
		Medico medicoTraumatologo= new Medico(2, "Antonio", "Mon Blanc", "13345678P", "Calle Ramblas 53", 965881213, "Benidorm", 03501, LocalDate.of(1986, 6, 30), "Traumatólogo", 3850);
		
		medicoTraumatologo.setSueldo(4000);
		medicoTraumatologo.getSueldo();

		medicoDigestivo.setDni("98765432R");
		medicoDigestivo.getDni();

		medicoTraumatologo.setRetencionMedico(30);
		medicoDigestivo.setRetencionMedico(29);

		medicoTraumatologo.mostrarDatos();
		System.out.printf("La retención es: %.2f€\nEl sueldo final es: %.2f€\n", medicoTraumatologo.getRetencionMedico(), medicoTraumatologo.sueldoFinal());
		medicoDigestivo.mostrarDatos();
		System.out.printf("La retención es: %.2f€\nEl sueldo final es: %.2f€\n", medicoDigestivo.getRetencionMedico(), medicoDigestivo.sueldoFinal());
	
	}	
}
