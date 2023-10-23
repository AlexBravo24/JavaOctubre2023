package com.ciclos;

import java.util.Scanner;

public class Ciclos10_ECGH {
	public static void main(String[] args) {
		// 10. Programa que lea 20 números e indique si son positivos o negativos y pares o impares
		//y además muestre la sumatoria de los positivos y sumatoria de los impares.
		int sumpos=0;
		int sumim=0;
		int num;
		Scanner entrada=new Scanner(System.in);
		
		for(int i=0;i<20;i++) {
			num=entrada.nextInt();
			if(num>0) {
				
			int r=num%2;
			if(r==0)
				System.out.println("Numero positivo y par");
			else {
				System.out.println("Numero positivo e impar");
				sumim=sumim+num;
			}
			sumpos=sumpos+num;
			
					}else if(num<0) {
						
						int r=num%-2;
						if(r==0)
							System.out.println("Numero negativo y par");
						else {
							System.out.println("Numero negativo e impar");
							sumim=sumim+num;
						}
						
						
						
						
					}
			System.out.println("Suma de los positivos: "+sumpos);
			System.out.println("Suma de los impares: "+sumim);
		}
entrada.close();
	}

}
