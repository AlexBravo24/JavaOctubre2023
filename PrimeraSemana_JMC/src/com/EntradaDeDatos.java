package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Entrada de datos
		//Por teclado
		
		//Utilizmos a la clase Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		//Una vez podemos teclear datos por teclado, necesitamos las 
		// variables adecuadas para poder guardarlos
		
		int numero;
		
		
		System.out.println("Introduce un numero");
		numero = entrada.nextInt();    
		
		System.out.println("Introduce un numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("la suma de los numeros es:"+ (numero+numero2));
		
		String nombre;
		System.out.println("Introduce tu nombre");
		entrada.nextLine();//Esta linea la utilizamos por que el nextline conusmiio un espacio en el buffer 
		nombre = entrada.nextLine();
		
		System.out.println("Tu no nombre es"+ nombre);
		
		// ctrl + 7 para comentar lo que yo seleccione con el cursor
		
		//Operador de modulo -sirve para indicar el valor de residuo 
		// de una division
		
		int n = 10;
		
		int divisor = 3;
		
		
		//el Operador %, me devuelve el valor del residuo de la division
		int resultado = n%divisor;
		
		System.out.println(resultado);
		
		
		
		
	}

}
