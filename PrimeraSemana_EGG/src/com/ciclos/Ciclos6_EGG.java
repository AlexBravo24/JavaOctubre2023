package com.ciclos;

public class Ciclos6_EGG {

	public static void main(String[] args) {
		//  Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		// mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		// todo el dinero lo reinvierte?
		
		double inversion = 1000;
		double interes = 0.02;
		
		System.out.println("Tu inversi�n inicial es: " +inversion);
		System.out.println("Tu interes mensual otorgado es: " +  (interes*100) + "%");
		
		for (int i = 0; i < 12; i++) {
			inversion += inversion * interes;
		}
		System.out.println("Al cabo del a�o tendrias: " + inversion);
		

	}

}
