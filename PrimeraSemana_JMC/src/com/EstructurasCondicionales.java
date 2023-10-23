package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		
		int x = 9;
		
		
		if(x<10) {//si esto es verdad 
		System.out.println("si");	//ejecuta esto
		
		}
		else {
	      System.out.println("no");
			
		}
		
		//OPERADORES LOGICOS
		//AND, OR , NOT , DIFERENTE DE, IGUALDAD
		// AND = &&, Devuelve el valor true cuando se cumplan 
		//todas las condiciones 
		System.out.println("el resultado del operador Y");
		if(x<11 && x>8) {
			System.out.println("si");
			
		}else {
			
			System.out.println("no");
		}
	   
	//Or = ||, Devolver el varo true cuando cumpla algunos de los condicionantes   
		System.out.println("el resultado del operador O");
		if(x<10 || x>10) {
			System.out.println("si");
			
		}else {
			
			System.out.println("no");
		}
	//Diferente de = !=, compara los valores y devulve true si los valores son diferentes 
		System.out.println("el resultado del operador diferente de");
		if(x != 10) {
			System.out.println("si");
			
		}else {
			
			System.out.println("no");
		}
		
		
		
		System.out.println("el resultado del operador igual a");
		if(x == 20) {
			System.out.println("si");
			
		}else {
			
			System.out.println("no");
		}
		
		
		System.out.println("el resultado del operador igual not");
		//niega una condicion o mas bien , cambia el valor de true  a false y viceversa
		if(!(x == 9)) {
			System.out.println("si");
			
		}else {
			
			System.out.println("no");
		}
		
		
		
		//Estructura if- else  anidadoo o concatenado
	//	System.out.println("Estructura IF- ");
		int dia = 7 ;
		
//		if (dia==1 ) {
//			System.out.println("Lunes ");
//			
//		}if (dia==2) {
//			
//			System.out.println("martes ");
//				
//	   }if (dia==3) {
//			
//			System.out.println("miercoles ");
//		
//	   }if (dia==4) {
//		
//		System.out.println("Jueves");
//
//       }if (dia==5) {
//	
//	System.out.println("Viernes");
//
//	
//	}if (dia==6) {
//		
//		System.out.println("sabado");
//}
	
		//Estructura de desicion swicht
		
		System.out.println("Resultado del Switch");
		switch (dia) {
		case 1:
			System.out.println("el dia es lunes");
			break;
		case 2:
			System.out.println("el dia es Martes");
			break;
		case 3:
			System.out.println("el dia es Miercoles");
			break;
		case 4:
			System.out.println("el dia es Jueves");
			break;
		case 5:
			System.out.println("el dia es Viernes");
			break;
		case 6:
			System.out.println("el dia es sabado");
			break;
		case 7:
			System.out.println("el dia es Domingo");
			break;
		default:
			break;
		}
		
		
		
	}
	
}