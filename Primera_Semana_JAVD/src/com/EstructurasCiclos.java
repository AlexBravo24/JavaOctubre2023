package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLO o tambi�n llamados BUCLES
		
		//Estructuras que nos van a permitir repetir sentencias
		//o procesos
		
		//while - indeterminado - mientras se cumpla una condici�n
		
		int x=1;
		System.out.println("Probando el ciclo WHILE()");
		
		while(x<=5) {//Mientras (se cumpla la condici�n)
			//Ejecutamos este bloque de c�digo
			System.out.println("Hola mundo "+x);
			//podemos recurrir a un incremento en la variable para
			//controlar este ciclo
			//x=x+1; incrementar el valor de x, porlo que vale + 1
			x++;
		}
		
		//DO - WHILE
		//Ejecuta el c�digo al menos 1 vez, y despu�s pregunta si se sigue realizando
		//De �sta forma aseguramos que si la condici�n puede no llegar a cumplirse
		//El programa se se ejecute 1 vez
		
		System.out.println("Probando el ciclo DO-WHILE()");
		
		do {//Haz o ejecuta el siguente c�digo
			System.out.println("Hola mundo do-while");			
		}while(x==10);
		
		//FOR - Ciclo determinado
		
		//para (estas condiciones) realizar lo siguiente
		//para (una variable con un valor; una condici�n; un incremento)
		
		System.out.println("Probando el ciclo FOR");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hola mundo "+ i);
		}

	}

}
