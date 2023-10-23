package com.condicionales;

import java.util.Scanner;

public class Condicionales14_GVA {

	public static void main(String[] args) {
		
		//14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
		//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
		//primeras 40 horas y $20 por cada hora extra
		
		Scanner entrada = new Scanner(System.in);
		int horasTrabajadas;
		float salario;
		
		System.out.println("Ingrese el número de horas trabajadas: ");
		horasTrabajadas = entrada.nextInt();
		
		if (horasTrabajadas <= 40) {
			salario = horasTrabajadas * 16;
		} else {
			salario = (40*16) + ((horasTrabajadas-40)*20);
		}
		System.out.println("El salario total es de: " + salario);
		
		entrada.close();
	}

}
