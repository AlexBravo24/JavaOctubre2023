package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//Ciclos o tambien llamados BUCLES
		
		
		///Estructuras que nos van a permitir repetir sentencias 
		//o procesos
		
		//while-indeterminado-mientras se cumpla un condición
		
		int x=1;
		
		while(x<=5) {//mientras (se cumpla esta condición)
			//Ejecutamos este bloque de código
			System.out.println("Hola mundo "+x);
			//podemos recurrir a un incremento en la variable para
			//controlar este ciclo
			x++;
		}
		
		//DO-WHILE
		//Ejecutar el código al menos 1 vez, y después pregunta si se sigue realizando
		//De esta forma aseguramos que si la condición puede no llegar a cumpplirse
		//El programa si se ejecute 1 vez
		
		System.out.println("Probando el ciclo DO-WHILE");
		do {
			System.out.println("Hola mundo do-while");
		}while(x==10);
		
		//For- ciclo determinado
		//para (estas condiciones) realizar lo siguiente
		//para (una variable con un valor; una condición;un incremento)
		
		System.out.println("Probando el ciclo FOR");
		for(int i=1;i<=5;i++) {
			System.out.println("Hola mundo "+i);
			
		}
		
		
		
		
		

	}

}
