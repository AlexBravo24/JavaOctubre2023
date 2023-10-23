package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int Dia;
		
		System.out.println("Ingrese el dia de la semana");
		Dia = entrada.nextInt();
		
		switch(Dia) {
		
		case 1:
		System.out.println("Este dia es Lunes");
		break;
		
		case 2:
		System.out.println("Este dia es Martes");
		break;
		
		case 3:
		System.out.println("Este dia es Miercoles");
		break;
		
		case 4:
		System.out.println("Este dia es Jueves");
		break;
		
		case 5:
		System.out.println("Este dia es Viernes");
		break;
		
		case 6:
		System.out.println("Este dia es Sabado");
		break;
		
		case 7:
		System.out.println("Este dia es Domingo");
		break;
			
		
		default:
		System.out.println("Error");
		break;
		
		}
	}

}
