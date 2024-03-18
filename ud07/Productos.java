package ud07;

import java.util.*;

public class Productos {
	
	private int cantidad;
	private double precio;
	private String nombre;
	
	public Productos (String nombre) {
		
		int minP= 1;
		int maxP= 350;
		this.cantidad = (int)(Math.random()*(101));
		this.precio = (double)(Math.random()*(maxP-minP+1)+minP);
		this.nombre=nombre;
	}
	
	public String mostrarDatos() {
		return "Nombre: " + this.nombre + " Cantidad: " + String.format("%02d",this.cantidad) + " Precio(€): " + String.format("%.2f",this.precio);
	}
	
	public static void main(String[] args) {
		
		ArrayList <Productos> lista= new ArrayList<>();
		int i = (int)(Math.random()*10+1);
		
		for (int j=1; j<=i; j++) {
			String nombreP= "Producto"+	String.format("%02d", j);
			Productos producto = new Productos(nombreP);
			lista.add(producto);
		}
		for(Productos o:lista) {
			System.out.println(o.mostrarDatos());
		}

	}

}
