package com.bucles;

import java.util.Scanner;

public class Bucles11_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada =new Scanner(System.in);
		 System.out.print("Ingrese el ancho del cuadrado: ");
	        int ancho = entrada.nextInt();

	        System.out.print("Ingrese el alto del cuadrado: ");
	        int alto = entrada.nextInt();

	        for (int i = 0; i < alto; i++) {
	            for (int j = 0; j < ancho; j++) {
	                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
	                    System.out.print("* " );
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }

	        entrada.close();

	}

}
