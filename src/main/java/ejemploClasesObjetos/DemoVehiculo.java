package ejemploClasesObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan = new Vehiculo(); 
		int rango;
		minivan.pasajeros=9;
		minivan.kmh=50;
		minivan.capacidad=60;
		rango=minivan.capacidad * minivan.kmh;
		System.out.println("minivan puede llevar pasajeros " + minivan.pasajeros +" en un rango de  " + rango);
		
		Vehiculo carro=new Vehiculo();
		carro.pasajeros=4;
		System.out.println("pasajeros de carro es igua a " + carro.pasajeros);

	}

}
