package com.condicionales;

import java.util.Scanner;

public class Condicionales14_ECGH {
	public static void main(String[] args) {
		
//		14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
//			*Si trabaja 40 horas o menos se le paga $16 por hora. 
//			*Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		
		int horas;
		int horasNormales;
		int horasExtras=0;
		int salario=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca el número de horas laboradas");
		horas=entrada.nextInt();
		if(horas<=40) {
			salario=horas*16;
		}
		else {
			horasNormales=40;
			horasExtras=horas-horasNormales;
			salario=(horasNormales*16)+(horasExtras*20);
		}
		System.out.println("Su salario es: $"+salario);
		
		
		
		
		
		
		
	}

}
