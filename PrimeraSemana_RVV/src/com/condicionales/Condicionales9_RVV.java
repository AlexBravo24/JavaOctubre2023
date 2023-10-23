package com.condicionales;

import java.util.Scanner;

public class Condicionales9_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un n�mero del 1 al 7: ");
        int numeroDia = scanner.nextInt();

        String nombreDia = Dia(numeroDia);

        if (nombreDia != null) {
            System.out.println("El d�a es " + nombreDia);
        } else {
            System.out.println("ERROR: n�mero incorrecto");
        }
    }

    public static String Dia(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Mi�rcoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "S�bado";
            case 7:
                return "Domingo";
            default:
                return null;
        }
	}

}
