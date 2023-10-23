package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AARR {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Tabla, NumeroM;
		
		System.out.println("Tabla de multipliucar personalizada");

		System.out.println("Ingrese de que numero quiere la tabla");
		Tabla = entrada.nextInt();
		
		System.out.println("Ingrese hasta que numero multiplicar");
		NumeroM = entrada.nextInt();
		System.out.println("Tabla del: "+ Tabla + " multiplicada hasta el numero: "+ NumeroM);
		
		for(int i = 1; i < NumeroM+1; i++ ) {
			
			System.out.println(Tabla + " x " + i+ " = " +i * Tabla);
		}
		
	
	}

}
