package com.ciclos;

import java.util.Scanner;

public class Ciclos3_ECGH {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
	String word;
	Scanner entrada= new Scanner(System.in); 
	
	System.out.println("Introduzca su palabra");
	word=entrada.next();
	
String inverseWord=new StringBuilder(word).reverse().toString();

if(word.equals(inverseWord)) {
	System.out.println("La palabra es un palíndromo");
}
else {
	System.out.println("La palabra no es un palíndromo");
}
	
	entrada.close();
	
	
}
	}
	
	
	
	
	
	

