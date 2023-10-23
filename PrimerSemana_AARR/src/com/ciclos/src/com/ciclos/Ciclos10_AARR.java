package com.ciclos;

import java.util.Scanner;

public class Ciclos10_AARR {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero1, sumatoria = 0, sumatoria2 = 0;
		
		for(int i=1; i<21; i++) {
			System.out.println("introduce el numero: "+i);
			numero1 = entrada.nextInt();
			
			if(numero1>0) {
				System.out.println("este numero es positivo");
				sumatoria = sumatoria + numero1;
			}else {
				System.out.println("este numero es negativo");
			}
			if(numero1%2==0) {
				System.out.println("este numero es par");
				
			}else {
				System.out.println("este numero es impar");
				sumatoria2 = sumatoria2 + numero1;
			}
		}
		System.out.println("la suma de los numeros positivos es: "+sumatoria+" y la suma de los numeros impares es: "+sumatoria2);
}}
