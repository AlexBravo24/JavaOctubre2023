package com.condicionales;

import java.util.Scanner;

public class Condicionales6_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        System.out.print("Ingresa el tipo de uva (A o B): ");
        char tipoUva = scanner.next().charAt(0);

        System.out.print("Ingresa el tamaño de la uva (1 o 2): ");
        int tamañoUva = scanner.nextInt();

        double precioFinal = calcularPrecio(precioInicial, tipoUva, tamañoUva);

        System.out.println("El precio final por kilo de uva es: " + precioFinal + " centavos.");
    }

    public static double calcularPrecio(double precioInicial, char tipoUva, int tamañoUva) {
        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                precioInicial += 20; 
            } else if (tamañoUva == 2) {
                precioInicial += 30; 
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 1) {
                precioInicial -= 30; // 
            } else if (tamañoUva == 2) {
                precioInicial -= 50; 
            }
        }
        return precioInicial;

	}

}
