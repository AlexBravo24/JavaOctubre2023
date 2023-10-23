package com;

import java.util.Scanner;

public class EstructurasCondicionales {
	
	public static void main(String[] args) {
		
		//Estructuras Condicionales o de desición
		//If - Evaluan valores booleanos
		
		int x = 10;
		System.out.println("Resultado IF ELSE");
		if (x<10) {// si esto es verdad ejecuta lo siguiente
			System.out.println("Sí");
		}
		else {//si no ejecuta esto
			System.out.println("No");
		}
		
		//OPERADORES LÓGICOS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//CONDICIONES COMPUESTAS
		//AND - && - Devuelve el valor  true cuando se cumplen
		//todas las condiciones
		System.out.println("Resultado operador logico AND");
		if(x<11 && x>8 && x==9) {
			System.out.println("Sí");
		}
		else {
			System.out.println("No");
		}
		
		//OR - || - Devolver el valor True cuando se cumpla al menos una de las condiciones
		System.out.println("Resultado operador logico OR");
		if(x<11 || x>8 || x==9) {
			System.out.println("Sí");
		}
		else {
			System.out.println("No");
		}
		
		//DIFERENTE DE - != - Compara los valores y devuelve true si estos valores son diferentes
		System.out.println("Resultado operador logico DIFERENTE DE 20");
		if(x!= 20) {
			System.out.println("Sí");
		}
		else {
			System.out.println("No");
		}
		
		//IGUALDAD o Compraración - == - compara que los valores sean iguales
		// Un solo simbolo = significa asignación es decir a una variable de tipo entero le asignare un valor de, mientras que
		// para comparar valores es con el ==
		System.out.println("Resultado operador logico IGUAL A 10");
		if(x == 10) {
			System.out.println("Sí");
		}
		else {
			System.out.println("No");
		}
		//NOT - ! - Niega una condición o más bien, cambia el valor de true a false y viceversa
		System.out.println("Resultado operador logico NOT");
		if (! (x == 10)) {
			System.out.println("Sí");
		}
		else {
			System.out.println("No");
		}
		
		
		
		
		
		//Estructura if-else anidado o concatenado
		
		int dia = 5;
			System.out.println("Estructura If-Else anidado");
		if (dia ==1) {
			System.out.println("Lunes");
		}else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia ==3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de dia");
		}
		
		//ESTRUCTURA DE DESICIÓN SWITCH-CASE
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
			System.out.println("Error de dia");
			break;
		}
		
	}

}
