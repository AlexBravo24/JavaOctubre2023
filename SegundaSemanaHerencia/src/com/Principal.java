package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona 
		
		//Polimorfismo dinámico o de asignación 
		Persona persona1 = new Empleado();
		
		System.out.println(persona1);
		
		//Crear o instanciar un empleado 
		//Estamos heredando atributos y métodos de la clase PADRE (Persona)
		//Y podemos hacer uso de ellos para crear un nuevo empleado
		
		Empleado desarrollador = new Empleado();
		
		desarrollador.setNombre("Gerardo");
		desarrollador.setEdad(23);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("VIAG001003JS9");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("Java Developer Backend");
		
		System.out.println(desarrollador);
		
		//Instanciar un nuevo estudiante
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Emmanuel");
		estudiante1.setEdad(23);
		estudiante1.setGenero("Masculino");
		estudiante1.setCarrera("Ing. Mecatrónica");
		estudiante1.setGrado("FINALIZADO");
		estudiante1.setMatricula(7853204);
		estudiante1.setEscuela("Tecnológico de Cuautla");
		
		System.out.println(estudiante1);
		
		//Probar el método o comportamiento propio de la clase Persona
		//llamado comer()
		
		persona1.comer();
		
		//Probar nuevamente el método comer y veremos que este ya posee
		//dos formas.Uno pide un argumento de tipo String y otro no
		
		persona1.comer("chilaquiles");
		
		//Estos métodos también son heredados a las subclases o clases
		//hijas, si es que las hay
		
		estudiante1.comer(1, "orden de alitas");
		
		//Probando el método con retorno caminar()
		persona1.caminar(); //"Estoy caminando..."
		System.out.println(persona1.caminar()); //Syso("Estoy caminando...";
		
		//De igual forma podemos volverlo polimorfico
		System.out.println(persona1.caminar("en el campo"));
		
		//Probando el método abstracto que la clase Empleado ya definió
		desarrollador.dormir();
		
		//Por otro lado, pobrando el método abstracto que la clase Estudiante ya definió
		estudiante1.dormir();
	}

}
