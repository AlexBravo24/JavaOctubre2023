package com.ciclos;

import java.util.Scanner;

public class Ciclos2_RVV {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce el numero a multiplicar");
		int a=scanner.nextInt();
		
		System.out.println("introduce hasta cuanto multiplicar");
		int b=scanner.nextInt();
		
		System.out.println("Tabla de multiplicar del "+ a+" hasta el "+b);
		
		for(int c= 1; c<=b; c++) {
			int resultado= a*c;
			System.out.println(a+" x "+c+" = "+resultado);
		}
				

	}

}
