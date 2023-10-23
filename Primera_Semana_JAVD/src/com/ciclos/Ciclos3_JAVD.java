
//Realiza un programa para determinar si un String es palíndromo. 

package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String cadena;
		
		System.out.println("-------------TEST DE PALINDROMOS------------");
		
		System.out.println("Ingrese la palabra que quiere analisar:");
		cadena=in.nextLine();
		
		cadena=cadena.replace(" ", "").toLowerCase();
		
		boolean pal=true;
		
		for(int i=0;i<=cadena.length()/2;i++) {
			if(cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
				pal= false;
				break;
			}	
		}
		
		System.out.println("---Resultado---");
		
		if(pal) {
			System.out.println("ES PALINDROMO");
		}
		else {
			System.out.println("NO ES PALINDROMO");
		}

	}

}
