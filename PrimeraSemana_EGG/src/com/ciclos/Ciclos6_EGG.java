package com.ciclos;

public class Ciclos6_EGG {

	public static void main(String[] args) {
		//  Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		// mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		// todo el dinero lo reinvierte?
		
		double inversion = 1000;
		double interes = 0.02;
		
		System.out.println("Tu inversión inicial es: " +inversion);
		System.out.println("Tu interes mensual otorgado es: " +  (interes*100) + "%");
		
		for (int i = 0; i < 12; i++) {
			inversion += inversion * interes;
		}
		System.out.println("Al cabo del año tendrias: " + inversion);
		

	}

}
