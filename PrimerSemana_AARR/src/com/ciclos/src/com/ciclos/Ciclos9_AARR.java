package com.ciclos;

import java.util.Scanner;

public class Ciclos9_AARR {

	public static void main(String[] args) {
		
		int numeroMayor, numeroMenor, residuo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el numero mayor");
		numeroMayor = entrada.nextInt();
		System.out.println("ingrese numero menor");
		numeroMenor = entrada.nextInt();
		
		System.out.println("los numeros pares numero mayor y numero menor son: ");
		
		for(int i = numeroMenor+1; i<numeroMayor; i++) {
			numeroMenor++;
			
			residuo = numeroMenor%2;
			if(residuo == 0) {
			System.out.println(numeroMenor);
		}
			}
	}
	}


