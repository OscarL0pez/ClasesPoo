package _00_EjerciciosBasicos;

public class Libro {
	/*
	 * =================
	 * =   ENUNCIADO   =
	 * =================
	 * 
	 * Hay una clase Libro.
	 * Tiene los atributos: titulo, autor, año de publicación.
	 * Define el constructor.
	 * 
	 * Sobreescribe el método toString:
	 * el formato debe ser 
	 * Título: El Quijote
	 * Autor: Cervantes
	 * Publicación: 1605
	 * 
	 * Cada atributo en una línea individual.
	 * 
	 * La clase tendrá un archivo, el método main otro.
	 * 
	 */

	// Atributos
	private String titulo;
	private String autor;
	private int anioPublicacion;
	// Constructor
	public Libro(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	}
	// Método toString
	
	@Override
	public String toString() {
		return "Título: " + titulo + "\n" +
				"Autor: " + autor + "\n" +
				"Publicación: " + anioPublicacion;
	}
}
