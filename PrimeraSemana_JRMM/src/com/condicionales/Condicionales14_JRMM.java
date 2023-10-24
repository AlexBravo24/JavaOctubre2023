package com.condicionales;

import java.util.Scanner;

public class Condicionales14_JRMM {

	public static void main(String[] args) {
		
		/*14. Un obrero necesita calcular su salario semanal, el cual se obtiene
		 *de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora.
		 *Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas
		 *y $20 por cada hora extra. 
		 */
		Scanner entrada = new Scanner (System.in);
		
		int horasT,extras,salario;
		
		System.out.println("Inserte el numero de Horas Trabajadas: ");
		horasT = entrada.nextInt();
		
		if(horasT <= 40) {
			salario = horasT * 16;
			System.out.println("El salario semanal es: $"+salario);
		}else if(horasT > 40) {
			extras = horasT - 40;
			salario = (40 * 16) + (extras * 20);
			System.out.println("El salario semanal es: $"+salario);
		}

	}

}
