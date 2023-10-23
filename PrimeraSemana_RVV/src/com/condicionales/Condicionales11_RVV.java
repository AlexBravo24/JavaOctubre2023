package com.condicionales;

import java.util.Scanner;

public class Condicionales11_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el peso del paquete en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa la zona de destino (1: Am�rica del Norte, 2: Am�rica Central, 3: Am�rica del Sur, 4: Europa, 5: Asia): ");
        int zonaDestino = scanner.nextInt();

        double costoEntrega = calcularCostoEntrega(peso, zonaDestino);

        if (costoEntrega > 0) {
            System.out.println("El costo de entrega del paquete es: " + costoEntrega + " euros.");
        } else {
            System.out.println("Rechazo de la entrega: Peso superior a 5 kg.");
        }
    }

    public static double calcularCostoEntrega(double peso, int zonaDestino) {
        if (peso <= 5) {
            switch (zonaDestino) {
                case 1:
                    return 24.00 * peso;
                case 2:
                    return 20.00 * peso;
                case 3:
                    return 21.00 * peso;
                case 4:
                    return 10.00 * peso;
                case 5:
                    return 18.00 * peso;
                default:
                    return -1; 
            }
        } else {
            return -1;
        }
	}

}
