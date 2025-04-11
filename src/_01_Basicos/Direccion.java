package _01_Basicos;

public class Direccion {
	// Atributos
	private String calle;
	private String ciudad;
	private String codigoPostal;

	// Constructor
	public Direccion(String calle, String ciudad, String codigoPostal) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + "]";
	}

}
