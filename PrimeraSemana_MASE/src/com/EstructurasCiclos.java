package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o tambièn llamados bucles
		
		//Estructuras que nos van a permtir  repetir sentencias o proocesos

	// while - indeterminado - mientras se cumpla una condicion 
		
		int x =1;
		while (x<5){ // mientras (se cumpla la condicion )
			//ejecutamos este bloque de codigo
			System.out.println("Hola mundo" );
			
		// podemos recurrir a un incremento para controlar este ciclo 
			x++;
			
		}
		
		//Do- While 
		// ejecuta el codigo de al menos una vez, y despuè pregunta si se sigue realizando 
		// De esta forma aseguramos que si la condicion puede no llegar a cumplir 
		// el programa si se ejecute 1 vez
		System.out.println("probando el metodo do- while");
		
		do {//haz o ejecuta el siguiente codigo
			System.out.println("Hola mundo do-while");
			
		}while(x==10);
		
		
		
		//For _ Ciclo determinado 
		// para estas condiciones realizamos lo sig
		//para una variable que se llame i que tenga un valor se va a incrementar
		
		System.out.println("probando el ciclo for");
		
		for (int i = 1; i<5; i++) {
			System.out.println("Hola mundo " + i);
		}
		}
	
	
	}
	


