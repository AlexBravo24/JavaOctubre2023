package com.condicionales;

import java.util.Scanner;

public class Condicionales2_RVV {

	public static void main(String[] args) {
		System.out.println("Realiza un programa que pida un numero y nos diga si es par o impar");
		Scanner entrada = new Scanner (System.in);
		 int a;
		 System.out.println("ingresa un numero");
		 a=entrada.nextInt();
		 if (a%2==0) { //esta cosa tiene que se divisible entre 2 para ser par
			 System.out.println("es par");
		 }else {
			 System.out.println("no es par");
		 }
		 
		

	}

}
