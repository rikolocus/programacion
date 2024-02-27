package ud5.gestionEmpleados;

public class mediaJornada extends Empleado{
	
	private final int horasTrabajadas=30;
	
	public mediaJornada (String nombre, String dni, int añoDeIngreso, double sueldoBrutoAnual) {
		super (nombre,dni,añoDeIngreso,sueldoBrutoAnual);
	}
	
	//metodo reducción de sueldo;
	
	public double reduccionSueldo (){
		double salario = getSueldoBrutoAnual()*60/100;
		return salario;
	}
	
}
