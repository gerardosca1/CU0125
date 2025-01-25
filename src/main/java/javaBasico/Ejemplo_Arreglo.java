package javaBasico;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr;
		
		arr=new String [5];
		
		arr [0]="cero";
		arr [1]="uno";
		arr [2]="dos";
		arr [3]="tres";
		arr [4]="cuatro";
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("posicion " + arr[i]+ " es igual a "+arr[i]);
		} 
		

	}

}
