package ud5.gestionEmpleados;

import java.util.Calendar;
import java.util.Objects;

public class Empleado {
	
	//ATRIBUTOS CLASE
	private String nombre, dni;
	private int añoDeIngreso;
	private double sueldoBrutoAnual;
	
	//CONSTRUCTOR CLASE
	public Empleado (String nombre, String dni, int añoDeIngreso, double sueldoBrutoAnual) {
		this.nombre=nombre;
		this.dni=dni;
		this.añoDeIngreso=añoDeIngreso;
		this.sueldoBrutoAnual=sueldoBrutoAnual;
	}
	
	//GET
	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getAñoDeIngreso() {
		return añoDeIngreso;
	}
	
	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}
	
	//CALCULA LA ANTIGUEDAD
	public int antiguedad() {
		int añoActual = Calendar.getInstance().get(Calendar.YEAR);
		return Math.max(0, añoActual-añoDeIngreso);
	}
	
	//CALCULA AUMENTO SUELDO
	public void incrementarSueldo(double porcentaje) {

		while (porcentaje<0||porcentaje>100) {
			System.out.println("Introduzca un porcentaje válido (entre 0 y 100)");
			
		}
		sueldoBrutoAnual = sueldoBrutoAnual+(sueldoBrutoAnual*porcentaje/100);
	}
	
	//DEVUELVE LOS DATOS DEL EMPLEADO
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nDNI: " + dni + "\nAño de ingreso: " + añoDeIngreso + "\nSueldo bruto anual: "  + sueldoBrutoAnual + "\n";
	}
	
	//COMPROBAR DNIS
	@Override
	public boolean equals(Object o) {
		//Verifica el objeto creado es igual al objeto que se comprueba
		if (o == this) {
			return true;
		} 
		//Verifica que tiene los parámetros por defecto (vacíos) y si el objeto pertenece a la misma clase.
		if (o == null || getClass()!= o.getClass()) {
			return false;
		}
		//Creo un objeto distinto (constante) para comprobar que el objeto "o" pertenece a la clase empleado.
		final Empleado empleado2 = (Empleado) o;
		return Objects.equals(this.dni, empleado2.dni);
		
	}
	
	//COMPARAR MENOR/MAYOR POR DNI
	public int compareTo(Empleado o) {
		return this.dni.compareTo(o.dni);
	}
	
	//CALCULO DE IRPF
	public static double calcularIRPF(double salario) {
		double irpf = 0;
		salario/=12;
		if (salario<0) {
			System.out.println("El salario debe ser superior 0");
		} else if (salario>=0&&salario<=800) {
			irpf=0.03;
		} else if (salario>800&&salario<=1000) {
			irpf=0.10;
		} else if (salario>1000&&salario<=1500) {
			irpf=0.15;
		} else if (salario>1500&&salario<=2100) {
			irpf=0.20;
		} else {
			irpf=0.30;
		}
		return irpf;
	}
}
