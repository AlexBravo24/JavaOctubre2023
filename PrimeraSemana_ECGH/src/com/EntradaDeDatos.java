package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrada de datos
		//Por teclado
		//Utilizamos a la clase Scanner
		
//		Scanner entrada=new Scanner(System.in);//se debe importar el paquete
//	
//		//Una vez podemos ingresar datos por teclado necesitamos las
//		//variables adecuadas para poder guardarlos
//		int numero;
//		System.out.println("Introduce un número");
//		numero=entrada.nextInt();//pide número entero
//		
//		System.out.println("Introduce otro número");
//		int numero2;
//		numero2=entrada.nextInt();	
//		
//		System.out.println("La suma de ambos es: "+(numero+numero2));
//	
//		String nombre;
//		System.out.println("Introduce tu nombre");
//		//nombre=entrada.next();//solo detecta hasta el proximo espacio 
//		entrada.nextLine();/*El método .nextLine, nos permire consumir los espacios
//		 *que obviamente tambien son caracteres. En ocasiones, cuando ya utilizamos   
//		 el scanner, se queda "volando" un espacio en buffer
//		 y cuando entra en ccion lo que hace es consumir ese espacio vacío 
//		 */
//		
//		nombre=entrada.nextLine();
//		
//		System.out.println("Tu nombre es "+ nombre);
		
	//Seleccionar lo que no necesitamos ejecutar el código
		//y CTRL + 7, se comentan las lineeas
		
		
		//Operador de modulo -Sirve para indicar el valor de residuo
		//de una division
		
		int n=10;
		
		int divisor=3;
		
		int resultado=n%divisor;
		
		System.out.println(resultado);
	
	}

}
