package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrada de datos 
		//Utilizamos la clase Scanner
		
//		Scanner entrada = new Scanner(System.in);
//		
//		//una vez podemos ingresar datos por el teclado, necesitamos las variables adecuadas para poder guardarlos
//		
//		int numero;
//		System.out.println("introduce un numero");
//		numero=entrada.nextInt();
//		
//		System.out.println("introduce otro numero");
//		int numero2;
//		numero2 = entrada.nextInt();
//		
//		System.out.println("LA SUMA ENTRE AMBOS ES: " + (numero + numero2));
//		
//	    String nombre;
//	    System.out.println("Introduce tu nombre");
//	    entrada.nextLine();
//	    nombre = entrada.nextLine();
//	    
//	    System.out.println("Tu nombre es " + nombre);
		
		int n = 10;
		
		int divisor = 2;
		
		int resultado = n/divisor;
		
		int residuo = n%divisor;
		
		System.out.println("el resultado es: " + resultado + "y el residuo es: " + residuo );
		
		

	}

}
