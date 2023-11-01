package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona
		
		Animal animal1 = new Animal("Benji", "Canis lupus familiaris", "pequeño");
		
		System.out.println(animal1);
		
		//Crear o instanciar un perro
		
		Perro Canino = new Perro();
		
		Canino.setNombre("Benji");
		Canino.setEspecie("Canis lupus familiaris");
		Canino.setTipo("pequeño");		
		Canino.setRaza("Chihuahua");
		Canino.setEdad(2);
		Canino.setColor("Blanco");
		
		System.out.println(Canino);
		
		//Instanciar a un nuevo Gato
		
		Gato Felino = new Gato();
		Felino.setNombre("Garfield");
		Felino.setEspecie("Felis silvestris lybica");
		Felino.setTipo("azul intenso");
		Felino.setTamaño("esbelto");
		Felino.setVisión("nocturna");
		Felino.setRaza("Siamés");
		Felino.setDomesticación(10000);
		
		System.out.println(Felino);

	}

}