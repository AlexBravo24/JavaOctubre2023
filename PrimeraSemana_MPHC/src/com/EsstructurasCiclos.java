package com;

public class EsstructurasCiclos {

	public static void main(String[] args) {

		// CICLOS o tambien llamados BUCLES
		// Estructuras que nos van a permitir repetir sentencias o procesos
		// while - ideterminado - minetras se cumpla una condicion

		int x = 1;

		while (x < 5) {
			// mientas (se cumpla esta condicion)
			// ejecutamos este codigo

			System.out.println(x + "." + "Hola mundo");
			// podemos recurrir a un incrmento en la variable para controlar este ciclo

			// x=x+1; // incrementar valor de X

			x++;// simplificar la linea anterior
		}

		// DO - WHILE
		// Ejecutar el codigo al menos 1 vez y despues pregunta si se sigue realizando
		// de esta forma aseguramos que si la condicion puede no llegar a cumplir el
		// programa si se ejecuta 1 vez
		
		
		System.out.println("Probando ciclo DO-WHILE");
		
		do {
			System.out.println("Hola mundo, DO-WHILE");
		} while (x==10);
		
		
		// FOR - ciclo determinado
		// para las condiciones y realizar lo siguiente
		
		System.out.println("Probando ciclo FOR");
		for (int i = 0; i <=5; i++) {
			System.out.println("Hola mundo");
			
		}
		
		
		
		
		

	}

}
