package com.ciclos;

import java.util.Scanner;

public class Ciclos8_AAMH {

	public static void main(String[] args) {
		// 8. Programa Java que lea dos números y
		//muestre los números desde el menor hasta el mayor
		
		Scanner entrada =new Scanner(System.in);
        int a;
        int b;
        
        System.out.print("ingrese el primer número : ");
        a = entrada.nextInt();
        
        System.out.print("ingrese el segundo número : ");
        b = entrada.nextInt();
        
        if(a<b){
            System.out.print("el orden correcto es : "+a+"->"+b);
        }
        else
            System.out.print("el orden de menor a mayor es : "+b+" -> "+a);
	}

}
