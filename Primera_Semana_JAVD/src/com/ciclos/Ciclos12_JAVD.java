
//Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
//cuando el promedio de las edades sea superior a 25.

package com.ciclos;

import java.util.Scanner;

public class Ciclos12_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int e,a=0,s=0,prom=0;
		
		while(prom<25) {
			System.out.println("Ingresa la edad de una persona:");
			e=in.nextInt();
			a++;
			s+=e;
			prom=s/a;
			System.out.println("el promedio es "+prom+"  numero de veces "+a+"  suma "+s);
		}
		
	}

}
