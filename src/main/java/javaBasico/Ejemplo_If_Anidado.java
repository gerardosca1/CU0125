package javaBasico;

public class Ejemplo_If_Anidado {

	public static void main(String[] args) {
		int temperatura=16;
		if (temperatura>15) {
			if (temperatura>25) {
				System.out.print("vamos al la playa");
			}else {
				System.out.print("vamos al bosque");
			}
			
		}else {
			System.out.print("vamos a misa");
		}

	}

}
