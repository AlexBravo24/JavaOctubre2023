package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ECGH {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteraci�n deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		int numero=12;
	    int veces=10;
	    int mul=0;
	    
		Scanner entrada=new Scanner(System.in);
			
	System.out.println("Introduzca el n�mero a multiplicar");
	numero=entrada.nextInt();
	System.out.println("Introduzca el n�mero de veces a multiplicar");
	veces=entrada.nextInt();
	
	for(int i=1;i<=veces;i++) {
		mul=numero*i;
    	System.out.println(numero+"x"+i+"="+mul);
	}
	entrada.close();
	
	
	
	
	
	
	
	
	}

}
