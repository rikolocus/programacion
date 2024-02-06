package ud02;

public class Pajaro {
	
	String nombre;
	int posX;
	int posY;
	
	public Pajaro() {
	}
	public Pajaro(String nombre) {
		this.nombre=nombre;
	}
	public Pajaro(String nombre, int posX, int posY) {
			this.nombre = nombre;
			this.posX = posX;
			this.posY = posY;
	}
	double volar(int posX, int posY) {
		double desplazamiento = (Math.sqrt(posX*posY + posX*posY));
	return desplazamiento;
	}
	public static void main (String[] args) {
		Pajaro pajaro1 = new Pajaro ("WoodPecker", 50, 50);
		double d1 = pajaro1.volar(50, 50);
		System.out.printf("\nEl desplazamiento de %s ha sido %.2f", pajaro1.nombre,d1);
		
		Pajaro pajaro2 = new Pajaro ("Piolín", 30,30);
		double d2 = pajaro2.volar(pajaro2.posX, pajaro2.posY);
		System.out.printf("\nEl desplazamiento de %s ha sido %.2f", pajaro2.nombre,d2);
		
	}
}
