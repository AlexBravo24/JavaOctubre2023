package com.ciclos;

import java.util.Scanner;

public class Ciclos3_RVV {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ingrese una palabra:");
		String cadena=scanner.nextLine();
		 
		cadena=cadena.replaceAll("\\s", "").toLowerCase();
		boolean P =true;
		
		for(int a=0; a< cadena.length()/2; a++){
			if(cadena.charAt(a)!=cadena.charAt(cadena.length()-1-a)) {
				P =false;
				break;
				
			}
		}
		
		if(P) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("no es un palindromo");
		}

	}

}
