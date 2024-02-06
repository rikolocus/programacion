package ud02;

public class Libro {

	private String titulo, autor, editorial;
	private int numeroDeEjemplares, numeroDePrestamos;
	
	public Libro () {
		
	}
	public Libro (String titulo, String autor, String editorial, int numeroDeEjemplares, int numeroDePrestamos) {
		this.autor=autor;
		this.editorial=editorial;
		this.numeroDeEjemplares=numeroDeEjemplares;
		this.numeroDePrestamos=numeroDePrestamos;
		this.titulo=titulo;
	}
	public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumeroDeEjemplaresTotales(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public void setNumeroDePrestados(int numeroDePrestamos) {
        this.numeroDePrestamos = numeroDePrestamos;
    }
	public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public int getNumeroDePrestamos() {
        return numeroDePrestamos;
    }
    public int getnumeroDeEjemplaresDisponibles() {
    	return numeroDeEjemplares-numeroDePrestamos;
    }
    public boolean prestamo() {
        if (getNumeroDeEjemplares() > 0) {
            numeroDePrestamos++;
            System.out.println("Se ha anotado el préstamo.");
            return true;
        } else {
            System.out.println("No quedan ejemplares disponibles.");
            return false;
        }
    }

    public boolean devolucion() {
        if (numeroDePrestamos > 0) {
            numeroDePrestamos--;
            System.out.println("Devolución anotada.");
            return true;
        } else {
            System.out.println("No hay préstamos del libro referido.");
            return false;
        }
    }

    public boolean perdido() {
        if (numeroDeEjemplares > 0) {
            numeroDeEjemplares--;
            System.out.println("Pérdida registrada.");
            return true;
        } else {
            System.out.println("No quedan ejemplares.");
            return false;
        }
    }
    public void mostrarDatos() {
        System.out.printf("Título: %s\nAutor: %s\nEditorial: %s\nNúmero de Ejemplares: %d\nNúmero de Ejemplares Disponibles: %d\nNúmero de Prestamos: %d\n", titulo, autor, editorial, numeroDeEjemplares, getnumeroDeEjemplaresDisponibles(), numeroDePrestamos);
    }
	public static void main(String[] args) {
        // Ejemplo de uso
        Libro libroInformatica1 = new Libro("Java Programming", "John Doe", "Editorial XYZ", 10, 3);

        System.out.println("El título del libro es: " + libroInformatica1.getTitulo());
        // Mostrar datos del libro
             
        libroInformatica1.setAutor("Editorial Anaya");
        // Prestar libro
        libroInformatica1.prestamo();
        libroInformatica1.prestamo();
        System.out.println("El número de prestamos es: " + libroInformatica1.getNumeroDePrestamos());

        libroInformatica1.devolucion();
        
        System.out.println("El número de prestamos es: " + libroInformatica1.getNumeroDePrestamos());
        
        libroInformatica1.perdido();
        
        System.out.println("El número de ejemplares restantes es: " + libroInformatica1.getNumeroDeEjemplares());
        
        libroInformatica1.mostrarDatos();
    }
}
