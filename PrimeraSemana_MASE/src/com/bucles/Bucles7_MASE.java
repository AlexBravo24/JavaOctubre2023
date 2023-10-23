package com.bucles;

public class Bucles7_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double inversionInicial = 700.00;
	        double interesMensual = 0.02;
	        double objetivo = 1500.00;
	        int meses = 0;

	        while (inversionInicial < objetivo) {
	            // Calcula el inter�s mensual
	            double interes = inversionInicial * interesMensual;

	            // Suma el inter�s al monto de la inversi�n
	            inversionInicial += interes;

	            // Incrementa el contador de meses
	            meses++;

	            // Imprime el estado de la inversi�n cada mes (opcional)
	            System.out.printf("Mes %d: $%.2f\n", meses, inversionInicial);
	        }

	        System.out.println("La inversi�n superar� los $1500 despu�s de " + meses + " meses.");
		
	}

}
