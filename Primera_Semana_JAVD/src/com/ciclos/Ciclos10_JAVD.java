
//Programa que lea 20 n�meros e indique si son positivos o negativos y pares o
//impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares. 

package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num, p=0, im=0;
		
		System.out.println("Ingrese 20 n�meros");
		
		for(int i=0;i<20;i++) {
			System.out.println("Ingrese el "+(i+1)+"� n�mero: ");
			num=in.nextInt();
			
			if(num>0) {
				System.out.println("El n�mero es positivo.");
				p+=num;
			}
			else if(num<0) {
				System.out.println("El n�mero es negativo.");
			}
			else {
				System.out.println("El n�mero es cero.");
			}
			
			if((num%2) == 0) {
				System.out.println("El n�mero es par.");
			}
			else {
				System.out.println("El n�mero es impar.");
				im+=num;
			}
			
		}
		
		System.out.println("-----------------SUMAS------------------");
		System.out.println("La suma de n�meros positivos es: "+p);
		System.out.println("La suma de n�meros impares es: "+im);

	}

}
