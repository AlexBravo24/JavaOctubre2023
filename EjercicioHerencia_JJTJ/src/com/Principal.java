package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona
		
		Animal animal1 = new Animal("Benji", "Canis lupus familiaris", "peque�o");
		
		System.out.println(animal1);
		
		//Crear o instanciar un perro
		
		Perro Canino = new Perro();
		
		Canino.setNombre("Benji");
		Canino.setEspecie("Canis lupus familiaris");
		Canino.setTipo("peque�o");		
		Canino.setRaza("Chihuahua");
		Canino.setEdad(2);
		Canino.setColor("Blanco");
		
		System.out.println(Canino);
		
		//Instanciar a un nuevo Gato
		
		Gato Felino = new Gato();
		Felino.setNombre("Garfield");
		Felino.setEspecie("Felis silvestris lybica");
		Felino.setTipo("azul intenso");
		Felino.setTama�o("esbelto");
		Felino.setVisi�n("nocturna");
		Felino.setRaza("Siam�s");
		Felino.setDomesticaci�n(10000);
		
		System.out.println(Felino);

	}

}