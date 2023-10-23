package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AARR {

	

	public static void main(String[] args) {
		
		int Dado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero del dado que salio");
		Dado = entrada.nextInt();
		
		switch(Dado) {
		
		case 1:
		System.out.println("El lado contrario del dado es Seis");
		break;
		
		case 2:
		System.out.println("El lado contrario del dado es Cinco");
		break;
		
		case 3:
		System.out.println("El lado contrario del dado es Cuatro");
		break;
		
		case 4:
		System.out.println("El lado contrario del dado es Tres");
		break;
		
		case 5:
		System.out.println("El lado contrario del dado es Dos");
		break;
		
		case 6:
		System.out.println("El lado contrario del dado es Uno");
		break;
		
		default:
		System.out.println("Error");
		break;
		
		}
		
	}

}
