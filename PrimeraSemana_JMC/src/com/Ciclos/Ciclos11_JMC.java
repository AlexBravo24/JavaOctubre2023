package com.Ciclos;

import java.util.Scanner;

public class Ciclos11_JMC {

	public static void main(String[] args) {
		// .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		Scanner entrada = new Scanner(System.in);
		int ancho,alto;
		
		
		System.out.print("Ingrese el alto del cuadrado ");
        alto = entrada.nextInt();
		
        System.out.print("Ingrese el ancho del cuadrado ");
        ancho = entrada.nextInt();
        
        
        for (int i = 1; i <=alto; i++) {
        	for (int u = 1; u <=ancho; u++) {
        	
        		 {
                    System.out.print("* ");
        	}
     
        	}
        	  System.out.println();
        }
        
	}

}
