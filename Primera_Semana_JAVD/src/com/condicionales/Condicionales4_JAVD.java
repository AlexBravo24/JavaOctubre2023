
//4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.

package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String tex; 		
		
		System.out.println("Ingresa �sta frase: hola mundo. (Puede tener may�sculas o min�sculas)");		
		tex=in.nextLine();
		
//		if(tex=="Hola"&&tex=="hOla"&&tex=="hoLa"&&tex=="holA"&&tex=="HOla"&&tex=="HOLa"&&tex=="HOLA"&&tex=="hOLa"&&tex=="hOLA"&&tex=="hoLA"&&tex=="HoLa"&&tex=="hOlA"&&tex=="HolA") {
//			System.out.println("La frase tiene may�sculas");
//		}
//		else {
//			System.out.println("La frase solo tiene min�sculas");
//		}
		if(tex.equals("hola mundo")) {
			System.out.println("La frase no tiene may�sculas");
		}
		else {
			System.out.println("La frase tiene may�sculas");
		}

	}

}
