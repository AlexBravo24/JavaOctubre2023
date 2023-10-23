package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
//		//Entrada de Datos por teclado
//		//utilizamos a la clase Scanner
//		
//		Scanner entrada = new Scanner(System.in); // una vez podemos ingresar datos por teclado
//		//necesitamos variables adecuadas para poder guardarlos
//		
//		int numero;
//		System.out.println("Introduce un nùmero");
//		numero=entrada.nextInt();
//		
//		System.out.println("Introduce otro nùmero");
//		int numero2=entrada.nextInt();
//		
//		System.out.println("La suma de ambos es: " + (numero + numero2));
//		
//		String nombre;
//		System.out.println(" Introduce tu nombre");
//		entrada.nextLine();
//		nombre = entrada.nextLine();
//		System.out.println("Tu nombre es : " + nombre);
//		
		//Operador de Modulo : Sirve para indicar el valor de residuo de una divisiòn
		
		int n = 10;
		
		int divisor = 2;
		
		int resultado = n/divisor;
		
		int residuo = n%divisor;
		
		System.out.println("El resultado de la divisiòn es: " + resultado + "   El  residuo es: "+ residuo);

}
}
