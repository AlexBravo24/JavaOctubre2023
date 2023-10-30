package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejercicio de HERENCIA - Animales
		
		Animal jirafa = new Animal("Terrestre", "Vertebrado", "Herv�boro");
		System.out.println(jirafa);
		
		//Crear o instanciar un perro
		
		Perro perro1 = new Perro("Terrestre", "Vertebrado", "Carnivoro", "Simba", "Salchicha", 15.0, 3, "Caf�");
		
		System.out.println(perro1);
		
		//Crear o instanciar un tiburon
		
		Tiburon tiburon1 = new Tiburon();
		tiburon1.setAlimentacion("Carnivoro");
		tiburon1.setAnatomia("Vertebrado");
		tiburon1.setHabitat("Acuatico");
		tiburon1.setColor("Blanco y gris");
		tiburon1.setPeso(700.00);
		tiburon1.setTipo("Tibur�n blanco");
		
		System.out.println(tiburon1);
		
		//Crear o instanciar un aguila
		
		Aguila aguila1 = new Aguila();
		aguila1.setAlimentacion("Carnivoro");
		aguila1.setAnatomia("Vertebrado");
		aguila1.setHabitat("A�reo");
		aguila1.setColor("Caf� y blanco");
		aguila1.setPeso("5.7 kg");
		aguila1.setGenero("Masculino");
		aguila1.setTipo("�guila real");

		System.out.println(aguila1);
	} 

}
