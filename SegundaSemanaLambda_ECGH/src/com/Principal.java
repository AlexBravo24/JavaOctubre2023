package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Expresiones LAmbda
		//Son expresiones o funciones anonimas 
		//Que se implementan a través de una interface funcional
		//Esto nos va a permitir escribir el método para su uso inmediato
		//Sin la necesidad de que el método sea definido por una clase
		
		//LAs interfacesno pueden instanciarse, por lo que se haria
		//a traves de una clase anonima
		//LA sintaxis de una expresion lambda es la siguiente
		//(parametros)-> {cuerpo de la expresion}
		
		//Crear una instamcoa u objeto de una clase anonima
		//imlementada por nuestra inferface funcional
		IMetodo suma=(x,y)-> System.out.println("La suma es: "+(x+y)); 
		IMetodo resta=(w,z)->System.out.println("La resta es: "+(w-z));
		
		IMetodo multiplica=(c,d)->{
			Scanner entrada= new Scanner(System.in);
			System.out.println("Ingresa el primer número");
			c=entrada.nextInt();
			System.out.println("Ingresa el segundo número");
			d=entrada.nextInt();
			int resultado=c*d;
			System.out.println("El resultado es: "+resultado);
		};
		
		//Una vez definidos los métodos con las expresiones lambda
		//llamamos a los objetos y el método
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
		
		multiplica.operacion(0, 0);
		

	}

}
