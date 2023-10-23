package com.condicionales;

import java.util.Scanner;

public class Condiciones11_MASE {

	public static void main(String[] args) {
		// 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
          Scanner entrada = new Scanner(System.in);
          
      	int Pais;
      	int kg_paq;
		
      	
		
		//
		
		System.out.println("Ingresa el pais donde serà transportado el paquete : ");
		Pais= entrada.nextInt();
		
		System.out.println("Ingresa el peso por kg del paquete : ");
		kg_paq= entrada.nextInt();
		
		//
		switch (Pais) {
		case 1:
			 System.out.println("America del Norte");
			 break;
		 case 2:
			 System.out.println("America Central");
			 break;
		 case 3:
			 System.out.println("America del sur");
			 break;
		 case 4:
			 System.out.println("Europa");
			 break;
		 case 5:
			 System.out.println("Asia");
			 break;
		 default:
			 System.out.println("ERROR: Numero incorrecto");
			 break;
		}
		
		
		 if(Pais == 1 ){
			 System.out.println("El precio de entrega es :  " + (24*kg_paq) );
		 }else if(Pais==2) {
			 System.out.println("El precio de entrega es :  " + (20*kg_paq) );
		 }else if(Pais==3) {
			 System.out.println("El precio de entrega es :  " + (21*kg_paq) );
		 }else if(Pais==4) {
			 System.out.println("El precio de entrega es :  " + (10*kg_paq) );
		 }else if(Pais==5) {
			 System.out.println("El precio de entrega es :  " + (18*kg_paq) );
		 }
		 
		 if(kg_paq>5) {
			 System.out.println("Paquete rechazado: No cumple las condiciones del servicio" );
		 }
		 
	
	
	
	
	}

}
