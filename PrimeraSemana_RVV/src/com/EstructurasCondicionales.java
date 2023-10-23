package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras condicionales o de decision
		//IF - Evaluan valores booleanos
		
		int x = 10;
		
		if (x<10) {//si esto es verdad, ejecuta lo siguiente
			System.out.println("si");
		}else { // de otro modo ejecuta lo siguiente
			System.out.println("no");
		}
		
		//operadores logicos
		//and, or, nor, diferente de, igualda
		
		//Condiciones compuestas
		//AND - && - Devuelve el valor true cuando se cumplen
		//todas las condiciones
		System.out.println("resultado operador logico AND");
		
		if (x<11 && x>8 && x==9) {
			System.out.println("si");
		}else {
		System.out.println("no se cumplen los requisitos");
		}
		
		
		//OR - || - devolver el valor true cuando se cumpla al menos
		// una de las condiciones
		System.out.println("resultado operador logico OR");
		if (x<10 || x>8 || x==9) {
			System.out.println("si");
		}else {
		System.out.println("no se cumplen los requisitos");
		}
		
		//Diferente de -!= - compara los valores y devuelve true
		//si estos valores son diferentes
		System.out.println("resultado operador logico DIFERENTE DE");
		if (x!=20) {
			System.out.println("si");
		}else {
		System.out.println("no se cumplen los requisitos");
		}
		
		//IGUALDAD O comparacion - == - compara si los valores son iguales
		//y devuelve true si esto se cumple
		
		//un solo igual (=)significa ASIGNACION
		//Para comparar valores es con doble igual (==)
		System.out.println("resultado operador logico IGUALDAD");
		if (x==10) {
			System.out.println("si");
		}else {
		System.out.println("no se cumplen los requisitos");
		}
		
		//NOT - ! - niega una condicion o mas bien cambia el valor de true
		//a false y viceversa
		
		System.out.println("resultado operador logico NOT");
		if (!(x==10)) {
			System.out.println("si");
		}else {
		System.out.println("no se cumplen los requisitos");
		}
		
		
		//Estructura if- else anidado o concatenado
		System.out.println("EStructura if-else Anidado");
		int dia = 5;
		
		if (dia == 1) {
			System.out.println("lunes");
		}else if (dia == 2) {
			System.out.println("martes");
		}else if (dia == 3) {
			System.out.println("miercoles");
		}else if (dia==4) {
			System.out.println("jueves");
		}else if (dia==5) {
			System.out.println("viernes");
		}else {
			System.out.println("!fin de semana¡");
		}
		
		//Estructura de decision SWITCH-CASE
		System.out.println("estructura switch-case");
		
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;

		default:
			System.out.println("fin de semana");
			break;
		}
		
}}
