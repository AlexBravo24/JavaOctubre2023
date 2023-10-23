package com.ciclos;

import java.util.Scanner;

public class Ciclos12_ECGH {

	public static void main(String[] args) {
		//12.Se ingresan un conjunto de n edades de personas por teclado.
		//El programa finalizara cuando el promedio de las edades sea superior a 25.
		int n=0;
		int edad=0;
		int promedio=0;
		int edadAcum=0;
		
		Scanner entrada=new Scanner(System.in);

		do {
		System.out.println("Introduce la edad");
		edad=entrada.nextInt();
		n++;
		edadAcum=edadAcum+edad;
		promedio=edadAcum/n;
		System.out.println("Promedio de edad: "+promedio);
		
		}
while(promedio!=25);
		System.out.println("Proceso Finalizado");
		
		entrada.close();
	}

}
