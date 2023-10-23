package com.Condicionales;

import java.util.Scanner;

public class Condicionales3_JMC {

public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
	//segundo número es 0, debe mostrar un mensaje de error
	
	 float numero1,numero2;
	
	 System.out.println("Ingresa un numero"); 
		numero1 = entrada.nextInt();
	 
		System.out.println("Ingresa un segundo numero"); 
		numero2 = entrada.nextInt();	
		
		
		if (numero2==0) {	
			System.out.println("Error la division entre 0 no existe");
			}
		else {
			System.out.println("la division entre los numeros es: "+(numero1/numero2));
		}

}


}