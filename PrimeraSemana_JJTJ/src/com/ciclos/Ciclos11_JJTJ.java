package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
     
		System.out.println("Ingresse el ancho");
		num1=entrada.nextInt();
		System.out.println("Ingresse la altura");
		num2=entrada.nextInt();
		
		for(int i = 1 ; i <=num1; i++) {
			for(int j = 1; j<=num2; j++){
				if (i == 1 || i == num1 || j == 1 || j == num2) {
                    System.out.print("*");  
                } else {
                    System.out.print("*");  
                }
			}
			  System.out.println();
		}

	}

}
