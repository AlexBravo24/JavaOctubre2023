package com;

public class Principal {

	public static void main(String[] args) {

		//puedo crear un objeto persona
		
		//polimorfismo dinamico o de asignacion
		Persona persona1=new Empleado();
		
		
		System.out.println(persona1);
		//crear o instanciar un empleado
		//estamos heredando atributos y metodos de la clase padre(persona)
		//y podemos hacer uso de ellos para crear un nuevo empleado
		
		
		Empleado desarrollador=new Empleado();
		
		desarrollador.setNombre("juanito");
		desarrollador.setEdad(12);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("MDEJ015152SA2");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("java Developer Backend");
		
		System.out.println(desarrollador);
		
		//instanciar a un nuevo estudiante
		
		Estudiante escuelero1=new Estudiante();
		escuelero1.setNombre("manuelito");
		escuelero1.setEdad(11);
		escuelero1.setGenero("masculino");
		escuelero1.setCarrera("primaria");
		escuelero1.setGrado("sexto");
		escuelero1.setMatricula(126646);
		escuelero1.setEscuela("UVM");
		
		System.out.println(escuelero1);
		
		//probar el metodo o comportamiento propio de la clase persona
		//llamado comer()
		
		persona1.comer();
		
		//probar nuevamente el metodo comer y veremos que este ya posee 2 formas
		//uno pide un argumento string y otro no
		persona1.comer("pizza");
		
		//estos metodos tambien son heredadps a las subclsases o clases hija
		escuelero1.comer("sushi");
		
		
		desarrollador.comer(2, "hamburguesas");
		
		//probando el metodo con retorno caminar
		
		persona1.caminar();
		System.out.println(persona1.caminar());
		
		//de igual forma podemos volverlo polimorfico
		
		System.out.println(escuelero1.caminar("en la escuela"));
		
		//probando el metodo abstracto que la clase empleado ya definio
		
		desarrollador.dormir();
		
		escuelero1.dormir();

	}

}