package com.ciclos;

public class Ciclos5_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
		 * �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si todo el 
		 * dinero lo reinvierte?
		 * 
		 * */
		 double inversionInicial = 1000.00;
	        double tasaInteresMensual = 0.02;
	        int meses = 12;

	        for (int i = 0; i < meses; i++) {
	            inversionInicial += inversionInicial * tasaInteresMensual;
	        }

	        System.out.printf("Despu�s de un a�o, la cantidad ser�: $%.2f%n", inversionInicial);

	}

}
