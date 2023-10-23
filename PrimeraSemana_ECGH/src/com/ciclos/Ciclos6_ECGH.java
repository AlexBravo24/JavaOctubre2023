package com.ciclos;

public class Ciclos6_ECGH {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?

		double ini=1000.00;
		
		for (int i=0;i<12;i++) {
		ini=ini+ini*0.02;	
		}
		System.out.println("Total anual: "+ini);
		
	}

}
