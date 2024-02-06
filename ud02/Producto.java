package ud02;

public class Producto {

	private int codProducto, stock;
	private double peso, precio;
	private String nombreProducto, descripcion, categoria;
	
	public Producto(int codProducto, String nombreProducto, String descripcion, String categoria, double peso, double precio, int stock) {
		this.codProducto=codProducto;
		this.nombreProducto=nombreProducto;
		this.descripcion=descripcion;
		this.categoria=categoria;
		this.peso=peso;
		this.precio=precio;
		this.stock=stock;
	}
	public void aumentaStock (int masStock) {
		stock = stock+masStock;
	}
	public void disminuyeStock (int menosStock) {
		stock = stock-menosStock;
	}
	public double ivaProducto () {
		return (precio*21/100);
	}
	public double precioFinal () {
		return precio+ivaProducto();
	}
	public void mostrarDatos () {
		System.out.printf("\nLos datos del producto son: \nNúm: %s \nNombre: %s \nDescripción: %s \nCategoría: %s \nPeso: %s gramos \nPrecio: %s € \nStock: %s unidades\n", codProducto, nombreProducto, descripcion, categoria, peso, precio, stock );
		
	}
	public static void main (String [] args) {
		Producto productoHardware = new Producto(01, "Memoria RAM Kingston", "Memoria de 8GB", "Memoria RAM", 100, 80.00, 10);
		Producto productoSoftware = new Producto(02, "Panda Antivirus 2023", "Licencia Antivirus Panda 1 año", "Antivirus", 0, 30.00, 20);

		productoHardware.mostrarDatos();
		productoSoftware.mostrarDatos();
		productoHardware.aumentaStock(12);
		productoSoftware.disminuyeStock(5);
	
		productoHardware.mostrarDatos();
		productoSoftware.mostrarDatos();
		System.out.printf("\nEl IVA de los productos es: %.2f € y %.2f € y el precio final es: %.2f € y %.2f €", productoHardware.ivaProducto(), productoSoftware.ivaProducto(), productoHardware.precioFinal(), productoSoftware.precioFinal() );
	}
}
