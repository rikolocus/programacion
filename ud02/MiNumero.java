package ud02;

public class MiNumero {

	private int num;
	public MiNumero(int num) {
		this.num=num;
	}
	
	public int doble() {
		return (num*2);
	}
	public int triple() {
		return (num*3);
	}
	public int cuadruple() {
		return (num*4);
	}
	public int getValor() {
		return num;
	}
	public static void main(String [] args) {
		MiNumero calculo = new MiNumero(6);
		MiNumero calculo2 =new MiNumero(8);
		int calculoDoble = calculo.doble();
		int calculoTriple = calculo2.triple();
		int calculoCuadruple = calculo.cuadruple();
		System.out.println("El doble de " + calculo.getValor() + " es " +calculoDoble);
		System.out.println("El triple de ocho es "+ calculoTriple);
		System.out.println("El cuadruple de seis es " + calculoCuadruple);
	}
	
}
