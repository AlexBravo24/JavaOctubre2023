package com;

public class Principal {

	public static void main(String[] args) {

		// Polimorfismo dinamico o dde asignacion
		Persona persona1 = new Empleado();
		System.out.println(persona1);

		Empleado desarrollador = new Empleado();

		desarrollador.setNombre("Fernando");
		desarrollador.setEdad(25);
		desarrollador.setGenero("Masculino");
		desarrollador.setRfc("HECMSHDJDLR1");
		desarrollador.setSalario(25000);
		desarrollador.setCargo("Java Developer Backend");

		System.out.println(desarrollador);

		// instancia de estudiante

		Estudiante estudiante1 = new Estudiante();

		estudiante1.setNombre("Emmanuel");
		estudiante1.setEdad(23);
		estudiante1.setGenero("Masculino");
		estudiante1.setCarrera("Ing. Mecatrinica");
		estudiante1.setGrado("Finalizado");
		estudiante1.setMatriculo(786512);
		estudiante1.setEscuela("Tecnologico de Tlapa");

		System.out.println(estudiante1);

		// Probar el metodo o comportamiento propio de la clase Persona
		// Llamado comer()

		estudiante1.comer();

		// Probar nuevamente el meetodo comer y veremos que este ya posee
		// Dos formas. Uno pide argumento String y otro no.
		estudiante1.comer("Comida china");

		desarrollador.comer(" " + 3 + " " + "Tacos");

		// Probando metodo con retorno caminar

		estudiante1.caminar();
		System.out.println(estudiante1.caminar());

		System.out.println(estudiante1.caminar("En el parque"));

		// Probando metodo abstracto que la clase empleado ya definio

		desarrollador.dormir();

		// Probando metodo abstracto que la clase empleado ya definio

		estudiante1.dormir();

	}

	// Ejemplo de ejercicio de herencia

	// Animal - nombre, especie, tipo (Padre)
	// perro -raza, edad, color(hija)

}
