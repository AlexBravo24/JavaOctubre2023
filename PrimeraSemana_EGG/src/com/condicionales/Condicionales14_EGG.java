package com.condicionales;

import java.util.Scanner;

public class Condicionales14_EGG {

	public static void main(String[] args) {
		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
		//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
		//primeras 40 horas y $20 por cada hora extra.
		
		Scanner entrada = new Scanner(System.in);
		int sueldo = 0, extra;
		System.out.println("Introduce las Horas trabajadas");
		int horas = entrada.nextInt();
		if (horas > 40){
			extra = horas-40;
			extra = extra*20;
			sueldo = 40*16;
			System.out.println("Tu salario semanal es: " +(extra+sueldo));
		}else if(horas <= 40) {
			sueldo = horas*16;
			System.out.println("Tu salario Semanal es: " + sueldo);
		} 
		
	}

}
