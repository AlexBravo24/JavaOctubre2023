package com.ciclos;

import java.util.Scanner;

public class Ciclos11_ELP {

	public static void main(String[] args) {
		/*11.Dibuja un cuadrado, como en la imagen que acompaña,
		 introducir desde teclado el 
		 ancho y el alto. Ejemplo: 8 x 8 
		*/
		

		Scanner leer = new Scanner(System.in);
		   
	    int n;
	   
	        System.out.print("Por favor ingrese lado del cuadrado: ");
	        n = leer.nextInt();
	    
	   
	        if(n >= 2 && n <= 50) {
	            for (int i = 1; i <= n; i++) {
	                for (int j = 1; j <= n; j++) {
	                    System.out.print(" *");
	                }
	                System.out.println("");
	            }
	        }else {
	            System.out.println("Por favor ingrese un numero entre 2 y 50");
	        }
	    }
	   
	    
	    
	}
