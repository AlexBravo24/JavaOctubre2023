package com.Condicionales;

import java.util.Scanner;

public class Condicionales14_JMC {
	public static void main(String[] args) {

//		Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra
		
		Scanner entrada14 = new Scanner(System.in);
		
		int salario,horas,horasExtras;
		
		System.out.println("Cuantas horas trabajaste:");
        horas =entrada14.nextInt();  
	
		if (horas<=40) {
			
			salario=horas*16;
			
			System.out.println("el salario del obrero es: "+salario);
		}
		else {
			
			horasExtras =horas-40;
			
			salario = (40*16)+horasExtras*20;
			
			System.out.println("el salario del obrero es: "+salario);
			
		}
		
		
		
	}
}