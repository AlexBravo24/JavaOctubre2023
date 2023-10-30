package com;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Que son las expreciones lambda
		//Expresiones o funciones anonimas que se expresan a través de una interface funcional
		//Esto nos va a permitir escribir el metodo para su uso inmediato sin necesidad
		//de que el metodo sea definido por una clase
		//Las interfaces no pueden instanciarse por lo que se harian a travez de una clase anonima
		//La sintaxis de la exprecion lambda es la siguiente
		//(parametros) ->{cuerpo de la expresion}
		
		//Crear una instancia u objeto de una clase anonima implementada por nuestra Interface funcional
		IMetodo suma = (a, b) -> System.out.println("La suma es: "+(a+b));
		IMetodo resta = (x,y) -> System.out.println("La resta es: "+(x-y));
		
		IMetodo multiplica = (c, d) -> {
			Scanner entrada = new Scanner(System.in);
			System.out.println("ingresa el primer numero");
			c=entrada.nextInt();
			System.out.println("ingresa el segundo numero");
			d=entrada.nextInt();
			int resultado = c*d;
			System.out.println("El resultado es: "+resultado);
		};
		
		//Una vez definidos los metodos con las expreciones lambda llamamos a los objetos y el metodo
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
		
		multiplica.operacion(0, 0);
		
	}

}
