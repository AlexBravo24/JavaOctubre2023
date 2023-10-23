package com.condicionales;

import java.util.Scanner;

public class Condicionales10_ECGH {
	public static void main(String[] args) {
		
		//10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días
		//que tiene el mes correspondiente.
		
		
		
		int mes;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el número del mes");
		mes=entrada.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("31 dias");
			break;
		case 2:
			System.out.println("28/29 dias");
			break;
		case 3:
			System.out.println("31 dias");
			break;
		case 4:
			System.out.println("30 dias");
			break;
		case 5:
			System.out.println("31 dias");
			break;
		case 6:
			System.out.println("30 dias");
			break;
		case 7:
			System.out.println("31 dias");
			break;
		case 8:
			System.out.println("31 dias");
			break;
		case 9:
			System.out.println("30 dias");
			break;
		case 10:
			System.out.println("31 dias");
			break;
		case 11:
			System.out.println("30 dias");
			break;
		case 12:
			System.out.println("31 dias");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
