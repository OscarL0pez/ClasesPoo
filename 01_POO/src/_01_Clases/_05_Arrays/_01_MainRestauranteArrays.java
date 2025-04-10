package _01_Clases._05_Arrays;

import java.util.Arrays;

public class _01_MainRestauranteArrays {
	public static void main(String[] args) {
		
		//Instancia de un objeto restaurante
		Restaurante r1 = new Restaurante();
		r1.id = 1;
		r1.nombre = "McDonalds";
		
		//Declaración de array con asignaciones
		double[] pArray = new double[3];
		pArray[0] = 3.0;
		pArray[1] = 4.5;
		pArray[2] = 5.0;
		
		//r1.puntuaciones apunta al mismo array
		r1.puntuaciones = pArray;
		System.out.println("Array visto desde el restaurante: " 
							+ Arrays.toString(r1.puntuaciones));
		pArray[0] = 2.0;
		System.out.println(r1.puntuaciones[0]);
		
		//Array de Restaurantes
		Restaurante[] arrayRestaurante;
		arrayRestaurante = new Restaurante[3];
		
		//En arrayRestaurante meto a McDonalds (que tiene un array dentro
		//apuntando a pArray)
		arrayRestaurante[0] = r1;
		arrayRestaurante[0].puntuaciones[0] = 1.0; 
		System.out.println(pArray[0]);
		
		//Nuevo restaurante
		r1 = new Restaurante();
		r1.puntuaciones = new double[3];
		System.out.println(r1.puntuaciones[0]);
		
		//Cuidado!! arrayRestaurante[0] = r1 --> pArray
		r1.puntuaciones[1] = 3.5;
		System.out.println(arrayRestaurante[0].puntuaciones[1]);
		
		//Todos hacen referencia al mismo
		Restaurante r2 = r1;
		Restaurante r3 = r2;
		Restaurante r4 = r1;
		
		r2.puntuaciones[2] = 5.0;
		System.out.println(r2.puntuaciones[2]);
		System.out.println(r3.puntuaciones[2]);
		System.out.println(r4.puntuaciones[2]);
		
		System.out.println("------------------");
		mostrarPuntuacion(r2.puntuaciones[2]);
		mostrarPuntuacion(r3.puntuaciones[2]);
		mostrarPuntuacion(r4.puntuaciones[2]);
	}
	
	public static void mostrarPuntuacion(double p) {
		System.out.println(p);
	}
}
