package com.ciclos;

import java.util.Scanner;

public class Ciclos8_AARR {

	public static void main(String[] args) {
		
		int numeroMayor, numeroMenor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el numero mayor");
		numeroMayor = entrada.nextInt();
		System.out.println("ingrese numero menor");
		numeroMenor = entrada.nextInt();
		
		System.out.println("los numeros entre numero mayor y numero menor son: ");
		
		for(int i = numeroMenor+1; i<numeroMayor; i++) {
			numeroMenor++;
			System.out.println(numeroMenor);
		}
	}

}
