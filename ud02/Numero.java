package ud02;

public class Numero {
	
	private int numero;
	
	public Numero() {
		numero=0;
	}
	public Numero(int num) {
		this.numero=num;
	}
	
	public void suma(int num) {
		numero += num;
	}
	public void resta(int num) {
		numero -= num;
	}
	
	public int getNumero() {
		return numero;
	}
	public int getValor() {
		return numero;
	}
	public int getDoble() {
		return numero*2;
	}
	public int getTriple() {
		return numero*3;
	}
	public void setNumero(int numero) {
		
		this.numero=numero;
	}
	public static void main(String[] arg) {

		Numero num2 = new Numero(6);
		System.out.println("El número inicial es " + num2.getNumero());
		num2.suma(50);
		System.out.println("Si le sumas 50 el resultado es " + num2.getNumero());
		num2.resta(32);
		System.out.println("Si le restas 25 el resultado es " + num2.getNumero());
		num2.getValor();
		System.out.println("El valor devuelto es "+ num2.getNumero());

		System.out.println("El doble del valor es " + num2.getDoble());

		System.out.println("El triple del valor es " + num2.getTriple());
		
		num2.setNumero(5);
		System.out.println("El valor final interno es " + num2.getNumero());
	}
}
