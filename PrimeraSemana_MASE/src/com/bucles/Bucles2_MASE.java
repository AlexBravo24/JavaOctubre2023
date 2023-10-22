package com.bucles;

import java.util.Scanner;

public class Bucles2_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		

		int numero;
		int iteraciones;
		
		System.out.println("Tabla de multiplicar del :");
		numero=entrada.nextInt();
		System.out.println("Hasta el :");
		iteraciones=entrada.nextInt();
		
		for (int i = 1; i <= iteraciones; i++) {
	        int resultado = numero * i;
	        System.out.println(numero + " x " + i + " = " + resultado);
	    }

	}

}
