package com;

import java.awt.Color;
import java.awt.Font;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras condicionales o de decision
		// if - Evaluan valores booleanos

		int x = 10;
		System.out.println("Resultado del operador MENOR QUE");
		if (x < 11) { // Di esto es verdad- ejecutar next line

			System.out.println("SI");

		} else { // De otro modo ejecuta the next line
			System.out.println("NO");
		}

		// OPERADORES LOGICOS
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD

		// Condiciones compuestas
		// AND - && - devuelve el valor true cuando se ccumplen todas las codiciones

		// Operadro AND
		System.out.println("Resultado del operador AND");
		if (x < 11 && x > 8 && x == 9) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}
		// Operado OR
		System.out.println("Resultado del operador OR");

		if (x < 11 || x > 8 || x == 9) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}

		// OR -|| - Devolver el valor true cuando se cumpla al menos una de las
		// condiciones

		// Operador logico DIFERENTE DE
		System.out.println("Resultado del operador logico DIFERENTE DE");

		if (x != 20) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}
		// Operador logico de igualdad
		System.out.println("Resultado del operador logico IGUALDAD");

		if (x == 20) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}

		// NOT - Niega una condicion o mas bien, cambia el valord de true a false y
		// viceversa

		System.out.println("Resultado del operador logico NOT");

		if (!(x == 10)) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}

		// estructura if-else anidado o concatenado

		System.out.println("Estructura if-else anidado");

		int dia = 5;

		if (dia == 1) {
			System.out.println("Lunes");

		} else if (dia == 2) {

			System.out.println("Martes");

		} else if (dia == 3) {
			System.out.println("Miercoles");

		} else if (dia == 4) {
			System.out.println("Jueves");

		} else if (dia == 5) {
			System.out.println("Viernes");

		}else {
			System.out.println("Error de dia");
		}
		// ESTRUCTURA DE DECISION SWITCH-CASE
		
		System.out.println("ESTRUCTURA DE DECISION SWITCH-CASE");
		
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

	}// Llave main

}// Llave class
