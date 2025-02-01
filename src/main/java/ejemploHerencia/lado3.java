package ejemploHerencia;

public class lado3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1=   new Triangulo ();
		Triangulo t2= new Triangulo ();
		
		t1.altura= 4;
		t1.base= 5;
		t1.estilo= "estilo 1";
		
		t2.altura= 2;
		t2.base= 2;
		t2.estilo= "estilo 1";
		
		System.out.println("Informacion para t1");
		t1.mostrarEstilo();
		t1.mostrarDimencion();
		System.out.println("Su area es : " + t1.area());
		
		System.out.println("");
		
		System.out.println("Informacion para t2");
		t2.mostrarEstilo();
		t2.mostrarDimencion();
		System.out.println("Su area es : " + t2.area());
		
		

	}

}
