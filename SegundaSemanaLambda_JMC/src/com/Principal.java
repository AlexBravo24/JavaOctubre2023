

package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		//Expreciones lambda
		//Son expresiones o funciones anonimas 
		//que se implementan a traves de una interface funcional
		//Sin necesidad de que el metodo sea definido por una clase
		
		//las interfaces no pueden instanciarse- ´pr lo que se haria 
		//a traves de una clse anonima
		//la sintansis de una expresion lambda es la siguiente
		//(parametros)->{cuerpo de expresion}
		
		//crear una instancia u objero de una clase anonima
		
		Imetodo suma = (a,b) ->System.out.println("la suma es "+(a+b));
		Imetodo resta = (x,y)->System.out.println("la resta es "+(x-y));
		Imetodo multiplica = (c,d)->{ 
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa el primer numero");
			c= entrada.nextInt();
			System.out.println("ingresa el segundo numero");
			d= entrada.nextInt();
			int resultado=c*d;
			System.out.println(resultado);
		};
		//Una vez definidos los metodos con las expresiones lambda
		//lamamos a los objetos y el metodo

		
		suma.operacion(10, 50);
		resta.operacion(10, 4);
		multiplica.operacion(0, 0);
	}

}
