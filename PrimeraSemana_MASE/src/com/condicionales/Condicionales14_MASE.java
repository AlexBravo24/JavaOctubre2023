package com.condicionales;

import java.util.Scanner;

public class Condicionales14_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int cost_hora=16;
		int horas_trab;
		int horas_norm = 40;
		int horas_ex = 20;
		
		int salario_smnl;
		
		
		System.out.println("Ingrese el total de horas");
		horas_trab = entrada.nextInt();
		
		
		if(horas_trab<=horas_norm) {
			System.out.println("El salario semanal es de:  " + (salario_smnl=horas_trab * cost_hora ));	
		}else {
			
			System.out.println("El salario semanal es de:  " + (salario_smnl = (horas_norm * cost_hora) + ((horas_trab - horas_norm) * horas_ex)));
		}

	}

}
