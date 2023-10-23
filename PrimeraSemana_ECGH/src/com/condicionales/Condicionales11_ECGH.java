package com.condicionales;

import java.util.Scanner;

public class Condicionales11_ECGH {
	public static void main(String[] args) {
//		11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, 
//		América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso
//		del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

//		ZONA UBICACIÓN      COSTO/KILOGRAMO
//		1 América del Norte 24,00 euros
//		2 América Central 20, 00 euros
//		3 América del Sur 21,00 euros
//		4 Europa 10,00 euros
//		5 Asia 18,00 euros

//		Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, 
//	    por cuestiones de logística y seguridad.
//		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
		
		int peso;
		int region;
		int costo=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el peso del equipaje");
		peso=entrada.nextInt();
		System.out.println("Introduce el número de la región de destino");
		region=entrada.nextInt();
		
		if (peso>5) {
			System.out.println("El equpaje no puede ser enviado por exceso de peso");
		}
		else {
			switch(region) {
			case 1:
				costo=peso*24;
				break;
			case 2:
				costo=peso*20;
				break;
			case 3:
				costo=peso*21;
				break;
			case 4:
				costo=peso*10;
				break;
			case 5:
				costo=peso*18;
				break;
			default:
				System.out.println("ERROR: La región no está disponible");
				break;
			}
			
			
			System.out.println("El costo por el servicio es: "+costo+" euros");
			
			
			
			
		}
		
		
		
		
	}
}
