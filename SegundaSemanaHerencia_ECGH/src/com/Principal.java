package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Persona persona1=new Persona("Elias", 26, "Masculino");
		
		//Polimorfismo dinamico o de asignacion 
		Persona persona1=new Empleado();
		
		
		
		
		System.out.println(persona1);
		
		//Crear o instanciar un empleado
		
		Empleado desarrollador=new Empleado();
		
		desarrollador.setNombre("Abraham");
		desarrollador.setEdad(25);
		desarrollador.setGenero("Mascúlino");
		desarrollador.setRfc("ABRAHAM00");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("Java developer Backend");
		
		System.out.println(desarrollador);
		
		Estudiante estudiante1=new Estudiante();
		
		estudiante1.setNombre("Emmanuel");
		estudiante1.setEdad(23);
		estudiante1.setGenero("Mascúlino");
		estudiante1.setCarrera("Ing. Mecatrónica");
		estudiante1.setGrado("Finalizado");
		estudiante1.setEscuela("Tecnológico de Cuautla");
		
		System.out.println(estudiante1);
		
		//Probar el método o comportamiento propio de la clase Persona 
		//llamado comer
		
		persona1.comer();
		
		//Probar nuevamenre el método comer y veremos que este ya posee
		//dos formas. Uno pide un argumento String y el otro no
		
		persona1.comer("pizza de queso");
		
		estudiante1.comer("Sushi");//las clases hijas heredan los métodos 
		
		desarrollador.comer(3, "tacos");
		
		//Probando el método con retorno caminar()
		persona1.caminar();//Estoy caminando...
		System.out.println(persona1.caminar());//Syso("Estoy caminando")
		
		//De igual fora podems volverlo polimorfico
		System.out.println(persona1.caminar("en el centro"));
		
		//Probando el método abstracto qee la clase Empledo ya definió
		desarrollador.dormir();
		
		//Probando el método abstracto qee la clase Estudiante ya definió
		estudiante1.dormir();
		
		persona1.dormir();
		
		
		
		
	}

}
