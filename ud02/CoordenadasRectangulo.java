package ud02;

import java.awt.Rectangle;
import java.util.Random;

public class CoordenadasRectangulo {
	
	public static void main(String[] args) {
		Random ran = new Random();
	    // Instanciamos el objeto rect indicando posicion y dimensiones
		Rectangle rect = new Rectangle( 50, 50, 150, 150 );
	    //Consultamos las coordenadas x e y del rectangulo
	    System.out.println( "\n-- Coordenadas esquina superior-izqda. --");
	    System.out.println("\tx = " + rect.x + "\n\ty = " + rect.y);
	    // Consultamos las dimensiones (altura y anchura) del rectangulo
	    System.out.println( "\n------------- Dimensiones ---------------");
	    System.out.println("\tAlto = " + rect.height );
	    System.out.println( "\tAncho = " + rect.width);
	    //Cambiar dimensiones del rectangulo
	    rect.x= ran.nextInt(400);
	    rect.y= ran.nextInt(400);
	    rect.height=100;
	    rect.width=100;
	    rect.setSize(200, 200);
	    System.out.println( "\n-- Nuevos valores de los atributos --");
	    System.out.println("\tx = " + rect.x + "\n\ty = " + rect.y);
	    System.out.println("\tAlto = " + rect.height );
	    System.out.println( "\tAncho = " + rect.width);
	  }
	 }