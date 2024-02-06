package ud02;

public class Coche {

	private String marca;
	private String modelo;
	
	public Coche() {
		
	}
	
	public Coche (String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	public String getMarcaModelo() {
		return marca + " " +modelo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1 = new Coche();
		Coche c2 = new Coche("Hyundai", "i10");
		System.out.println("El vehículo uno es un: " + c1.getMarcaModelo());
		System.out.println("El vehículo dos es un: " + c2.getMarcaModelo());
	}

}
