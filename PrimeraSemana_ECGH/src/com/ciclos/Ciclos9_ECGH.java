package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ECGH {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		
		int a;
		int b;
Scanner entrada=new Scanner(System.in);
System.out.println("Introduzca el primer n�mero");
a=entrada.nextInt();
System.out.println("Introduzca el segundo n�mero");
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
