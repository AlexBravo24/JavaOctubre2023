package com.ciclos;

public class Ciclos7_ELP {

	public static void main(String[] args) {
		/*
		 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
		mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su 
		dinero?
		 */
		
        double inversionInicial = 700.00;
        double objetivo = 1500.00;
        double tasaInteresMensual = 0.02;
        int meses = 0;

        while (inversionInicial < objetivo) {
            inversionInicial += inversionInicial * tasaInteresMensual;
            meses++;
        }

        System.out.println("La persona tendr� m�s de $1500 despu�s de " + meses + " meses.");
    }
}	