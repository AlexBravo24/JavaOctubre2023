package com.ciclos;

import java.util.Scanner;

public class Ciclos9_RVV {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("ingresa un numero");
		int a=scanner.nextInt();
		
		System.out.println("ingresa otro numero");
		int b=scanner.nextInt();
		
		int menor =Math.min(a,b);
		int mayor=Math.max(a, b);
		
		System.out.println("los numero pares que estan entre "+menor+" y el "+mayor+" son ");
		
		for (int c=menor; c<=mayor; c++) {
			if(c%2==0) {
				System.out.println(c);
			}
		}
	}

}
