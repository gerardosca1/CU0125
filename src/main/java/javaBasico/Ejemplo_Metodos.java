package javaBasico;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = suma (2,3);
		System.out.println(resultado);
		
		int resultado2 =suma (3,10);
		System.out.println(resultado2);
		
		
		int resultado3 =suma (3,10,12);
		System.out.println(resultado3);
		
		
		ejemplovoid();
		
	}
		
		public static int suma (int a, int b) {
			int c = a + b;
			return c;
			
		}
		

		public static int suma (int a, int b, int c) {
			int d = a + b + c;
			return d;
		}
		
		public static String carro (int a) {
			String [] cars = {"volvo", "ferrari","mustang","ford"};
			return cars[a];
			
		}
		
		public static void ejemplovoid() {
			System.out.print("ejemplo void");
		}

	}
