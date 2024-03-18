package gestionPacientes;

public class GestionPacientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivador archivo1 = new Archivador();
		FichaPaciente paciente1 = new FichaPaciente("Alberto", "Solera", 37);
		FichaPaciente paciente2 = new FichaPaciente("Paco", "Rodriguez", 25);
		FichaPaciente paciente3 = new FichaPaciente("Roberto", "Martinez", 36);
		archivo1.addFichas(paciente1);
		archivo1.addFichas(paciente2);
		archivo1.addFichas(paciente3);
		archivo1.mostrarDatos();
		archivo1.removeFichas(paciente2);
		archivo1.mostrarDatos();
	}

}
