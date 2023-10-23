package com.ciclos;

import java.util.Scanner;

public class Ciclos11_EGG {

	public static void main(String[] args) {
		//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		Scanner entrada = new Scanner(System.in);
		int ancho,alto;
		
		System.out.println("Ingrese el ancho del cuadrado ");
        ancho = entrada.nextInt();    
		System.out.println("Ingrese el alto del cuadrado ");
        alto = entrada.nextInt();
		
        for (int i = 1; i <=alto; i++) {
        	for (int j = 1; j <=ancho; j++) {
        		 System.out.print("* ");
        	}
        	  System.out.println();
        }
        
	}

}
