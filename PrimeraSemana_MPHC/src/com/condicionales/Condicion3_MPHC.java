package com.condicionales;

import java.util.Scanner;

public class Condicion3_MPHC {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		a = entrada.nextInt();
		
		System.out.println("Ingrese otro numero");
		b = entrada.nextInt();
		
	
		
		if ( b == 0) {
			System.out.println("Error, ingrese un numero mayor a 0");
			
			
		}else {
			int division=a/b;
			System.out.println("El resultado de la division es:"+division);
		}
		

	}

}



//3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
//segundo n�mero es 0, debe mostrar un mensaje de error.