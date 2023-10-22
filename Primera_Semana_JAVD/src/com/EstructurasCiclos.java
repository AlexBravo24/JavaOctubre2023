package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLO o también llamados BUCLES
		
		//Estructuras que nos van a permitir repetir sentencias
		//o procesos
		
		//while - indeterminado - mientras se cumpla una condición
		
		int x=1;
		System.out.println("Probando el ciclo WHILE()");
		
		while(x<=5) {//Mientras (se cumpla la condición)
			//Ejecutamos este bloque de código
			System.out.println("Hola mundo "+x);
			//podemos recurrir a un incremento en la variable para
			//controlar este ciclo
			//x=x+1; incrementar el valor de x, porlo que vale + 1
			x++;
		}
		
		//DO - WHILE
		//Ejecuta el código al menos 1 vez, y después pregunta si se sigue realizando
		//De ésta forma aseguramos que si la condición puede no llegar a cumplirse
		//El programa se se ejecute 1 vez
		
		System.out.println("Probando el ciclo DO-WHILE()");
		
		do {//Haz o ejecuta el siguente código
			System.out.println("Hola mundo do-while");			
		}while(x==10);
		
		//FOR - Ciclo determinado
		
		//para (estas condiciones) realizar lo siguiente
		//para (una variable con un valor; una condición; un incremento)
		
		System.out.println("Probando el ciclo FOR");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hola mundo "+ i);
		}

	}

}
