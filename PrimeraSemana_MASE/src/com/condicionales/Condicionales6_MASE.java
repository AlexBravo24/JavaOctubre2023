package com.condicionales;

import java.util.Scanner;

public class Condicionales6_MASE {
	public static void main(String[] args) {
		
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el precio inicial por kilo de uva
        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = scanner.nextDouble();

        // Solicitar al usuario el tipo de uva (A o B)
        System.out.print("Ingrese el tipo de uva (A o B): ");
        String tipoUva = scanner.next();

        // Solicitar al usuario el tamaño de uva (1 o 2)
        System.out.print("Ingrese el tamaño de uva (1 o 2): ");
        int tamanoUva = scanner.nextInt();

        // Calcular el precio final según las reglas dadas
        double precioFinal = calcularPrecioFinal(precioInicial, tipoUva, tamanoUva);

        // Mostrar el precio final al productor
        System.out.println("El productor recibirá $" + precioFinal + " por cada kilo de uva entregado.");

        // Cerrar el Scanner
        scanner.close();
    }

    public static double calcularPrecioFinal(double precioInicial, String tipoUva, int tamanoUva) {
        double precioFinal = precioInicial;

        if (tipoUva.equalsIgnoreCase("A")) {
            if (tamanoUva == 1) {
                precioFinal += 0.20; // Se le cargan 20 céntimos al precio inicial
            } else if (tamanoUva == 2) {
                precioFinal += 0.30; // Se le cargan 30 céntimos al precio inicial
            }
        } else if (tipoUva.equalsIgnoreCase("B")) {
            if (tamanoUva == 1) {
                precioFinal -= 0.30; // Se rebajan 30 céntimos al precio inicial
            } else if (tamanoUva == 2) {
                precioFinal -= 0.50; // Se rebajan 50 céntimos al precio inicial
            }
        }

        return precioFinal;
    
		
		
	
	
	
	}
}
