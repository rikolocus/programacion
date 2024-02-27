package ud5.gestionEmpleados;

public class jornadaCompleta extends Empleado{
	
	private int horasExtras;
	
	public jornadaCompleta (String nombre, String dni, int añoDeIngreso, double sueldoBrutoAnual, int horasExtras) {
		super (nombre, dni, añoDeIngreso, sueldoBrutoAnual);
		this.horasExtras=horasExtras;
	}
	
	public double calcularSalarioCompleta() {
        // Lógica para calcular el salario para jornada completa
        double salarioBaseSemanal = getSueldoBrutoAnual() / 52;
        double salarioBaseDiario = salarioBaseSemanal / 5; // 5 días laborables a la semana
        
        // Si hay horas extras, se calcula el salario con las horas extras
        if (horasExtras > 0) {
            double salarioConHorasExtras = salarioBaseDiario * 8; // 8 horas diarias (jornada completa)
            salarioConHorasExtras += (salarioBaseDiario / 8) * horasExtras; // Añadir salario por horas extras
            return salarioConHorasExtras;
        } else {
            // Si no hay horas extras, se devuelve el salario base
            return salarioBaseSemanal;
        }
    }
}

