package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Entrada de datos por teclado

		//Utilizamos a la clase Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		//Una vez podemos ingresar datos por teclado, necesitamos las
		//variables adecuadas para poder guardarlos
		
		int numero;
		System.out.println("Introduce un número: ");
		numero = entrada.nextInt();
		
		System.out.println("Introduce otro número: ");
		int numero2;
		numero2 = entrada.nextInt();
		
		System.out.println("La suma de ambos es: " + (numero+numero2));
		
		String nombre;
		System.out.println("Introduce tu nombre: ");
		entrada.nextLine();//El método .nextLine, nos permite consumir los espacios
		//que obviamente también son caracteres. En ocaciones, cuando ya utilizamos
		//el scanner, se queda "volando" un espacio en buffer y cuando entra en acción
		//lo que hace es consumir ese espacio vacío.
		nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es: " + nombre);
		
		//Seleccionar lo que no necesitamos ejecutar del código
		//ctrl + 7 ó /* al inicio y */ al final para comentar las líneas de código
		
		//Operador de modulo - sirve para indicar el valor de residuo de la división
		
		int n=10;
		int div=3;
		//El operador %, me devuelve el valor del residuo de la división
		double result=n%div;
		
		System.out.println(result);
		
	}

}
