package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Entrada de datos
		//por teclado
		
		//utilizamos la clase scanner
		
		Scanner entrada= new Scanner(System.in);
		//una vez podemos ingresar datos por teclado, necesitamos las
		//variables adecuadas para poder guardalos
		int numero;
		System.out.println("Introduce un numero");
		numero=entrada.nextInt();
		
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();
		System.out.println("La suma de ambos es: " + (numero + numero2));
		
		String nombre;
		System.out.println("Introduce tu nombre");
		entrada.nextLine(); //El metodo .nextline, nos permite consumir los espacios
		//que obviamente tmabien son caracteres. en ocasiones, cuando
		//ya utilizamos el scanner, queda volando un espacio en buffer
		//cuando entra en accion lo que hace es consumir ese espacio vacio
		nombre= entrada.nextLine();
		
		System.out.println("Tu nombre es " + nombre); 
		
		//seleccionar lo que no necesitemos ejecutas del codigo
		//y CTRL + 7, se comentan las lineas o agregar al incio /* y hasta donde requieras */
		
		//Operador de modulo - sirve para indicar el valor de residuo
		//de una division
		
		int n= 10;
		int divisor =3;
		//el operador % me devuelve el valor del residuo de la division
		int resultado1= n/divisor;
		int resultado= n%divisor;
		System.out.println(resultado);
		
	
		
	}

}
