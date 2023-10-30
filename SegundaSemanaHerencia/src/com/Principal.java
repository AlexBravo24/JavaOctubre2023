package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona 
		
		//Polimorfismo din�mico o de asignaci�n 
		Persona persona1 = new Empleado();
		
		System.out.println(persona1);
		
		//Crear o instanciar un empleado 
		//Estamos heredando atributos y m�todos de la clase PADRE (Persona)
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
		estudiante1.setCarrera("Ing. Mecatr�nica");
		estudiante1.setGrado("FINALIZADO");
		estudiante1.setMatricula(7853204);
		estudiante1.setEscuela("Tecnol�gico de Cuautla");
		
		System.out.println(estudiante1);
		
		//Probar el m�todo o comportamiento propio de la clase Persona
		//llamado comer()
		
		persona1.comer();
		
		//Probar nuevamente el m�todo comer y veremos que este ya posee
		//dos formas.Uno pide un argumento de tipo String y otro no
		
		persona1.comer("chilaquiles");
		
		//Estos m�todos tambi�n son heredados a las subclases o clases
		//hijas, si es que las hay
		
		estudiante1.comer(1, "orden de alitas");
		
		//Probando el m�todo con retorno caminar()
		persona1.caminar(); //"Estoy caminando..."
		System.out.println(persona1.caminar()); //Syso("Estoy caminando...";
		
		//De igual forma podemos volverlo polimorfico
		System.out.println(persona1.caminar("en el campo"));
		
		//Probando el m�todo abstracto que la clase Empleado ya defini�
		desarrollador.dormir();
		
		//Por otro lado, pobrando el m�todo abstracto que la clase Estudiante ya defini�
		estudiante1.dormir();
	}

}
