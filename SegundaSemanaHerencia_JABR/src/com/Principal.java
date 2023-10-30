package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona
		
		//Polimorfismo dinamico o de asignacion
		Persona persona1 = new Empleado();
		
		
		System.out.println(persona1);
		
		//Crear o instanciar un empleado
		//Estamos heredando atributos y métodos de la clase PADRE (Persona)
		//Y podemos hacer uso de ellos para crear un nuevo empleado
		
		Empleado desarrollador = new Empleado();
		
		desarrollador.setNombre("Abraham");
		desarrollador.setEdad(25);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("ABRH00HJDA");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("Java Developer Backend");
		
		System.out.println(desarrollador);
		
		//Instanciar a un nuevo estudiante
		
		Estudiante estudiante1 = new Estudiante();
		
		estudiante1.setNombre("Emmanuel");
		estudiante1.setEdad(23);
		estudiante1.setGenero("Masculino");
		estudiante1.setCarrera("Ing. Mecatrónica");
		estudiante1.setGrado("FINALIZADO");
		estudiante1.setMatricula(786512);
		estudiante1.setEscuela("Tecnológico de Cuautla");
		
		System.out.println(estudiante1);
		
		//Probar el método o comportamiento propio de la clase Persona
		//llamado comer()
		
		persona1.comer();
		
		//Probar nuevamente el método comer y veremos que este ya posee
		//dos formas. Uno pide un argumento String y otro no
		persona1.comer("pizza");
		
		//Estos métodos también son heredados a las subclases o clases
		//hija, si es que las hay
		estudiante1.comer("sushi");
		
		//Probando el método con retorno caminar()
		persona1.caminar(); //"Estoy caminando..."
		System.out.println(persona1.caminar()); //Syso("Estoy caminando...");
		
		//De igual forma podemos volverlo polimorfico
		System.out.println(persona1.caminar("en el centro"));
		
		//Probando el método abstracto que la clase Empleado ya definio
		desarrollador.dormir();
		
		//Probando el método abstracto que la clase Estudiante ya definio
		estudiante1.dormir();
	
	}

}
