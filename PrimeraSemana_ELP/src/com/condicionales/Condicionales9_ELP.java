package com.condicionales;

import java.util.Scanner;

public class Condicionales9_ELP {

	public static void main(String[] args) {

//		9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
//		introducimos otro número nos da un error.

	
		Scanner leer = new Scanner(System.in);
		
		 int dia;
		
		 System.out.println("****************Seleccione el dia: ************************** ");
		 System.out.println("Lunes: 1, Martes: 2, Miercoles: 3, Jueves: 4, Viernes: 5, Sabado: 6, Domingo: 7");
		 dia = leer.nextInt();
		 
		  switch (dia) {
		    case 1:
		      System.out.println("El día seleccionado es Lunes");
		      break;
		    case 2:
		      System.out.println("El día seleccionado es Martes");
		      break;
		    case 3:
		      System.out.println("El día seleccionado es Miercoles");
		      break;
		    case 4:
		      System.out.println("El día seleccionado es Jueves");
		      break;
		    case 5:
		      System.out.println("El día seleccionado es Viernes");
		      break;
		    case 6:
		      System.out.println("El día seleccionado es Sabado");
		      break;
		    case 7:
		      System.out.println("El día seleccionado es Domingo");
		      break;
		    default:
		      System.out.println("ERROR: El numero no existe.");
		    }
		  }
		}		
	