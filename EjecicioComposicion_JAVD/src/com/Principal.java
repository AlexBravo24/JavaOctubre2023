package com;

public class Principal {

	public static void main(String[] args) {
		
		// Ejercicio - Crear un objeto de composicion
		//Un objeto grande, que tenga como atributos por lo menos
		//otros 3 objetos en el
		
		Llanta dunlop = new Llanta("DUNLOP", 180, 17);
		Motor motor1800 = new Motor("Dos tiempos", 1800, 6);
		Dimensiones tamaño = new Dimensiones(2.575, 0.945, 1.450);
		
		Moto goldwing = new Moto("Gold Wing","Honda", "Gris", "Manual", "Turismo", dunlop, motor1800, tamaño);
		
		System.out.println(goldwing);

	}

}
