package com.bucles;

import java.util.Scanner;

public class Bucles10_MASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada =new Scanner(System.in);
		 int sumaImpares = 0;
		 int sumaPositivos = 0;

	        for (double i = 0; i <= 19; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            int numero = entrada.nextInt();

	            if (numero > 0 ) {
	            	System.out.println("El número es positivo");
	            	 sumaPositivos += numero;
	            } else if (numero < 0) {
	            	System.out.println("El número es negativo");    
	        }
	            if(numero%2==0) {
	    			System.out.println("El numero es par ");
	    		}else {
	    			System.out.println("El numero es impar");
	    			 sumaImpares += numero;
	    		}
	           
	    }
	   
	        System.out.println("La suma de los números impares es: " + sumaImpares);
	        System.out.println("La suma de los números positivos es: " + sumaPositivos);

	        entrada.close();
	}
}
	





//  System.out.print("Número " + (i + 1) + ": ");
//numeros[i] = entrada.nextInt();