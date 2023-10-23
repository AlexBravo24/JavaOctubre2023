package com.Ciclos;

import java.util.Scanner;

public class Ciclos2_JMC {

	public static void main(String[] args) {
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		23 x 95 = ???

		Scanner entrada = new Scanner(System.in);
	  
		int numero1,numero2;
		
		System.out.println("Introduce el numero de la tabla que deseas");
		numero1 = entrada.nextInt();
	
		System.out.println("Introduce el numero de iteraciones deseada");
		numero2 = entrada.nextInt();
	
	
	    for (int i=1;i<=numero2;i++) {
	    	
	    	System.out.println(numero1+"*"+i+"="+(numero1*i));
	    	
	    }
		
		
		
	
	}
	
	
	
	
	
	

}
