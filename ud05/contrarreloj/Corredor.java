package ud05.contrarreloj;

public class Corredor {
	
	private static int ultimoDorsal = 0;
	private int dorsal;
	private String nombre;
	private double tiempo;
	
	//Constructor de corredor con atributos
	public Corredor (String n) {
		this.dorsal= generarDorsal();
		this.nombre = n;
		this.tiempo=0;
	}
	
	//Métodos get para obtener el tiempo, dorsal y nombre
	public double getTiempo() {
		return tiempo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	
	//Métodos set para poner tiempos, etc.
	public void setTiempo(double t) throws IllegalArgumentException {
		if (t<0) {
			throw new IllegalArgumentException ("El tiempo no puede ser negativo");
		}
		this.tiempo=t;
	}
	
	public void setTiempo(double t1, double t2) throws IllegalArgumentException {
		double tiempo = t2-t1;
		if (tiempo<0) {
			throw new IllegalArgumentException ("El tiempo utilizado no puede ser negativo");
		}
		this.tiempo=tiempo;
	}
	@Override
	public String toString() {
		return "(" + dorsal + ") - " + nombre + " - " + tiempo + " segundos";
	}
	@Override
	public boolean equals (Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass()!= o.getClass()) {
			return false;
		}
		Corredor dorsal1 = (Corredor) o;
		return dorsal == dorsal1.dorsal;
	}
	
	public int compareTo(Corredor o) {
        return Integer.compare(dorsal, o.dorsal);
    }
	public static int generarDorsal() {
		ultimoDorsal++;
		return ultimoDorsal;
	}
	public static void main(String[] args) throws IllegalArgumentException {
		Corredor corredor1= new Corredor("Alberto");
		Corredor corredor2= new Corredor("Paco");
		corredor1.setTiempo(1000);
		corredor2.setTiempo(2000, 3000);

		System.out.printf(corredor1.toString()+"\n"+ corredor2.toString());
	}

}
