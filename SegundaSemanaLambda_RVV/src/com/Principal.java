package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		//expresiones lambda
		//son expresiones o funciones anonimas
		//que se implementan a traves de una interface funcional
		//esto no va a permitir escribir el metodo para su uso inmediato
		//sin necesidad de que el metodo sea definido por una clase
		
		//las interfaces no pueden instanciarse, por lo que se haria
		//a traves de una clase anonima
		//la sintaxis de una expresion lambda es la siguiente
		//(parametros)-> {cuerpo de la expresion}
		
		//crear una instancia u objeto de una clase anonima
		//implementada por nuestra interface funcional
		IMetodo suma =(a, b)->System.out.println("la suma es "+(a+b));
		IMetodo resta =(x,y) ->System.out.println("la resta es "+(x-y));
		IMetodo multiplica=(c,d)->{
			Scanner entrada=new Scanner(System.in);
		    System.out.println("ingresa el primer numero");
		    c=entrada.nextInt();
		    System.out.println("ingresa el segundo numero");
		    d=entrada.nextInt();
		    int resultado=c*d;
		    System.out.println("el resultado es "+resultado);
		};
		//una vez definidos los metodos ocn las expresiones lambda
		//llamamos a los objetos y el metodo
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
		
		multiplica.operacion(0, 0);

	}

}