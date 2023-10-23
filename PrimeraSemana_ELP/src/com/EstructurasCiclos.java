package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//CICLOS O también llamados BUVLES
		
		//Estructuras que nos van a permitir repetir sentencias
		//o procesos
		
		//while - indeterminado - mientras se cumpla una condición
		
		int x = 1;
		
		while (x<5) {// mientras (se cumpla esta condicion)
			//Ejecutamos  este bloque de codigo
			System.out.println("Hola mundo" + x);
			//podemos recurrir a un incremento en la variable para
			//controlar este ciclo
			//x = x + 1; //incrementar el valor de x, por lo que vale + 1
			x++;
			
			
		}
		
		//DO - WHILE
		//Ejecutar el codigo al menos 1 vez, y despues pregunta si se sigue realizando
		//De esta forma aseguramos que si la condicion puede no llegar a cumplirse
		//El programa si se ejecuta 1 vez
		
		System.out.println("Probando el ciclo DO-WHILE");
		
		do { // Haz o ejecuta el siguiente codigo
			System.out.println("Hola mundo do-while");
		}while (x==10);
		
		//FOR - Ciclo determinado
		
		// para (estas condiciones) realizar lo siguiente
		// para (una variable con un valor; una condición; un incremento)
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Hola mundo " +i);
		}
	}

}
