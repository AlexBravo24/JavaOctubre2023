package com.ciclos;

import java.util.Scanner;

public class Ciclos12_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int sumaEdades = 0;
        int cantidadEdades = 0;

        while (true) {
            System.out.print("Ingresa una edad (o -1 para finalizar): ");
            int edad = scanner.nextInt();

            if (edad == -1) {
                break;  // Salir del bucle si se ingresa -1
            }

            sumaEdades += edad;
            cantidadEdades++;
            
            double promedio = (double) sumaEdades / cantidadEdades;
            System.out.println("Promedio de edades: " + promedio);

            if (promedio > 25) {
                System.out.println("El promedio de edades es superior a 25. Finalizando el programa.");
                break;
            }
        }
	}

}
