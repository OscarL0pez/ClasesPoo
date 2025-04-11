package _01_Basicos;

public class PersonaRelacion {
	/*
	 * =================
	 * =   ENUNCIADO   =
	 * =================
	 * 
	 * Relación entre las clases:
	 * 
	 * Crearás dos clases: Persona y Dirección.
	 * La clase Persona tiene como atributos: nombre, edad, dirección.
	 * La clase Dirección tiene como atributos: calle, ciudad, código postal.
	 * 
	 * Haz los constructores. Cada clase tiene su archivo. No te olvides
	 * de sobreescribir toString().
	 * 
	 * Haz un método main para utilizarlo todo.
	 * 
	 * La dirección de la Persona que instancies tiene que ser una Dirección completa.
	 */
	
	// Atributos
	private String nombre;
	private int edad;
	private Direccion direccion;
	
	// Constructor
	public PersonaRelacion(String nombre, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "PersonaRelacion [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	

}
