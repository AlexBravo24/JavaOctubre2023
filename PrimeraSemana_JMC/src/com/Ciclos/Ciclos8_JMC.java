package com.Ciclos;

import java.util.Scanner;

public class Ciclos8_JMC {

	public static void main(String[] args) {
	//Programa Java que lea dos números y muestre los números desde el menor hasta el 
	//	mayor 
		Scanner entrada = new Scanner(System.in);
		
		int numero1,numero2;
		
		System.out.println("Ingresa un numero" );
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa otro numero" );
		numero2 = entrada.nextInt();
		
		if (numero1>numero2) {
			
			while(numero1>=numero2) {
				System.out.println(numero2);
				numero2++;
				
			}
			
		}
		else if(numero1<numero2) {
			
			while(numero1<=numero2) {
				System.out.println(numero1);
				numero1++;
				
			}
			
		
		}
		
		
	}

}
