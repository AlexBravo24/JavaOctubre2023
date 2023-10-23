package com.ciclos;

public class Ciclos6_AARR {

		public static void main(String[] args) {
			
			double inversión = 1000, ganancia;
			int mes=12;
			
			System.out.println("calculador de inversión si la ganancia mensual es del 2% durante 1 año.");
			
			for(int i=0; i<12; i++) {
				ganancia = inversión * .02;
				inversión = ganancia + inversión;
			}
			System.out.println("La ganancia total en el plazo de un año es de: "+inversión);
		}
}
