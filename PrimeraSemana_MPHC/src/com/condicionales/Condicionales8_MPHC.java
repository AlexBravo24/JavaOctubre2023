package com.condicionales;

import java.util.Scanner;

public class Condicionales8_MPHC {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa el resultado del dado (un número del 1 al 6): ");
	        int resultadoDado = scanner.nextInt();

	        String caraOpuesta;

	        switch (resultadoDado) {
	            case 1:
	                caraOpuesta = "Seis";
	                break;
	            case 2:
	                caraOpuesta = "Cinco";
	                break;
	            case 3:
	                caraOpuesta = "Cuatro";
	                break;
	            case 4:
	                caraOpuesta = "Tres";
	                break;
	            case 5:
	                caraOpuesta = "Dos";
	                break;
	            case 6:
	                caraOpuesta = "Uno";
	                break;
	            default:
	                caraOpuesta = "ERROR: número incorrecto";
	                break;
	        }

	        System.out.println("Cara opuesta del dado: " + caraOpuesta);

	}

}
