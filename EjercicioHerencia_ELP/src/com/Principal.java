package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de ejercicio de Herencia
		
		//Animal - nombre, especie, tipo (Padre)
		//Perro - raza, edad, color (Hija)
		//Nuevo proyecto - EjercicioHerencia_ELP
	
		
		//Puedo crear un objeto Animal
		
		Animal ave = new Animal("Colibrí", "Volador", "tipo1");
		
		System.out.println(ave);
		

		//Crear o instanciar un Perro
		//Estamos heredando atributos y métodos de la clase PADRE (Animal)
		//Y podemos hacer uso de ellos para crear un nuevo Perro
		
		
		//Perro domestico = new Perro("Firulais", "Perro", "tipo2", "Pitbull", 5, "Café");
		
		Perro domestico2 = new Perro();
		
		domestico2.setColor("Amarillo");
		domestico2.setEdad(7);
		domestico2.setRaza("chihuahua");
		
		System.out.println(domestico2);
		
	}

}
