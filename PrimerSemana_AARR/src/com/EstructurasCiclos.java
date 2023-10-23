package com;

public class EstructurasCiclos {
	
		public static void main(String[] args) {
			
			//Ciclos o tambien llamados bucles
			//son estructuras que nos van a permitir repetir sentencias o procesos
			
			//while - ciclo indeterminado - mientras se cumpla una condicion
			
			int x = 1;
			System.out.println("probando cyclo while()");
			
			while(x<=5) {//mientras esta condición se cumpla se ejecutara este bloque de codigo
				
				System.out.println("Hola mundo " + x);
				//podemos recurrir a aumentar la variable para controlar el ciclo
				x = x + 1; //incrementar el valor de x, por lo que vale + 1, tambien puede ser x++;
				
				
				
			}
			//Do While - ejecuta el codigo al menos una vez y luego pregunta si se sigue ejecutando, 
			//de esta forma si la condición no llega a cumplirse el programa se ejecutara 1 sola vez
			
			System.out.println("probando el ciclo Do While");
			do {//Haz o ejecuta este codigo
				System.out.println("Hola mundo do-while");
			}while (x==10);
			
		}
		
}
