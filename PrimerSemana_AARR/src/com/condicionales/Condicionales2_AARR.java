package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, residuo;
		
		System.out.println("Escribe un numero");
		numero = entrada.nextInt();
		
		residuo = (numero%2);
		
		if (residuo == 0) {
			System.out.println("este numero es par");
		}else {
			System.out.println("este numero es impar");
		}

	}

}
