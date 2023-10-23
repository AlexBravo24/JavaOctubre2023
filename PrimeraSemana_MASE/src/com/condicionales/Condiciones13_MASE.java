package com.condicionales;

import java.util.Scanner;

public class Condiciones13_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entrada =new  Scanner(System.in);
		
		
		int dinero_don;
		
		
		System.out.println("Ingrese la cantidad de dinero donada");
		dinero_don = entrada.nextInt();
		
	
	if(dinero_don>=1000) {
		System.out.println("Centro de salud  " + (dinero_don*.30)+  "    Comedor de niños " + (dinero_don*.50) + "    Inversiòn en bolsa  " + (dinero_don*.20));
	}else
		System.out.println("Centro de salud  " + (dinero_don*.25)+  "    Comedor de niños " + (dinero_don*.60) + "    Inversiòn en bolsa  " + (dinero_don*.15));
	
	
	
	}

}
