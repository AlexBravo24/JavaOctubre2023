package com.ciclos;

public class Ciclos6_AARR {

		public static void main(String[] args) {
			
			double inversi�n = 1000, ganancia;
			int mes=12;
			
			System.out.println("calculador de inversi�n si la ganancia mensual es del 2% durante 1 a�o.");
			
			for(int i=0; i<12; i++) {
				ganancia = inversi�n * .02;
				inversi�n = ganancia + inversi�n;
			}
			System.out.println("La ganancia total en el plazo de un a�o es de: "+inversi�n);
		}
}
