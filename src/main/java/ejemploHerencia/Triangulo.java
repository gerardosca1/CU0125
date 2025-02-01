package ejemploHerencia;

public class Triangulo  extends dosDimensiones{
	
	String estilo;
	
	double area () {
		return base * altura / 2;
		
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es : " + estilo);
		
	}

}
