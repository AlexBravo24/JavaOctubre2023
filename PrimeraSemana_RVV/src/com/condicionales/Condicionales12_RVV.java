package com.condicionales;

import java.util.Scanner;

public class Condicionales12_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa la altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        String estado = obtenerEstadoIMC(imc);

        System.out.println("Tu IMC es: " + imc);
        System.out.println("Estado: " + estado);
    }

    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            return -1; // Devuelve -1 si la altura es no válida
        }
        return peso / (altura * altura);
    }

    public static String obtenerEstadoIMC(double imc) {
        if (imc < 0) {
            return "ERROR: Altura no válida";
        }else if (imc < 16.5) {
            return "ingreso en hospital";
        }else if (imc < 17.5) {
            return "infrapeso"; 
        }else if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidad (Grado 1)";
        } else if (imc < 39.9) {
            return "Obesidad (Grado 2)";
        } else {
            return "Obesidad (Grado 3)";
        }
	
        }
    
}

