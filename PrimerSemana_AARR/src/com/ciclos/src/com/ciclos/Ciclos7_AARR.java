package com.ciclos;

public class Ciclos7_AARR {

	public static void main(String[] args) {
		
		double inversi�n = 700, ganancia;
		int mes=0;
		
		System.out.println("calculador de inversi�n con $700.00 reinvertidos mes tras mes.");
		
		while(inversi�n <= 1500) {
			mes++;
			ganancia = inversi�n * .02;
			inversi�n = ganancia + inversi�n;
		
	}
		System.out.println("la inversi�n dio como ganancia $1,500.00 a los: "+mes+" meses de reinvertir");

	}

}
