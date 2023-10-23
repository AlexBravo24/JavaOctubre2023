package com.condicionales;

import java.util.Scanner;

public class Condicionales14_ELP {

	public static void main(String[] args) {
		
//		14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra

		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = leer.nextInt();

        int salarioSemanal;

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 16;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (horasNormales * 16) + (horasExtras * 20);
        }

        System.out.println("El salario semanal del obrero es: $" + salarioSemanal);
    }
}
	