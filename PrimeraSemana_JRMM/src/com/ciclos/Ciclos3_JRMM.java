package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JRMM {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		int i, j;
		boolean espalindromo = true;
		String palindromo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra: ");
		palindromo=entrada.nextLine();
		
		palindromo = palindromo.replace(" ", "");
		palindromo = palindromo.toLowerCase();
		
		i = 0;
		j = palindromo.length()-1;
		
		while((i < j) && espalindromo) {
			if(palindromo.charAt(i) != palindromo.charAt(j)) {
				espalindromo = false;
			}
			i++;
			j--;
		}

		if(espalindromo) {
			System.out.println("La frase es un palindromo");
		}else {
			System.out.println("La frase no es un palindromo");
		}
	}

}
