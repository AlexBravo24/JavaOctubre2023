package com.condicionales;

import java.util.Scanner;

public class Condicionales14_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		 int horasTrabajadas;
	        int salarioSemanal;

	        System.out.println("Introduce las horas trabajadas esta semana: ");
	        horasTrabajadas = entrada.nextInt();

                if (horasTrabajadas > 40) {
	        
	            salarioSemanal = 40 * 16 + (horasTrabajadas - 40) * 20;
	        } else {
	        
	            salarioSemanal = horasTrabajadas * 16;
	        }

	        
	        System.out.println("El salario semanal del obrero es: $" + salarioSemanal);

	}

}
