package ud5.gestionEmpleados;

import ud5.gestionEmpleados.Empresa.ElementoNoEncontradoException;
import ud5.gestionEmpleados.Empresa.PlantillaCompletaException;

public class TestEmpresa {

	public static void main(String[] args) throws PlantillaCompletaException, ElementoNoEncontradoException {
		// TODO Auto-generated method stub
		Empresa cataDaw = new Empresa ("CataDaw");
		Empleado paco = new Empleado ("Paco Rodriguez", "98765498R", 2023, 15000);
		Empleado ramon = new Empleado ("Ramon Solera", "45678912J", 2005, 20000);
		Empleado javier = new Empleado ("Javier Soler", "12378945J", 2021, 30000);
		cataDaw.contratar(paco);
		cataDaw.contratar(ramon);
		cataDaw.contratar(javier);
		cataDaw.subirTrienio(2);
		System.out.print(cataDaw.toString());
		System.out.print(paco.toString());
		System.out.print(ramon.toString());
		System.out.print(javier.toString());
		cataDaw.despedir(javier);
		System.out.print(cataDaw.toString());

	}

}
