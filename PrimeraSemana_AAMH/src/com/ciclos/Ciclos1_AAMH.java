package com.ciclos;

import java.util.Scanner;

public class Ciclos1_AAMH {

	public static void main(String[] args) {
		// 1.- Programa un algoritmo que realice la
		//tabla de multiplicar del 12
		
		 Scanner entrada = new Scanner(System.in);
	        int x;
	        System.out.print("Introduce un número entero: ");                                                         
	        x = entrada.nextInt();
	        System.out.println("Tabla del 12");
	        for(int i = 1; i<=10; i++){
	             System.out.println(x + " * " + i + " = " + x*i);                                                     
	        }
		

	}

}
