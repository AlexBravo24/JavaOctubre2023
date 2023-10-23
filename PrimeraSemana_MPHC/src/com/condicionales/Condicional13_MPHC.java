package com.condicionales;

import java.util.Scanner;

public class Condicional13_MPHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< Reparto de donaciones >>>");
		System.out.println("");
		
		System.out.println("Ingrese monto de donacion");
		int monto=entrada.nextInt();
		
		
		if (monto>=10000) {
			
			double salud=monto*0.3;
			double comedor=monto*0.5;
			double bolsa=monto*0.2;
			
			
			System.out.println("Monto destinado a salud:$"+salud);
			System.out.println("Monto destinado a comedor:$"+comedor);
			System.out.println("Monto destinado a :$"+bolsa);
			
		}else if (monto<10000) {
			
			double salud=monto*0.25;
			double comedor=monto*0.6;
			double bolsa=monto*0.15;
			
			
			System.out.println("Monto destinado a salud:$"+salud);
			System.out.println("Monto destinado a comedor:$"+comedor);
			System.out.println("Monto destinado a :$"+bolsa);
			
		}

	}

}
