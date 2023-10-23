package com.ciclos;

public class Ciclos7_AARR {

	public static void main(String[] args) {
		
		double inversión = 700, ganancia;
		int mes=0;
		
		System.out.println("calculador de inversión con $700.00 reinvertidos mes tras mes.");
		
		while(inversión <= 1500) {
			mes++;
			ganancia = inversión * .02;
			inversión = ganancia + inversión;
		
	}
		System.out.println("la inversión dio como ganancia $1,500.00 a los: "+mes+" meses de reinvertir");

	}

}
