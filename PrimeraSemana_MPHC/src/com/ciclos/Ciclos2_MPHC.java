package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MPHC {
	
//  2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//	desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//	23 x 95 = ???
	
	public static void main(String[] args) {
	Scanner entrada =new Scanner(System.in);
		
		System.out.println("Ingresa la tabla de multiplicar");
		int tabla= entrada.nextInt();
		
		System.out.println("Ingresa hasta que numero deseas que se muestre la tabla de multiplicar");
		int tamano= entrada.nextInt();
		System.out.println(" ");
		System.out.println("<<< Tabla del:"+tabla+" al "+tamano+" >>>");
		
		int x=1;

		
		while (x<=tamano) {
			
			int total=x*tabla;
			System.out.println(x+"x"+tabla+"="+total);
			
			x++;
		}
		
	}

}
