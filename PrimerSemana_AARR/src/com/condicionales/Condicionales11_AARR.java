package com.condicionales;

import java.util.Scanner;

public class Condicionales11_AARR {
	
	public static void main(String[] args) {
		
		int Peso, Ubicaci�n;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Servicio de paqueteria express, presione ENTER para continuar");
		entrada.hasNextLine();
		
		System.out.println("Ingrese el peso de su paquete, el peso minimo ingresado es de 1 kgs");
		Peso = entrada.nextInt();
		
		if(Peso < 6) {
		
		System.out.println("Ingrese con un numero la ubicaci�n a la cual se enviara el paquete");
		System.out.println("1 Am�rica del norte");
		System.out.println("2 Am�rica central");
		System.out.println("3 Am�rica del sur");
		System.out.println("4 Europa");
		System.out.println("5 Asia");
		Ubicaci�n = entrada.nextInt();
		
		switch (Ubicaci�n) {
		case 1:
			System.out.println("El envio a Am�rica del norte tendra un costo de: "+ (Peso * 24)+ " �");
			break;
			
		case 2:
			System.out.println("El envio a Am�rica central tendra un costo de: "+ (Peso * 20)+ " �");
			break;
			
		case 3:
			System.out.println("El envio a Am�rica del sur tendra un costo de: "+ (Peso * 21)+ " �");
			break;
			
		case 4:
			System.out.println("El envio a Europa tendra un costo de: "+ (Peso * 10)+ " �");
			break;
			
		case 5:
			System.out.println("El envio a Asia tendra un costo de: "+ (Peso * 18)+ " �");
			break;

		default:
			break;
		}
		
		}else {
			System.out.println("El peso excede el limite permitido");
	}
	}
}


