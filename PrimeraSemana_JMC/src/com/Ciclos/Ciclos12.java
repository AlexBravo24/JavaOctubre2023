package com.Ciclos;

import java.util.Scanner;

public class Ciclos12 {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25
		
		Scanner entrada = new Scanner(System.in);
		float edad,edadc=0;
		float promedio=0;
		
		
		for(int i=1;promedio<25;i++) {
			
		System.out.println("ingresa tu edad");
		edad = entrada.nextFloat();
		
		edadc = edad+edadc;
		
		promedio = edadc/i;
		
		System.out.println("la edad promedio Actual es: "+promedio);
		
		
		}
		
		

	}

}
