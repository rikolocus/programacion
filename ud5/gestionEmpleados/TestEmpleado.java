package ud5.gestionEmpleados;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1 = new Empleado("Paco Lodeiro Carvajal", "12345678A", 2007, 20000);
		Empleado empleado2 = new Empleado("Roberto Lobato Muñeco", "87654321A", 2010, 15000);
		
		empleado2.incrementarSueldo(20);
		System.out.print(empleado2);
		
		empleado1.incrementarSueldo(10);
		System.out.print(empleado1);
		
		System.out.printf("El irpf correspondiente al empleado1 es: %s%%\n", Empleado.calcularIRPF(empleado1.getSueldoBrutoAnual())*100);
		System.out.printf("El irpf correspondiente al empleado2 es: %s%%\n", Empleado.calcularIRPF(empleado2.getSueldoBrutoAnual())*100);
		
	}

}
