package ud02;

public class Moto {
	 
	private int velocidad;
	
	public Moto() {
		velocidad=0;
	}
	public int getVelocidad () {
		return velocidad;
	}
	public void acelera(int mas) {
		velocidad = velocidad+mas;
	}
	public void frena (int menos) {
		velocidad = velocidad-menos;
	}
	
	
	public static void main (String[] args) {
		Moto moto1 = new Moto();
		int a = moto1.getVelocidad();
		
		System.out.printf("La velocidad de la moto es %s km/h.", a);
		
		moto1.acelera(50);
		
		System.out.printf("\nLa velocidad de la moto ha acelerado a %s km/h", moto1.getVelocidad());
		
		moto1.frena(20);
		
		System.out.printf("\nLa velocidad de la moto se ha reducido a %s km/h", moto1.getVelocidad());
			
	}
}
