package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos
		// por teclado
		
		//utilizamos la clase Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		//una vez podemos ingresar datos por teclado necesitamos las variables adecuadas para poder guardarlos
		int numero, numero1;
		System.out.println("introduce un numero");
		numero=entrada.nextInt();
		
		System.out.println("el numero que introdujiste es " + numero);
		
		System.out.println("introduce el numero 2");
		numero1=entrada.nextInt();
		
		System.out.println("introduce numero 3");
		int numero2=entrada.nextInt();
		
		System.out.println("la suma de los 3 numeros es: " + (numero + numero1 + numero2) );
		
		//tambien podemos solicitar valores de tipo string
		String nombre;
		System.out.println("introduce tu nombre");
		entrada.nextLine(); //el metodo nextLine nos permite consumis los espacios pero tambien son caracteres, en ocasiones cuando ya utilizamos el Scanner queda "volando" un espacio en buffer cuando entra en acción lo que hace es consumir ese espacio vacio.
		nombre=entrada.nextLine();
		System.out.println("tu nombre es "+ nombre);
		
		//podemos comentar todo lo que queramos de un codigo para no ejecutarlo seleccionando y presionando ctrl + 7
		
		//operador de modulo, sirve para indicar el valor de residuo de una division
		
		int n = 10;
		int divisor = 2;
		// el operador %, me devuelve el valor del residuo de la division
		//el operador / me devuelve el resultado de la division
		int resultado = n/divisor;
		int residuo = n%divisor;
		System.out.println("el resultado de la division es " + resultado + " y el residuo es " + residuo);
		
		

	}

}
