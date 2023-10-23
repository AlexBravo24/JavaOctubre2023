package com.condicionales;

import java.util.Scanner;

public class Condicionales11_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia.
		 * */
		Scanner entrada = new Scanner(System.in);
		 int paquete;
		 int destino;
		System.out.println("Introduzca el peso de su paquete");
		 paquete=entrada.nextInt();
		 
		 System.out.println("Introduzca el destino de su paquete 1-America del Norte, 2-America central, 3.-america del sur, 4-Europa, 5-Asia");
		 destino=entrada.nextInt();
		 
		 if(paquete <=5 && destino==1) {
				System.out.println("El costo para el envio de su paquete es: " + paquete*24.00 + " Euros");
		 }else if(paquete <=5 && destino==2){
				System.out.println("El costo para el envio de su paquete es: " + paquete*20.00 + " Euros");
		 }else if(paquete <=5 && destino==3) {
				System.out.println("El costo para el envio de su paquete es: " + paquete*21.00 + " Euros");
		 }else if(paquete <=5 && destino ==4) {
			 System.out.println("El costo para el envio de su paquete es: " + paquete*10.00 + " Euros");
		 }else if(paquete <=5 && destino==5) {
			 System.out.println("El costo para el envio de su paquete es: " + paquete*18.00 + " Euros");
		 }else if(5 < paquete) {
			 System.out.println("Envio rechazado el peso no debe superar los 5kg ");
		 }
		 
		 
	}

}
