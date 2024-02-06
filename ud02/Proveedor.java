package ud02;

public class Proveedor {

	private String cif;
	private String nombreEmpresa;
	private String descripcion;
	private String sector;
	private String direccion;
	private int telefono;
	private String poblacion;
	private String codPostal;
	private String correo;
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}
	public Proveedor(String cif, String nombreEmpresa, String descripcion, String sector, String direccion, int telefono, String poblacion, String codPostal, String correo) {
		this.cif=cif;
		this.codPostal=codPostal;
		this.correo=correo;
		this.descripcion=descripcion;
		this.direccion=direccion;
		this.nombreEmpresa=nombreEmpresa;
		this.poblacion=poblacion;
		this.sector=sector;
		this.telefono=telefono;
	}
	
	public String getCif() {
		return cif;
	}
	public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSector() {
        return sector;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getCorreo() {
        return correo;
    }
    public boolean verificarCorreo () {
    	return correo.contains("@");
    }
    public void setSector (String sector) {
    	this.sector=sector;
    }
    public void mostrarDatos() {
    	System.out.println("CIF: " + cif + "\nNombre de la Empresa: " + nombreEmpresa + "\nDescripción: " + descripcion + "\nSector: " + sector + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nPoblación: " + poblacion + "\nCódigo Postal: " + codPostal + "\nCorreo: " + correo);
    }
    public static void main (String[] args) {
    	Proveedor proveedor = new Proveedor("B1234567", "Carne SL", "Empresa al por mayor de carne", "Alimentación", "calle Ulisses 23", 965868686, "Benidorm", "03501", "carne@gmail.es");
    	proveedor.setSector("Alimentación y droguería");
    	System.out.println("¿Es un correo válido? " + proveedor.verificarCorreo());
    	proveedor.mostrarDatos();
    }
}
