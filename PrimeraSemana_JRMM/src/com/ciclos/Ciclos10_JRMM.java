package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JRMM {

	public static void main(String[] args) {
		
		//10. Programa que lea 20 números e indique si son positivos o negativos y pares o
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
		
		Scanner entrada = new Scanner (System.in);
		
		int n,sumaP=0,sumaI=0;
		
		for(int i=1; i<=20; i++) {
			System.out.println("Inserte numero " + i + " : ");
			n=entrada.nextInt();
			
			if(n > 0 && n%2==0) {
				System.out.println("El numero es positivo y par");
				sumaP = sumaP + n;
			}else if(n > 0 && n%2!=0){
				System.out.println("El numero es positivo e impar");
				sumaI=sumaI+n;
			}else if(n < 0 && n%2==0) {
				System.out.println("El numero es negativo y par");
				sumaP = sumaP + n;
			}else if(n < 0 && n%2!=0) {
				System.out.println("El numero es negativo e impar");
				sumaI=sumaI+n;
			}
			
		}
		System.out.println("La suma de los numeros pares es: " + sumaP);
		System.out.println("La suma de los numeros impares es: " + sumaI);


	}//cierre main

}//cierre clase
