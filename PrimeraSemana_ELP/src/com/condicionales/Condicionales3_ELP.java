package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ELP {

	public static void main(String[] args) {

		//3. Crea un programa que pida al usuario dos números
		//y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.

		Scanner leer = new Scanner (System.in);
		
		double n1, n2, division;
		
		System.out.println("Ingresa el primer numero");
		n1 = leer.nextInt();
	
		System.out.println("Ingresa el segundo numero");
		n2 = leer.nextInt();
		
		division= n1/n2;
		
		if(n2==0) {
			System.out.println("error, no se divide en 0");
		}else {
		System.out.println("La division es: "+division);
		
		leer.close();
	}
	}
}