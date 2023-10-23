package com.ciclos;

import java.util.Scanner;

public class Ciclos4_AARR {

	public static void main(String[] args) {
		
		String Frase;
		char Letra;
		int Cantidad = 0;
	 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		Frase = entrada.nextLine();
		
		System.out.println("Escriba la letra que quiere encontrar");
		Letra = entrada.next().charAt(0);  
		entrada.nextLine();
		
		for(int i = 0; i < Frase.length(); i++) {
			
			if(Frase.charAt(i) == Letra) {
				Cantidad = Cantidad + 1;
			}
		} if(Cantidad>0) {
			
			System.out.println("la cantidad de letras "+ Letra + " en la frase " + Frase + " es de : "+ Cantidad);
			
		}else System.out.println("no hay ninguna letra en la oración.");
	}
}
