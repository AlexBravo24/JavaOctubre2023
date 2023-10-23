package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos
		//Por teclado
		
		//Utilizamos a la clase Scanner
		/*
		Scanner entrada = new Scanner (System.in);
		//Una vez podemos ingresar datos por teclado, necesitamos las
		//variables adecuadas para poder guardarlos
		int numero;
		System.out.println("Introduce un número");
		numero=entrada.nextInt();
		
		System.out.println("Introduce otro número");
		int numero2 = entrada.nextInt();
		
		System.out.println("La suma de ambos es: " + (numero + numero2));
		
		String nombre;
		System.out.println("Introduce tu nombre");
		entrada.nextLine(); //El método .nextLine, nos permite consumir los espacios
		//que obviamente también son caracteres. En ocasiones, cuando
		//ya utilizamos el scanner, se queda "volando" un espacio en buffer
		//y cuando entra en acción lo que hace es consumir ese espacio vació
		nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es " + nombre);
		
		//Seleccionar lo que no necesitamos ejecutar del codigo
		//y ctrl + 7, se comentan las lineas
		 
		*/
		
		//Operador de modulo - sirve para indicar el valor de residuo
		//de una división
		
		int n = 10;
		
		int divisor = 3;
				
		//El operador %, me devuelve el valor del residuo de la división
		int resultado = n%divisor;
		
		System.out.println(resultado);
		
		
		
		
	}

}
