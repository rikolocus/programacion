package ejercicioExamen;

public class Libro {
	
	private String titulo;
	private String autor;
	private String editorial;
	private int numEjemplaresTotales;
	private int numPrestados;
	private int codLibro;
	
	public Libro () {
		
	}
	public Libro (String titulo, String autor, String editorial, int numEjemplaresTotales, int numPrestados, int codLibro) {
		this.titulo=titulo;
		this.autor=autor;
		this.codLibro=codLibro;
		this.editorial=editorial;
		this.numEjemplaresTotales=numEjemplaresTotales;
		this.numPrestados=numPrestados;
	}
	
	//SET
	public void setCodLibro (int codLibro) {
		this.codLibro=codLibro;
	}

	public void setTitulo (String titulo) {
		this.titulo=titulo;
	}
	public void setAutor (String autor) {
		this.autor=autor;
	}
	public void setEditorial (String editorial) {
		this.editorial=editorial;
	}
	public void setNumEjemplaresTotales (int numEjemplaresTotales) {
		this.numEjemplaresTotales=numEjemplaresTotales;
	}
	public void setNumPrestados (int numPrestados) {
		this.numPrestados=numPrestados;
	}
	public int getCodLibro() {
		return codLibro;
	}
	public String getTitulo () {
		return titulo;
	}
	public String getAutor () {
		return autor;
	}
	public String getEditorial () {
		return editorial;
	}
	public int getNumEjemplaresTotales() {
		return numEjemplaresTotales;
	}
	public int getNumPrestados () {
		return numPrestados;
	}
	public boolean prestamo () {
		if (numPrestados<numEjemplaresTotales) {
			numPrestados++;
			return true;
		} else {
			return false;
		}
	}
	public boolean devolucion () {
		if (numPrestados>0) {
			numPrestados--;
			return true;
		} else {
			return false;
		}
	}
	public boolean perdido () {
		if (numEjemplaresTotales>0) {
			numEjemplaresTotales--;
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libroInformatica = new Libro("Red", "Miguel Cervantes", "MiCasa", 2, 10, 1);
		System.out.printf("Editorial: %s\n", libroInformatica.getEditorial());
		libroInformatica.setEditorial("La tuya");
		libroInformatica.prestamo();
		libroInformatica.prestamo();
		System.out.printf("Préstamos: %s\n",libroInformatica.getNumPrestados());
		libroInformatica.devolucion();
		System.out.printf("Préstamos: %s\n",libroInformatica.getNumPrestados());
		libroInformatica.perdido();
		System.out.printf("Ejemplares: %s\n",libroInformatica.getNumEjemplaresTotales());
		System.out.printf("%02d\n%s\n%s\n%s\n%s\n%s", libroInformatica.getCodLibro(), libroInformatica.getTitulo(), libroInformatica.getAutor(), libroInformatica.getEditorial(), libroInformatica.getNumEjemplaresTotales(), libroInformatica.getNumPrestados());
	}

}
