package com.condicionales;

import java.util.Scanner;

public class Condicionales10_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un n�mero entre 1 y 12 para representar un mes: ");
        int numeroMes = scanner.nextInt();

        int numeroDias = obtenerDiasEnMes(numeroMes);

        if (numeroDias != -1) {
            System.out.println("El mes " + numeroMes + " tiene " + numeroDias + " d�as.");
        } else {
            System.out.println("ERROR: N�mero de mes fuera de rango.");
        }
    }

    public static int obtenerDiasEnMes(int numeroMes) {
        switch (numeroMes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28; 
            default:
                return -1; 
        }
	}

}
