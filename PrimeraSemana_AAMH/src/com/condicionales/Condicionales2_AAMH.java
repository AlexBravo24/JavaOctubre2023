package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AAMH {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado
		//y nos indique si es par o impar.
        		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		   System.out.println("Introducir un número");
		   num = entrada.nextInt();
		           
		if (num % 2 == 0) {
           System.out.println("PAR");
        }else {
        	System.out.println("IMPAR");
        }
	}
}
