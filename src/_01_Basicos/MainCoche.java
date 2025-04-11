package _01_Basicos;

public class MainCoche {
	public static void main(String[] args) {
		Coche coche = new Coche(4, 4, 4);
		
		coche.estadoCoche();
		coche.arrancar();
		coche.acelerar();
		coche.acelerar();
		coche.decelerar();
		coche.decelerar();
		coche.frenar();
		coche.apagar();
	}

}
