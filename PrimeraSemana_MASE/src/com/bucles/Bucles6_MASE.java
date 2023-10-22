package com.bucles;

public class Bucles6_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principal = 1000.00; // Cantidad inicial
        double tasaInteresMensual = 0.02; // Tasa de inter�s mensual (2% en forma decimal)
        int meses = 12; // Duraci�n en meses

        // Calcular el saldo despu�s de un a�o utilizando inter�s compuesto
        double saldo = principal;

        for (int i = 0; i < meses; i++) {
            saldo = saldo * (1 + tasaInteresMensual);
        }

        System.out.printf("Despu�s de un a�o, el saldo ser�: $%.2f%n", saldo);
    }
	}


