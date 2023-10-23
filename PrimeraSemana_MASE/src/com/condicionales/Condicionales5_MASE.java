package com.condicionales;

import java.util.Scanner;

public class Condicionales5_MASE {
	public static void main(String[] args) {
		
		//
		
		 Scanner scanner = new Scanner(System.in);
		    int nota;
		    int edad;
		    String sexo;
		
		    System.out.print("Edad: ");
		    edad = scanner.nextInt();
		    System.out.print("Nota: ");
		    nota = scanner.nextInt(); 
		    scanner.nextLine();
		    System.out.print("Sexo (M o F): ");
		    sexo = scanner.nextLine();
		
		    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		        System.out.println("El valor de sexo introducido es incorrecto.\n"
		            + "por favor, reenvíe el formulario.");
		      } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		        System.out.println("POSIBLE");
		      }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		         System.out.println("ACEPTADA");
		      }else {
		          System.out.println("NO ACEPTADA");
		      }
	}

}
