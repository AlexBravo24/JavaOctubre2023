package com;

public class Principal {

	public static void main(String[] args) {
		
		//Puedo crear un objeto persona
		
		//Persona persona1 = new Persona("Javier", 21, "Masculino");
		Persona persona1 = new Empleado();
		System.out.println(persona1);
		
		//Crear o instanciar a un empleado
		//Estamos heredando atributos y métodos de la clase PADRE (Persona)
		//y podemos hacer uso de ellos para crear un nuevo empleado
		
		Empleado desarrollador = new Empleado();
		
		desarrollador.setNombre("Javier");
		desarrollador.setEdad(21);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("AJSH001210HJAS");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("Java Developer Backend");
		
		System.out.println(desarrollador);
		
		//Instanciar a un nuevo estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Emmanuel");
		estudiante1.setEdad(23);
		estudiante1.setGenero("Masculino");
		estudiante1.setCarrera("Ing. Mecatrónica");
		estudiante1.setGrado("Finalizado");
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
		
		desarrollador.comer(3, "tacos");
		
		//Probando el método con retorno caminar()
		persona1.caminar();//"Estoy caminando..."
		System.out.println(persona1.caminar());//syso("Estoy caminando..."
		
		//De igual forma podemos volverlo polimórfico
		System.out.println(persona1.caminar("en el centro"));
		
		//Probando el método abstracto que la clase empleado ya definio
		desarrollador.dormir();
		
		//Probando el método abstracto que la clase estudiante ya definio
		estudiante1.dormir();
	}

}
