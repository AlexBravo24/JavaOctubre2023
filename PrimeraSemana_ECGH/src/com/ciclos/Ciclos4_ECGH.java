package com.ciclos;

import java.util.Scanner;

public class Ciclos4_ECGH {

	public static void main(String[] args) {
//		4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
//		“Carácter no encontrado”.
		String frase;
		String letra;
		int a=0;
		char com=' ';
		char l='*';
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca la frase:");
		frase=entrada.nextLine();
		System.out.println("Introduzca la letra:");
		letra=entrada.next();
		l=letra.charAt(0);
		
		for(int i=0;i<frase.length();i++) {
			 com=frase.charAt(i);
			if(com==l) {//se mejora poniendole de la siguiente manera if(frase.charAt(i)==letra.charAt(0));
				a++;
			}
		}
		
		
		if(a>0)
		System.out.println(a);
		else
		System.out.println("Carácter no encontrado ");
		
		entrada.close();
		
	}

}
