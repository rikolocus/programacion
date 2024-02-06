package ud02;

public class Consumo {
	
	private double kilometros;
	private double litros;
	private int velocidadMedia;
	private double precioGasolina;

	public Consumo(double kilometros, double litros, int velocidadMedia, double precioGasolina) {
		this.kilometros=kilometros;
		this.litros=litros;
		this.velocidadMedia=velocidadMedia;
		this.precioGasolina=precioGasolina;
	}
	public double getTiempo() {
		return kilometros/velocidadMedia;
	}
	public double consumoMedio() {
		return (litros/kilometros)*100;
	}
	public double consumoEuros() {
		return (litros/precioGasolina)*100;
	}
	public void setKms(double kilometros) {
		this.kilometros=kilometros;
	}
	public void setLitros(double litros) {
		this.litros=litros;
	}
	public void setVmed(int velocidadMedia) {
		this.velocidadMedia=velocidadMedia;
	}
	public void setPgas(double precioGasolina) {
		this.precioGasolina=precioGasolina;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumo calculoConsumo1= new Consumo(120,60,80,1.20);
		System.out.printf("El vehículo uno ha consumido: %.2f horas %.2f litros/100km y %.2f Euros/100 litros", calculoConsumo1.getTiempo(), calculoConsumo1.consumoMedio(), calculoConsumo1.consumoEuros());
		//modifico los km;
		calculoConsumo1.setKms(200);
		calculoConsumo1.setLitros(60);
		calculoConsumo1.setPgas(1.50);
		calculoConsumo1.setVmed(120);
		System.out.printf("\nEl vehículo uno ha consumido: %.2f horas %.2f litros/100km y %.2f Euros/100 litros", calculoConsumo1.getTiempo(), calculoConsumo1.consumoMedio(), calculoConsumo1.consumoEuros());
	}
}
