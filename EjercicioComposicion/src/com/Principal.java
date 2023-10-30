package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejercicio - Crear un objeto de composición 
		//Un objeto grande, que tenga como atributos por los menos 
		//otros 3 objetos en el 
		
		Neumatico llanta = new Neumatico("Bridgestone", "225/40R18", "AA");
		Rin rin = new Rin("AM Wheels", 18, 8, "Gris");
		Motor motor = new Motor("Gasolina", "Eléctrico", 6);
		Estereo sonido = new Estereo("Pioneer", "Negro");
		
		Carro jetta = new Carro("Volkswagen", 2010, "$120,000", "Negro", llanta, rin, motor, sonido);
		
		System.out.println(jetta);

	}

}
