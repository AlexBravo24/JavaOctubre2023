package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Entrada de datos
		// Por teclado
		
		//Utilizamos a la clase Scanner
		
		Scanner leer = new Scanner (System.in);
		
//		//Una vez podemos ingresar datos por teclado, necesitamos las
//		//variables adecuadas para poder guardarlos
//		
//		int numero;
//		System.out.println("Introduce un número");
//		numero = leer.nextInt();
//		
//		System.out.println("Introduce otro numero");
//		int numero2 = leer.nextInt();
//		
//		System.out.println("La suma de ambos es: " + (numero + numero2));
//		
//		String nombre;
//		System.out.println("Introduce tu nombre");
//		leer.nextLine(); // El metodo .nextLine, nos permite consumir los espacios
//		//que ya obviamente también son caracteres. En ocasiones, cuando
//		//ya utilizamos el scannerm se queda "volando" un espacio en buffer
//		// y cuando entra en accipon lo que hace es consumir ese epacio vacui
//		
//		
//		nombre = leer.nextLine();
//		
//		System.out.println("Tu nombre es " + nombre);
//		
//		//Seleccionar lo que no necesitamos ejecutar del codigo
//		//y CTRL + 7, se comentan las lineas
		
		//Operador de modulo - Sirve para indicar el valor de residuo
		//de una division
		
		int n = 10;
		
		int divisor =3;
		
		//El operador %, me devuelve el valor del residuo de la sivision 
		int resultado = n%divisor;
		
		System.out.println(resultado);
		
		}
		
		
		
	}


