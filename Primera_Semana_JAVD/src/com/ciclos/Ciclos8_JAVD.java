
//Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el
//mayor 

package com.ciclos;

import java.util.Scanner;

public class Ciclos8_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1,num2, me, ma;
		
		System.out.println("Ingrese el primer n�mero:");
		num1=in.nextInt();
		System.out.println("Ingrese el segundo n�mero:");
		num2=in.nextInt();
		
		if(num1<num2) {
			me = num1;
			ma = num2;
		}
		else {
			me=num2;
			ma=num1;
		}
		
		System.out.println("Los n�meros desde el menor al mayor: ");
		
		for(int i=me;i<=ma;i++) {
			System.out.println(i+" ");
		}
		
	}

}
