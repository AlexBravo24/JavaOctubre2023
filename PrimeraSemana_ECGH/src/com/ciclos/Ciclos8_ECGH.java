package com.ciclos;

import java.util.Scanner;

public class Ciclos8_ECGH {

	public static void main(String[] args) {
		// 8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
		int a;
		int b;
Scanner entrada=new Scanner(System.in);
System.out.println("Introduzca el primer número");
a=entrada.nextInt();
System.out.println("Introduzca el segundo número");
b=entrada.nextInt();

if(a<b) {
	int aux=a;
	a=b;
	b=aux;
	}

for(int i=b;i<=a;i++) {
	System.out.println(i);
}
	
entrada.close();
	
	
	}

}
