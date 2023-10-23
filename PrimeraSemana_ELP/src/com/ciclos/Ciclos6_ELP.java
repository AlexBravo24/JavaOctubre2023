package com.ciclos;

public class Ciclos6_ELP {

	public static void main(String[] args) {
		/*
		 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		todo el dinero lo reinvierte?
		 */

	    double inversionInicial = 1000.00;
        double tasaInteresMensual = 0.02;
        int meses = 12;

        double saldo = inversionInicial;

        for (int mes = 1; mes <= meses; mes++) {
            saldo += saldo * tasaInteresMensual;
        }

        System.out.printf("Despu�s de un a�o, tendr�s $%.2f si reinviertes todo el dinero.%n", saldo);
    }
}