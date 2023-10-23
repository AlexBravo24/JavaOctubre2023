package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa para determinar si un String es palíndromo.
		 * */
		Scanner entrada = new Scanner(System.in);
        
		String palabra;
		char [] palindromo;
		int i,a;
		System.out.println("Ingresse la palabra");
		palabra=entrada.nextLine();
		palabra=palabra.toLowerCase();
		palindromo = palabra.toCharArray();
		i = 0;
		a=palindromo.length -1;
		
		while(i < a) {
			if(palindromo[i] == palindromo[a]) {
			 	a--;
			 	i++;
			}else {
				System.out.println("La palabra: " + palabra + " No es un palindromo" );
				break;
			}
		}
		
		if(i == a) {
			System.out.println("La palabra: " + palabra + " Si es un palindromo" );
		}
		

	}

}
