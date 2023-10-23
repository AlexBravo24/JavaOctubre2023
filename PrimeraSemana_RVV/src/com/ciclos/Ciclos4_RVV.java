package com.ciclos;

import java.util.Scanner;

public class Ciclos4_RVV {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//
				
		System.out.println("Ingresa una palabra");
		String palabra=scanner.nextLine();
		
		System.out.println("la letra a buscar");
		char letra=scanner.next().charAt(0);
		
		int c=0;
		
		for(int a=0; a<palabra.length(); a++) {
			if(palabra.charAt(a)==letra) {
				c++;
			}
		}
	
		if (c>0) {
			System.out.println("La letra "+letra+" aparece "+c+" veces en esta palabra");
		}else {
			System.out.println("Caracter no encontrado");
		}

	}

}
