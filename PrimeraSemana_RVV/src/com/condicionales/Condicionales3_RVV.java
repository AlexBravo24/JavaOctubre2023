package com.condicionales;

import java.util.Scanner;

public class Condicionales3_RVV {

	public static void main(String[] args) {
		System.out.println("Realiza un programa que pida 2 numeros y los divida");
		Scanner entrada= new Scanner(System.in);
		double a;
		double b; //por algun motivo que no comprendo no me deja hacer la division entre 0 si no es double
		
		System.out.println("Ingresa un numero");
		a=entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		b=entrada.nextInt();
		System.out.println("Los numeros ingresados son: "+ a + " y "+ b);
		double resultado=a/b; //solo me deja ponerlo despues de entrar los datos arriba
		if (b==0) {
			System.out.println("no se puede dividir entre 0");
		}else {
			System.out.println("el resultado de la division es "+resultado);
		}

	}

}
