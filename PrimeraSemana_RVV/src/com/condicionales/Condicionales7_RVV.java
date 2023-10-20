package com.condicionales;

import java.util.Scanner;

public class Condicionales7_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        double costoAlumno = calcularCostoAlumno(cantidadAlumnos);
        double costoCompania = calcularCostoCompania(cantidadAlumnos);

        System.out.println("Costo por alumno: " + costoAlumno + " euros");
        System.out.println("Pago a la compañía de autobuses: " + costoCompania + " euros");
    }

    public static double calcularCostoAlumno(int cantidadAlumnos) {
        if (cantidadAlumnos >= 100) {
            return 65.0;
        } else if (cantidadAlumnos >= 50) {
            return 70.0;
        } else if (cantidadAlumnos >= 30) {
            return 95.0;
        } else {
            return 4000.0 / cantidadAlumnos;
        }
    }

    public static double calcularCostoCompania(int cantidadAlumnos) {
        return cantidadAlumnos * calcularCostoAlumno(cantidadAlumnos);

	}

}
