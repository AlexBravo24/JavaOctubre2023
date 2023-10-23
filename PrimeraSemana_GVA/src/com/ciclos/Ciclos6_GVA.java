package com.ciclos;

public class Ciclos6_GVA {

	public static void main(String[] args) {
		
		//6. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo  reinvierte?
		
		double capital = 1000.00;
		double tasaInteresMensual = 0.02;
		int meses = 12;
		
		for (int i = 1; i <= meses; i++) {
			capital = capital * (1 + tasaInteresMensual);
		}
		
		capital = Math.round(capital * 100.0) / 100.0;
		
		System.out.println("Después de un año, la persona tendrá $" + capital);
	}

}
