package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		

		
	int x =10;
	
	if(x<10) {
		System.out.println("Sì");
		}
		
	else {
		System.out.println("No");
		
		//Operadores Logicos
		// AND, OR, NOT DIFERENTE DE IGUALDAD
		//condiciones compuestas
		// AND - && - devuelve el valor true cuando se cumplen todas las condiciones 
		
		if(x<10 && x>8 && x==9) {
			System.out.println("Sì");
		}else {
			System.out.println("No");
		}
		// OR - || devuelve el valor true cuando se cumpla al menos una de las condiciones
		
		if(x<10 || x>8 || x==9) {
			System.out.println("Sì");
		}else {
			System.out.println("No");
		}
		//DIFERENTE DE - != COMPARA los valores y devuelve true si estos valores son diferentes
		
		System.out.println("Resultado Operador logico diferente de: ");
		if(x!=20){
			System.out.println("Sì");
		}else {
			System.out.println("No");
		}
		
		//Igualdad o comparacion == compara si los valores son iguales
		
		
		System.out.println("Resultado Operador logico igual de Igualdad: ");
		if(x==10){
			System.out.println("Sì");
		}else {
			System.out.println("No");
		}
		
		// NOT -!- niega una ondicion y cambia de true a false
		
		System.out.println("Resultado Operador logico NOT: ");
		if(!(x==10)){
			System.out.println("Sì");
		}else {
			System.out.println("No");
		}
		
		// Estructura if else anidando o concatenando
		
		int dia  = 5;
//		 if(dia==1) {
//		 System.out.println("Lunes");
//		 
//		 }else if(dia==2) {
//		 System.out.println("Martes");
//		 
//		 }else if(dia==3) {
//		 System.out.println("Miercoles");
//			 
//		 }else if(dia==4) {
//			 System.out.println("Jueves");
//			 
//		 }else if(dia==5) {
//			 System.out.println("Viernes");
//		}
	//Estructura de decision 
		
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
	}
