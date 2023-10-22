package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras Condicionales o de decision
		//If - Evaluan valores booleanos
		
		int x = 10;
		
		if (x<10) { //Si (esto es verdad) (ejecuta lo siguiente)
			System.out.println("Si");
		}else { //De otro modo, ejecuta lo siguiente
			System.out.println("No");
		}
		
		//OPERADORES L�GICOS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//AND - && - Duvuelven el valor true cuando se cumplen
		//todas las condiciones
		System.out.println("Resultado Operador L�gico AND");
		if (x<11 && x>8 &&x==9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//cierre del else
		
		
		//OR - || -Devolver el valor true cuando se cumpla al menos
		//una de las condiciones
		System.out.println("Resultado Operador L�gico OR");
		if (x<11 || x>8 || x==9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//Cierre del else
		
		
		//DIFERENTE DE - != - Compara los valores y devuelve true
		//si estos valores son diferentes
		System.out.println("Resultado Operador L�gico DIFERENTE DE");
		if (x != 20) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//Cierre del else
		
		
		//IGUALDAD o comparaci�n - == - Compara si los valores son iguales
		//y devuelve true cuando esto se cumple
		System.out.println("Resultado Operador L�gico IGUALDAD");
		if (x == 10) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//Cierre del else
		
		//NOT - ! - Niega una condici�n o m�s bien, cambia ek valor de true
		//a false y viceversa
		
		System.out.println("Resultado Operador L�gico NOT");
		if (! (x == 10)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//Cierre del else
		
		
		//Estructura if-else anidado o concatenado
		System.out.println("Estructura IF-ELSE ANIDADO");
		int dia = 5;
		
		if(dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miercoles");
		}else if(dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de d�a");
		}
		
		//ESTRUCTURA DE DECISI�N SWITCH CASE
		System.out.println("Estructura switch");
		 switch (dia) {
		 case 1:
		 	System.out.println("Lunes");
		 	break;
		 case 2:
			 	System.out.println("Martes");
			 	break;
		 case 3:
			 	System.out.println("Miercoles");
			 	break;
		 case 4:
			 	System.out.println("Jueves");
			 	break;
		 case 5:
			 	System.out.println("Viernes");
			 	break;
		 default:
			 System.out.println("Error de d�a");
			 break;
		 }
		
		
	}//Cierre del main

}
