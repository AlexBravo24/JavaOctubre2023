package com.ciclos;

public class Ciclo7_MPHC {

	public static void main(String[] args) {
//		7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
//		mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su 
//		dinero?
		
	       double cantidadInicial = 700.00;
	        double objetivo = 1500.00;
	        double interesMensual = 0.02;
	        int meses = 0;

	        while (cantidadInicial < objetivo) {
	        	cantidadInicial =cantidadInicial + (cantidadInicial * interesMensual);
	            meses++;
	        }

	        System.out.println("Tardar�s " + meses + " meses en tener m�s de $" + objetivo);


	}

}
