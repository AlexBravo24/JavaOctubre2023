package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JRMM {

	public static void main(String[] args) {

		// .Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado
		// el ancho y el alto. Ejemplo: 8 x 8
		Scanner entrada = new Scanner(System.in);
		int l1, l2;

		System.out.print("Ingrese el lado 1: ");
		l2 = entrada.nextInt();

		System.out.print("Ingrese el lado 2: ");
		l1 = entrada.nextInt();

		for (int i = 1; i <= l2; i++) {
			for (int u = 1; u <= l1; u++) {

				{
					System.out.print("* ");
				}

			}
			System.out.println();
		}
	}

}
