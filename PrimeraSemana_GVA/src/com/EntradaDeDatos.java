package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Entrada de datos 
		//Por teclado
		
		//Utilizamos a la clase Scanner
		
//		Scanner entrada = new Scanner (System.in);
//		
//		//Una vez podemos ingresar datos por teclado, necesitamos las
//		//variables adecuadas para poder guardarlos
//		int numero; 
//		System.out.println("Introduce un numero");
//		numero = entrada.nextInt();
//		
//		System.out.println("Introduce otro numero");
//		int numero2 = entrada.nextInt();
//		
//		System.out.println("La suma de ambos es " + (numero+numero2));
//		
//		String nombre;
//		System.out.println("Introduce tu nombre");
//		entrada.nextLine(); //El m�todo .nextline, nos permite consumir los espacios
//		//que obviamente tambi�n son caracteres. En ocasiones, cuando 
//		// ya utilizamos el scanner, se queda "volando" un espacio en buffer 
//		//y cuando entra en acci�n lo que hace es consumir espacio vac�o
//		nombre = entrada.nextLine();
//		
//		System.out.println("Tu nombre es " + nombre);
		
		//Seleccionar lo que no necesitemos ejecutar del c�digo
		//y CTRL + 7, se comentan las l�neas
		
		
		//Operador de m�dulo - Sirve para indicar el valor del residuo
		//de una divisi�n
		
		int n = 10;
		
		int divisor = 4;
		
		//El operador %, me devuleve el valor del residuo de la divisi�n
		int resultado = n%divisor;
		 
		System.out.println(resultado);

	}

}
