
//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
//primeras 40 horas y $20 por cada hora extra.

package com.condicionales;

import java.util.Scanner;

public class Condicionales14_JAVD {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int h,p;
		
		System.out.println("Ingrese las horas que trababajo en la semana:");
		h=in.nextInt();
		
		System.out.println("---------------PAGA SEMANAL----------------");
		
		if(h<=40) {
			p=h*16;
			System.out.println("Su pago semanal es de: $"+p);
		}
		else {
			p=((h-40)*20)+(40*16);
			System.out.println("Su pago semanal es de: $"+p);
		}
	}

}
