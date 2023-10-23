package com.Condicionales;

import java.util.Scanner;

public class Condicionales1_JMC {

	public static void main(String[] args) {
		
	// Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales//
       Scanner entrada = new Scanner(System.in);
       
       int numero1,numero2;
       
       System.out.println("Digita el perimer numero");
       numero1 = entrada.nextInt();
       
       System.out.println("Digita el segundo numero");
       numero2 = entrada.nextInt();
       
       if(numero1>numero2) {
    	   System.out.println("El numero mayor es: "+numero1);
       }
       else if (numero1==numero2) {
    	   System.out.println("Los numeros son iguales");
       }
       
       else   {
    	   
    	   System.out.println("El numero mayor es: "+numero2);
    	   
       }
	}
}

