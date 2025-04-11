package _01_Basicos;

public class Persona {
	/*
	 * =================
	 * =   ENUNCIADO   =
	 * =================
	 * 
	 * Crea una clase Persona con atributos básicos:
	 * nombre, edad, peso
	 * 
	 * Haz un constructor para inicializar dichos atributos.
	 * 
	 * Haz otra clase para el método main.
	 * Instancia un objeto de la clase persona.
	 * Muestra sus atributos.
	 */
	
	String nombre;
	int edad;
	double peso;
	
	// Constructor
	public Persona(String nombre, int edad, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	

	public static void main(String[] args) {
		Persona persona = new Persona("Juan", 25, 70.5);
		System.out.println("Nombre: " + persona.nombre);
		System.out.println("Edad: " + persona.edad);
		System.out.println("Peso: " + persona.peso);
	}
	
	

}
