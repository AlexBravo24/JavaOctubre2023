package com.bucles;

public class Bucles6_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principal = 1000.00; // Cantidad inicial
        double tasaInteresMensual = 0.02; // Tasa de interés mensual (2% en forma decimal)
        int meses = 12; // Duración en meses

        // Calcular el saldo después de un año utilizando interés compuesto
        double saldo = principal;

        for (int i = 0; i < meses; i++) {
            saldo = saldo * (1 + tasaInteresMensual);
        }

        System.out.printf("Después de un año, el saldo será: $%.2f%n", saldo);
    }
	}


