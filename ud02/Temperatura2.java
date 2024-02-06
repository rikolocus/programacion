package ud02;

public class Temperatura2 {

	
	public double celsiusToFarenheit(double cel) {
		return (1.8*cel)+32;
	}
	public double farenheitToCelsius(double far) {
		return (far-32)/1.8;
		
	}
	public static void main (String [] args) {
		
		Temperatura2 temp1= new Temperatura2();
		double far=temp1.celsiusToFarenheit(30);
		double cel=temp1.farenheitToCelsius(50);
		
		System.out.println("30 grados Celsius son " + Math.round(far) + " grados Farenheit");
		System.out.printf("50 grados Farenheit son " + Math.round(cel) + " grados Celsius");

	}
}
