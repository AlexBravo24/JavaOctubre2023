package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		//Puedo crear un objeto persona
		//Polimorfismo dinamico o de asignacion
		Persona persona1 = new Empleado();
		
		
		
		System.out.println(persona1);
		
		//Crear o instanciar un empleado
		//Estamos heredando atributos de métodos de la clase PADRE (persona)
		//y podemos hacer uso de ellos para crear un nuevo empleado
		
		Empleado desarrollador = new Empleado();
		
		desarrollador.setNombre("Abraham");
		desarrollador.setEdad(25);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("ABRH1234");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("Java Developer Backend");
		
		System.out.println(desarrollador);
		
		//probar metodo o comportamiento propio de la clase persona llamado comer
		persona1.comer();
		
		//Probar nuevamente el metodo comer y veremos que este ya posee 2 formas
		persona1.comer("Tacos");
		
		//estos metodos tambien son heredados a las subclases o clases hija si es que las hay
		
		desarrollador.comer("sushi");
		
		desarrollador.comer(3, "tacos");
		
		persona1.caminar(); //Equivalente a escribir un String que diga estoy caminando
		System.out.println(persona1.caminar());

		
		//De igual forma podemos volverlo polimorfico
		System.out.println(persona1.caminar("en el centro"));
		
		desarrollador.dormir();
		
		
	}

}
