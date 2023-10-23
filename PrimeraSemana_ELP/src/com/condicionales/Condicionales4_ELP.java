package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ELP {

	public static void main(String[] args) {
//		4. Realiza un programa que lea una cadena
//		por teclado y compruebe si es una
//		letra mayúscula.	

		Scanner leer = new Scanner(System.in);
		
		String texto;
		char caracter;
		
		System.out.print("Ingresa el texto: ");
        texto = leer.nextLine();
		
        if (texto.length() == 7) {
            caracter = texto.charAt(0);
            
            if (Character.isUpperCase(caracter)) {
                System.out.println("La primer letra es mayúscula.");
            } else {
                System.out.println("La primer letra es minuscula.");
            }
        } else {
            System.out.println("Por favor, ingresa sel texto.");
        }
        }

	}
	