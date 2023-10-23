package com.condicionales;

import java.util.Scanner;

public class Condicionales6_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Ingresa el tipo de uva (A o B): ");
        char tipoUva = scanner.next().charAt(0);

        System.out.print("Ingresa el tama�o de la uva (1 o 2): ");
        int tama�oUva = scanner.nextInt();

        double precioFinal = calcularPrecio(precioInicial, tipoUva, tama�oUva);

        System.out.println("El precio final por kilo de uva es: " + precioFinal + " centavos.");
    }

    public static double calcularPrecio(double precioInicial, char tipoUva, int tama�oUva) {
        if (tipoUva == 'A') {
            if (tama�oUva == 1) {
                precioInicial += 20; 
            } else if (tama�oUva == 2) {
                precioInicial += 30; 
            }
        } else if (tipoUva == 'B') {
            if (tama�oUva == 1) {
                precioInicial -= 30; // 
            } else if (tama�oUva == 2) {
                precioInicial -= 50; 
            }
        }
        return precioInicial;

	}

}
