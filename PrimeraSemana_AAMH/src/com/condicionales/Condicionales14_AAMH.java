package com.condicionales;

import java.util.Scanner;

public class Condicionales14_AAMH {

	public static void main(String[] args) {
		// 14.Un obrero necesita calcular su salario semanal,
		//el cual se obtiene de la siguiente manera:
		//Si trabaja 40 horas o menos se le paga $16 por hora.
		//Si trabaja más de 40 horas se le paga $16
		//por cada una de las primeras 40 horas y $20 por cada hora extra.

		Scanner entrada = new Scanner (System.in);

		// Decalración de variables
		int horasTrabajadas,total,horasext;
		
		//Ingreso de datos por el usuario
		System.out.println("Ingrese número de horas trabajadas");
		horasTrabajadas=entrada.nextInt();
		
		
		//Condición
		if (horasTrabajadas <=40) {
			total= horasTrabajadas*16;
			
		//muestra Pantalla
		System.out.println("El sueldo es $: " + total);
		}else {
			horasext=horasTrabajadas-40;
			total=(horasext*20)+(40*16);
			System.out.println("El sueldo es $: " + total);
		}
	}

}
