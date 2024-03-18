package astros;

import java.util.ArrayList;
import java.util.Scanner;

public class mainAstros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		ArrayList<Object> serieAstros = new ArrayList<>();
	
		while(true) {
			System.out.println("Quiere introducir un astro?: (y/n)");
			String choice = tec.nextLine();
			if(choice.toLowerCase().equals("y")) {
				System.out.println("Va a introducir un planeta o un satelite) (p/s)");
				choice = tec.nextLine();
				if (choice.toLowerCase().equals("s")) {
					System.out.println("Introduce datos: Nombre, masa, diametro, perioroRot, periordoTrasla, distanciaMedia, distanciaAlPlaneta, orbitaPlanetaria:y ");
					Satelite satelite1 = new Satelite();
					satelite1.setNombre(tec.next());
					satelite1.setMasa(tec.nextDouble());
					satelite1.setDiametroMedio(tec.nextDouble());
					satelite1.setPeriodoRotacion(tec.nextDouble());
					satelite1.setperiodoTraslacion(tec.nextDouble());
					satelite1.setDistanciaMedia(tec.nextDouble());
					satelite1.setDistanciaAlPlaneta(tec.nextDouble());
					satelite1.setOrbitaPlanetaria(tec.nextDouble());
					serieAstros.add(satelite1);
				} else if (choice.toLowerCase().equals("p")) {
					System.out.println("Introduce datos: Nombre, masa, diametro, perioroRot, periordoTrasla, distanciaMedia, distanciaSol, orbitaSol, nombre satelite: ");
					Planeta planeta1 = new Planeta();
					planeta1.setNombre(tec.next());
					planeta1.setMasa(tec.nextDouble());
					planeta1.setDiametroMedio(tec.nextDouble());
					planeta1.setPeriodoRotacion(tec.nextDouble());
					planeta1.setperiodoTraslacion(tec.nextDouble());
					planeta1.setDistanciaMedia(tec.nextDouble());
					planeta1.setDistanciaAlSol(tec.nextDouble());
					planeta1.setOrbitaAlSol(tec.nextDouble());
					ArrayList<Object> satelitesPlaneta = new ArrayList<>();
			        satelitesPlaneta.add(tec.next());
					planeta1.setSatelites(satelitesPlaneta);
					serieAstros.add(planeta1);
					tec.nextLine();
				}	
			} else {
				break;
			}
		}
		for (Object astro : serieAstros) {
			((Astros) astro).mostrarDatos();
		}
		tec.close();
	}

}
