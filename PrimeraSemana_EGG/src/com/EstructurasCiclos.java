package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o también llamados BUCLES
		
		//Estructuras que nos van a perminir sentencias o procesos
		
		//While - indetermindado - mientras se cumpla una condición
		
		int x = 1;
		
		while (x < 5) { // mientras (se cumpla esta condición)
			//Ejecutamos este vloque de código
			System.out.println("Hola mundo");
			//Podemos recurrir a un incremento en la variable para controlar el ciclo
			x++; //Incrementar el valor de x + 1
			
		}
		
		//DO - WHILE
		//Ejecutar el código al menos 1 vez, y después pregunta si se sigue realizando
		//De esta forma aseguramos que si la condición puede no lleagar a cumplirse
		//El prograna si se ejecute 1 vez
		
		System.out.println("Probando el ciclo DO-WHILE");
		
		do {
			System.out.println("Hola mundo do-while");
		}while (x==10);
		
		//FOR - Ciclo determinado
		//para (estas condiciones) realizar lo siguiente
		//para(una variable con un valor; una condicion; un incremento;)
		System.out.println("Probando el ciclo FOR");
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Hola mundo " + i);
		}
		
		
		
	}

}
