package gestionPacientes;

import java.util.*;

public class Archivador {
	
	private List<FichaPaciente> fichas;
	
	public Archivador () {
		this.fichas = new ArrayList<>();
	}
	
	public void addFichas(FichaPaciente ficha) {
		this.fichas.add(ficha);
	}
	
	public void removeFichas(FichaPaciente ficha) {
		this.fichas.remove(ficha);
	}
	
	public int getSize() {
		return fichas.size();
	}
	
	public void mostrarDatos() {
		System.out.println("Tamaño de la lista: " + getSize());
		for (FichaPaciente f:this.fichas) {
			System.out.println("\nNombre: " + f.getNombre() + "\nApellidos: " + f.getApellidos() + "\nedad: " + f.getEdad());
		}
	}
}
