package com.condicionales;

import java.util.Scanner;

public class Condicionales8_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el resultado del dado (1-6): ");
        int resultadoDado = scanner.nextInt();

        String Opuesta = obtenerCaraOpuesta(resultadoDado);

        if (Opuesta != null) {
            System.out.println("La cara opuesta al resultado " + resultadoDado + " es " + Opuesta);
        } else {
            System.out.println("ERROR: número incorrecto");
        }
    }

    public static String obtenerCaraOpuesta(int resultadoDado) {
        switch (resultadoDado) {
            case 1:
                return "6";
            case 2:
                return "5";
            case 3:
                return "4";
            case 4:
                return "3";
            case 5:
                return "2";
            case 6:
                return "1";
            default:
                return null;
        }
	}

}
