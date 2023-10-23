package com.condicionales;

import java.util.Scanner;

public class Condicionales10_GVA {

	public static void main(String[] args) {
		
		//9. Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		//mes correspondiente.
		
		Scanner entrada = new Scanner(System.in);
		int numeroMes;
		
		System.out.println("Ingrese un número entre 1 y 12: ");
		numeroMes = entrada.nextInt();
		
		int dias = 0;
		
		switch (numeroMes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 2: 
			dias = 28; //Año no bisiesto
			break;
			default:
				System.out.println("Número fuera de rango (1-12) ");
		}
		
		System.out.println("El mes " + numeroMes + " tiene " + dias + " dias ");
		
		entrada.close();
	}

}
