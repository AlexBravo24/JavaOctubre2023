package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras Condicionales o de decisión
		//If - Evaluan valores booleanos
		
		int x = 10;
		
		if (x<10) { // Si (esto es verdad) { ejecuta lo siguiente
			System.out.println("Sí");
		}else { //De otro modo, ejecuta lo siguiente
			System.out.println("No");
		}
		
		//OPERADORES LÓGICOS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//AND - && - Devuelve el valor true cuando se cumplen
		//TODAS las condiciones
		System.out.println("Resultado Operador lógico AND");
		if (x<11 && x>8 && x==9) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}//cierre del else
		
		
		//OR - || - Devolver el valor true cuando se cumpla al menos
		//UNA de las condiciones
		System.out.println("Resultado Operador lógico OR");
		if (x<10 || x>8 || x==9) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}//cierre del else
		
		
		//DIFERENTE DE - != - Compara los valores y devuelve true
		//si estos valores son diferentes
		
		System.out.println("Resultado Operador lógico DIFERENTE DE");
		if (x != 20) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}//cierre del else
	
		
		//IGUALDAD o comparación - == - Compara si los valores son iguales
		//y devuelve true cuando esto se cumple
		
		//UN SOLO IGUAL (=) significa ASIGNACIÓN
		// int x = 10; (Aqui asigno o guardo el valor 10 en mi variable entera)
		
		System.out.println("Resultado Operador lógico IGUALDAD");
		if (x == 10) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}//cierre del else
		
		
		//NOT - ! - Niega una condición o más bien, cambia el valor de true
		//a false y viceversa
		
		System.out.println("Resultado Operador lógico NOT");
		if (! (x == 10)) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}//cierre del else
		
		
		
		//Estructura if-else anidado o concatenado
		
		System.out.println("Estructura IF-ELSE ANIDADO");
		
		int dia = 5;
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de día");
		}
		
		
		//ESTRUCTURA DE DECISIÓN SWITCH-CASE
		
		System.out.println("Estructura SWITCH-CASE");
		
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
			System.out.println("Error de día");
			break;
		}
		
	}//Cierre del main

}//Cierre de la clase
