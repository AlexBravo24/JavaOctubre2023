package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char caracter;
		System.out.println("introduce una letra");
		caracter=entrada.next().charAt(0);
		
		if(Character.isUpperCase(caracter)) {
			System.out.println("La letra es mayuscula");
		}else {
			System.out.println("La letra es minuscula");
		}
		
				
		
	}

}
