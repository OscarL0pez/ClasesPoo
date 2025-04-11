package _01_Basicos;

public class Coche {
	/*
	 * =================
	 * =   ENUNCIADO   =
	 * =================
	 * 
	 * Crea una clase Coche. Indica características como cantidad de ventanas,
	 * cantidad de puertas, cantidad de ruedas, velocidad, si está circulando o no,
	 * si está frenado o no, si está en marcha o no.
	 * 
	 * Piensa cómo hacer el constructor del vehículo.
	 * 
	 * Necesitarás hacer varios métodos y pensar qué atributos son valores numéricos
	 * y los que no.
	 * 
	 * Haz un método acelerar que incremente la velocidad del coche en 5km/h
	 * Haz un método decelerar que disminuya la velocidad del coche en 5km/h
	 * Haz un método arrancar para que se ponga en marca el vehículo.
	 * 
	 * En el método main, hecho en una clase a parte, tienes que probar con que el coche
	 * acelere, decelere, arranque y frene.
	 * 
	 * Atención: si el coche no está en marcha no va a poder acelerar ni decelerar.
	 */
	// Atributos
	private int ventanas;
	private int puertas;
	private int ruedas;
	private int velocidad;
	private boolean circulando;
	private boolean frenado;
	private boolean enMarcha;
	
		
	// Constructor
	
	public Coche(int ventanas, int puertas, int ruedas) {
		this.ventanas = ventanas;
		this.puertas = puertas;
		this.ruedas = ruedas;
		this.velocidad = 0;
		this.circulando = false;
		this.frenado = false;
		this.enMarcha = false;
	}
	
	// Métodos
	public void acelerar() {
		if (enMarcha) {
			velocidad += 5;
			System.out.println("Acelerando. Velocidad actual: " + velocidad + " km/h");
		} else {
			System.out.println("El coche no está en marcha. No se puede acelerar.");
		}
	}
	
	public void decelerar() {
		if (enMarcha) {
			if (velocidad >= 5) {
				velocidad -= 5;
				System.out.println("Desacelerando. Velocidad actual: " + velocidad + " km/h");
			} else {
				System.out.println("El coche ya está detenido.");
			}
		} else {
			System.out.println("El coche no está en marcha. No se puede desacelerar.");
		}
	}
	
	public void arrancar() {
		if (!enMarcha) {
			enMarcha = true;
			circulando = true;
			System.out.println("El coche ha arrancado.");
		} else {
			System.out.println("El coche ya está en marcha.");
		}
	}
	
	public void frenar() {
		if (enMarcha) {
			frenado = true;
			velocidad = 0;
			circulando = false;
			enMarcha = false;
			System.out.println("El coche ha frenado y se ha detenido.");
		} else {
			System.out.println("El coche ya está detenido.");
		}
	}
	
	// estado general del coche
	public void estadoCoche() {
		System.out.println("Estado del coche:");
		System.out.println("Ventanas: " + ventanas);
		System.out.println("Puertas: " + puertas);
		System.out.println("Ruedas: " + ruedas);
		System.out.println("Velocidad: " + velocidad + " km/h");
		System.out.println("Circulando: " + circulando);
		System.out.println("Frenado: " + frenado);
		System.out.println("En marcha: " + enMarcha);
		System.out.println("-----------------------------");
	}
	
	// Apagar el coche
	public void apagar() {
		if (enMarcha) {
			enMarcha = false;
			circulando = false;
			System.out.println("El coche ha sido apagado.");
		} else {
			System.out.println("El coche ya está apagado.");
		}
	}

}

