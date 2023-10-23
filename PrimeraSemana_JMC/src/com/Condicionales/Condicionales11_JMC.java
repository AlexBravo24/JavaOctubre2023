package com.Condicionales;

import java.util.Scanner;

public class Condicionales11_JMC {

	public static void main(String[] args) {
		  Scanner entrada11 = new Scanner(System.in);
           int destino;
           float kg;
           
       	System.out.println("Ingrese el peso del paquete(kg)");
		kg = entrada11.nextFloat();
		
		
		
		if(kg>5) {
			System.out.println("La entrega fue rechazada");
			
		}
		else {
			
			System.out.println("Ingresa el destino\n"
					+ "1 América del Norte\n"
					+ "2 América Central\n"
					+ "3 América del Sur\n"
					+ "4 Europa\n"
					+ "5 Asia");
			destino = entrada11.nextInt();
			
			
			
			switch (destino) {
			case 1:
				System.out.println("El combro de la entrega del paquete es: "+(kg*2400)+" Euros");
				break;
			case 2:
				System.out.println("El combro de la entrega del paquete es: "+(kg*2000)+" Euros");
				break;
			case 3:
				System.out.println("El combro de la entrega del paquete es: "+(kg*2100)+" Euros");
				break;
			case 4:
				System.out.println("El combro de la entrega del paquete es: "+(kg*1000)+" Euros");
				break;
			case 5:
				System.out.println("El combro de la entrega del paquete es: "+(kg*1800)+" Euros");
				break;
			default:
				System.out.println("El destino no existe");
				break;
			
		}
		}
		
	}

}
