package com.bucles;

import java.util.Scanner;

public class Bucles1_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		

	int numero=12;
	
	System.out.println("Tabla de multiplicar del " + numero + ":");
	
	for (int i = 0; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
	}
	
	
	}


