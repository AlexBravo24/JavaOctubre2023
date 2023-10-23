package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ECGH {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos
		
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
	int r=i%2;
	if (r==0)
	System.out.println(i);
}
		entrada.close();
		
		

	}

}
