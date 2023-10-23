package com.condicionales;

import java.util.Scanner;

public class Condicionales14_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        double salario = calcularSalario(horasTrabajadas);

        System.out.println("El salario semanal del obrero es: $" + salario);
    }

    public static double calcularSalario(int horasTrabajadas) {
        double salario;
        if (horasTrabajadas <= 40) {
            salario = 16.0 * horasTrabajadas;
        } else {
            salario = 16.0 * 40 + 20.0 * (horasTrabajadas - 40);
        }
        return salario;

	}

}
