package com.ciclos;

import java.util.Scanner;

public class Ciclos1_AARR {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tabla del 12, presione ENTER para continuar");
		entrada.nextLine();
		
		for(int i = 1; i < 12; i++ ) {
			
			System.out.println(i * 12);
		}
		

	}

}
