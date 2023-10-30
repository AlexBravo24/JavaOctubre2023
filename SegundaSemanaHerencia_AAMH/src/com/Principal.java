package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona
		
		//Polimorfismo dinamico o de asignaci�n
		Persona personal = new Empleado();
		
		
		System.out.println(personal);
		
		//Crear o iniciar un empleado
		//Estamos heredando atributos y m�todos de la clase PADRE (Persona)
		//Y podemos hacer uso de ellos para crear un nuevo empleado
	
		Empleado desarrollador = new Empleado();
		
		desarrollador.setNombre("Abraham Mej�a");
		desarrollador.setEdad(45);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("MEHA781018I7A");
		desarrollador.setSalario(65000);
		desarrollador.setCargo("Java Developer Backend");
		
		System.out.println(desarrollador); 
		
		//Instanciar a un nuevo estudiante
		
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Emmanuel");
		estudiante.setEdad(23);;
		estudiante.setGenero("Masculino");
		estudiante.setCarrera("Ing. Mecatr�nica");
		estudiante.setGrado("Finalizado");
		estudiante.setMatricula(786342);
		estudiante.setEscuela("Tecnologico de Cuatla");
		
		System.out.println(estudiante);
		
		//Ejemplo de ejercicio de Herencia
		
		//Animal - nombre, especie, tipo (Padre)
		//Perro - raza, edad, color, (hija)
		
		//Probar el m�todo o comportamiento propio de la clase persona
		//llamado comer()
		
		personal.comer();
		
		
		//Probar nuevamente el m�todo comer y veremos que este ya posee
		//dos formas. Uno pide un argumento String y otro no.
		
		personal.comer("pizza");
		
		//Estos m�todos tambipen son heredados a las subclases o clases
		//hija, si es que las hay
		
		desarrollador.comer("sushi");
				
		desarrollador.comer(3, "tacos");
		
		//Probando el m�todo con retorno caminar ()
		personal.caminar(); //"Estoy caminando..."
		System.out.println(personal.caminar()); //Syso ("Estoy caminando...");
		
		//De igual forma podemos volverlo polimorfico
		System.out.println(personal.caminar("en el centro"));
		
		//Probando el m�todo abstracto que la clase Empleado ya definio
		desarrollador.dormir();
		
		//Probando el m�todo abstracto que la clase Estudiante ya definio
		estudiante.dormir();
		
	}

}
