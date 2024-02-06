package ud5.gestionEmpleados;

import java.util.*;

public class Empresa {
	
	//Variables necesarias: constante, nombre empresa, array de la plantilla, numEmpleados;
	private final int MAX_EMPLEADOS=10;
	private String nombre;
	private Empleado [] plantilla;
	private int numEmpleado;
	
	//Constructor de la Empresa;
	public Empresa (String nombre) {
		this.nombre=nombre;
		this.plantilla = new Empleado[MAX_EMPLEADOS];
		this.numEmpleado=0;
	}
	
	//Excepción con super para acceder a la clase padre;
	class PlantillaCompletaException extends Exception {
		public PlantillaCompletaException() {
			super("La plantilla está completa");
		}
	}
	
	//Contratar empleado comprobando que numEmpleados no es mayor que el número máximo=10, introduce los datos en la plantilla [numEmpleados que es igual al argumento e de la clase Empleado, después suma la cuenta del numEmpleados, si está completa lanza la excepción de plantilla completa;
	public void contratar (Empleado e) throws PlantillaCompletaException {

		if (numEmpleado<MAX_EMPLEADOS) {
			this.plantilla[numEmpleado] = e;
			numEmpleado++;
		} else {
			throw new PlantillaCompletaException();
		}
	}
	
	//Excepción con super para acceder a la clase padre en caso de que no exista el empleado y no se pueda despedir;
	class ElementoNoEncontradoException extends Exception {
		public ElementoNoEncontradoException() {
			super ("No se ha encontrado al empleado referido");
		}
	}
	
	//Despedir empleado, se comprueba que coincide el numEmpleado con el array y se transfiere la información del posterior al despedido, y el resto hace una sucesión de copiado del anterior, hasta el último que debe ser NULL; Para ello generamos un boolean que se encontrado = false, y la condición de comparación es que tenga datos !=NULL, que no llegue el máximo y que sea no sea true (!encontrado). La comparación se hace con equal;
	public void despedir (Empleado e) throws ElementoNoEncontradoException {
		
		boolean encontrado = false;
		int posicionEncontrado = 0;
		for (int i=0; plantilla[i] != null&&i<MAX_EMPLEADOS&&!encontrado;i++) {
			if (plantilla[i].equals(e)) {
				encontrado=true;
				posicionEncontrado=i;
			}
		}
		//Pasamos por la posición para traer los datos del posterior al anterior posición. Utilizamos la posiciónEncontrado para no empezar desde 0, es decir, imaginemos que se encuentra en la cinco pues empieza desde esa posición;
		if (encontrado) {
			
			for (int j=posicionEncontrado; j<MAX_EMPLEADOS-1; j++ ) {
				plantilla[j] = plantilla[j+1];
			}
			//liberamos la última posición;
			plantilla[MAX_EMPLEADOS-1] = null;
		} else {
			throw new ElementoNoEncontradoException();
		}
	}
	
	//Incrementamos el sueldo a aquellos que han cumplido justamente tres años;
	public void subirTrienio (double porcentaje) {
		
		for (int i=0; i<MAX_EMPLEADOS; i++) {
			if (plantilla[i].antiguedad()==3) {
				plantilla[i].incrementarSueldo(porcentaje);
			}
		}
	}
	
	//Devuelve la info de la empresa y todos los empleados;
	public String toString() {
		f
		return (nombre + "\n" +  for
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
