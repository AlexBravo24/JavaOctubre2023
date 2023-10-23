package com.condicionales;

import java.util.Scanner;

public class Condicionales11_AARR {
	
	public static void main(String[] args) {
		
		int Peso, Ubicación;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Servicio de paqueteria express, presione ENTER para continuar");
		entrada.hasNextLine();
		
		System.out.println("Ingrese el peso de su paquete, el peso minimo ingresado es de 1 kgs");
		Peso = entrada.nextInt();
		
		if(Peso < 6) {
		
		System.out.println("Ingrese con un numero la ubicación a la cual se enviara el paquete");
		System.out.println("1 América del norte");
		System.out.println("2 América central");
		System.out.println("3 América del sur");
		System.out.println("4 Europa");
		System.out.println("5 Asia");
		Ubicación = entrada.nextInt();
		
		switch (Ubicación) {
		case 1:
			System.out.println("El envio a América del norte tendra un costo de: "+ (Peso * 24)+ " €");
			break;
			
		case 2:
			System.out.println("El envio a América central tendra un costo de: "+ (Peso * 20)+ " €");
			break;
			
		case 3:
			System.out.println("El envio a América del sur tendra un costo de: "+ (Peso * 21)+ " €");
			break;
			
		case 4:
			System.out.println("El envio a Europa tendra un costo de: "+ (Peso * 10)+ " €");
			break;
			
		case 5:
			System.out.println("El envio a Asia tendra un costo de: "+ (Peso * 18)+ " €");
			break;

		default:
			break;
		}
		
		}else {
			System.out.println("El peso excede el limite permitido");
	}
	}
}


