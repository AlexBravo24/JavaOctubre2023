package com.condicionales;

import java.util.Scanner;

public class Condicionales10_AARR {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int Mes;
		
		System.out.println("Ingrese el numero de mes");
		Mes = entrada.nextInt();
		
		switch(Mes) {
		
		case 1:
		System.out.println("En Enero hay 31 dias");
		break;
		
		case 2:
		System.out.println("En Febrero hay 28 dias");
		break;
		
		case 3:
		System.out.println("En Marzo hay 31 dias");
		break;
		
		case 4:
		System.out.println("En Abril hay 30 dias");
		break;
		
		case 5:
		System.out.println("En Mayo hay 31 dias");
		break;
		
		case 6:
		System.out.println("En Junio hay 30 dias");
		break;
		
		case 7:
		System.out.println("En Julio hay 31 dias");
		break;
		
		case 8:
		System.out.println("En Agosto hay 31 dias");
		break;
		
		case 9:
		System.out.println("En Septiembre hay 30 dias");
		break;
		
		case 10:
		System.out.println("En Octubre hay 31 dias");
		break;
		
		case 11:
		System.out.println("En Noviembre hay 30 dias");
		break;
		
		case 12:
		System.out.println("En Diciembre hay 31 dias");
		break;
		
		default:
		System.out.println("Error");
		break;
		
		}
	}

}
