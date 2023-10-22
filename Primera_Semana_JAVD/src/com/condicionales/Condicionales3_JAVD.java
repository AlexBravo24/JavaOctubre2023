
//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
//segundo número es 0, debe mostrar un mensaje de error.

package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b, result;
		
		System.out.println("Ingresa un número: ");
		a=in.nextDouble();
		System.out.println("Ingresa otro número: ");
		b=in.nextDouble();
		
		if(a!=0 && b!=0) {
			result=a/b;
			System.out.println("El resultado de la divición es: " + result);
		}
		else {
			System.out.println("ERROR");
		}
		
		

	}

}
