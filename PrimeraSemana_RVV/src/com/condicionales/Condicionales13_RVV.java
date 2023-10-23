package com.condicionales;

import java.util.Scanner;

public class Condicionales13_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el monto de la donación anual: $");
        double montoDonacion = scanner.nextDouble();

        double montoCentroSalud, montoComedorNinos, montoBolsa;

        if (montoDonacion >= 10000) {
            montoCentroSalud = 0.30 * montoDonacion;
            montoComedorNinos = 0.50 * montoDonacion;
            montoBolsa = montoDonacion - montoCentroSalud - montoComedorNinos;
        } else {
            montoCentroSalud = 0.25 * montoDonacion;
            montoComedorNinos = 0.60 * montoDonacion;
            montoBolsa = montoDonacion - montoCentroSalud - montoComedorNinos;
        }

        System.out.println("Monto destinado al centro de salud: $" + montoCentroSalud);
        System.out.println("Monto destinado al comedor de niños: $" + montoComedorNinos);
        System.out.println("Monto destinado a la inversión en la bolsa: $" + montoBolsa);
    

	}

}
