package com.condicionales;

import java.util.Scanner;

public class Condicional14_MPHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< Calculo de sueldo >>>");
		System.out.println("");
		
		System.out.println("Ingrese Horas trabajadas");
		int horas=entrada.nextInt();
		
		
		if (horas<=40) {
			int salario=horas*16;
			System.out.println("Ssalario semanal:$"+salario);
			
		}else if(horas>40) {
			int horasRegulares=40;
			int horasExtras=horas-horasRegulares;
			int salario= (horasRegulares*16)+(horasExtras*20);
			
			
			System.out.println("Salario semanal:$"+salario);
			
			
		}

	}

}
