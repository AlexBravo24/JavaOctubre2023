package com.ciclos;

import java.util.Scanner;

public class Ciclos1_MPHC {
	
	//1.- Programa un algoritmo que realice la tabla de multiplicar del 12

	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Ingresa la tabla de mulriplicar");
		int tabla= entrada.nextInt();
		System.out.println(" ");
		System.out.println("<<< Tabla del:"+tabla+" >>>");
		
		int x=1;

		
		while (x<=10) {
			
			int total=x*tabla;
			System.out.println(x+"x"+tabla+"="+total);
			
			x++;
			
		}
		
		
		
		

	}

}
