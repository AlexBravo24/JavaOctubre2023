package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		
//		if(x<11 && x>8 || x==9) {
//			System.out.println("Si");
//			
//		}else {
//			System.out.println("No");
//		}
         
		System.out.println("Resultado Operdor logico Igualdad");
		if(x == 10) {
			System.out.println("SI");
			
		}else {
			System.out.println("No");
		}
		
		System.out.println("Estructura IF-ELSE-ANIDADO");
		int dia = 5;
		
//		if(dia==1) {
//			System.out.println("Lunes");
//		}else if(dia == 2){
//			System.out.println("Martes");	
//		}else if(dia == 3) {
//			System.out.println("Mieroles");
//		}else if(dia == 4) {
//			System.out.println("Jueves");
//		}else if(dia == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("es fin de semana");
//		}
		//Estructuta de decision SWITCH-CASE
		
		switch(dia) {
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
		case 6:
			System.out.println("Es fin de semana");
			break;
		}
	}

}
