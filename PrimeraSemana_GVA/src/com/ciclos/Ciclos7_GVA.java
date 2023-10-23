package com.ciclos;

public class Ciclos7_GVA {

	public static void main(String[] args) {
		
		//7. Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s mensual.
		//�En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su dinero?
		
		double capital = 700.00;
		double tasaInteresMensual = 0.02;
		double objetivo = 1500.00;
		int meses = 0;
		
		while (capital < objetivo) {
			capital = capital * (1 + tasaInteresMensual);
			meses++;
		}
		
		System.out.println("Despu�s de " + meses + " meses, la persona tendr� m�s de $" + objetivo);
	}

}
