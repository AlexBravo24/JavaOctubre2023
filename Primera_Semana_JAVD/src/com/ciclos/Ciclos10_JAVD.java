
//Programa que lea 20 números e indique si son positivos o negativos y pares o
//impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 

package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num, p=0, im=0;
		
		System.out.println("Ingrese 20 números");
		
		for(int i=0;i<20;i++) {
			System.out.println("Ingrese el "+(i+1)+"° número: ");
			num=in.nextInt();
			
			if(num>0) {
				System.out.println("El número es positivo.");
				p+=num;
			}
			else if(num<0) {
				System.out.println("El número es negativo.");
			}
			else {
				System.out.println("El número es cero.");
			}
			
			if((num%2) == 0) {
				System.out.println("El número es par.");
			}
			else {
				System.out.println("El número es impar.");
				im+=num;
			}
			
		}
		
		System.out.println("-----------------SUMAS------------------");
		System.out.println("La suma de números positivos es: "+p);
		System.out.println("La suma de números impares es: "+im);

	}

}
