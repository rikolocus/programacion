package astros;

public abstract class Astros {
	
	protected String nombre;
	protected double masa;
	protected double diametroMedio;
	protected double periodoRotacion;
	protected double periodoTraslacion;
	protected double distanciaMedia;
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public double getMasa() {
		return masa;
	}
	public double getDiametroMedio() {
		return diametroMedio;
	}
	public double getPeriodoRotacion() {
		return periodoRotacion;
	}
	public double getPeriodoTraslacion() {
		return periodoTraslacion;
	}
	public double getDistanciaMedia() {
		return distanciaMedia;
	}

	//SETTERS
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setMasa(double masa) {
		this.masa=masa;
	}
	public void setDiametroMedio(double diametroMedio) {
		this.diametroMedio=diametroMedio;
	}
	public void setPeriodoRotacion(double periodoRotacion) {
		this.periodoRotacion=periodoRotacion;
	}
	public void setperiodoTraslacion(double periodoTraslacion) {
		this.periodoTraslacion=periodoTraslacion;
	}
	public void setDistanciaMedia(double distanciaMedia) {
		this.distanciaMedia=distanciaMedia;
	}
	//DATOS
	public abstract void mostrarDatos();
}
