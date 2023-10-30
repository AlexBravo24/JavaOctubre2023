package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo existe una clase main para ejecutar el proyecto

		// Toda la logia y funciones se guardan a cargo de los objetos que vayamos
		// creando

		// crear un objeto o varable de nuestra clase pan
		// con el constructor vacio. esto me va a permitir asignarle valor a sus
		// atributos posteriormente

		Pan bolillo = new Pan();

		// crear un objeto de nustra clase Pan; pero utilizando el constructor con todos
		// sus pararmetros

		Pan cuernito = new Pan("Cuernito", "Harina, agua, mantequilla", 5, "Dorado", "Chocolate", "Suave",
				"Chocolate");
		
	  
		// Asugnarle un nombre e ingredientes a mi bolillo

//		bolillo.nombre = "Bolillo";
//		bolillo.ingredientes = "Haria y agua";

		// Mostrar en consola valor o atributos de mis objetos
		System.out.println(bolillo);


		// cuernito.nombre="Mantecada"; forma incorrecta de acceder a los atributos de
		// un objeto
		// una vez utilizando modificaoders de acceso, no podemos cambiar los valores de
		// los atrbutos de los objetos creados

		System.out.println(cuernito);
		
		//Probando un metodo set para asiganr un nombre al objeto bolillo
		
		bolillo.setNombre("Bolillo de 2 pesos");
		
		System.out.println(bolillo);
		
		
		//probar un metodo get para devolver unicamente en consola el valor del sabor del cuernito
		
		System.out.println(cuernito.getSabor());
		
		
		//Actividad crear 2 plantilas para realizar 
		
		//Definir atributos
		//Crear metodos constructores
		//Crear getters y setters
		//crear el metodo toString()
		
		
		System.out.println("<<< Ejercicio 1 >>>");
		System.out.println();
		
		Esencia lavanda = new Esencia();
		
		Esencia naranja =new Esencia("Naranja", 10, 19.99, "esencia para auto", 33);
		
		lavanda.setPrecio(29.99);
		
		System.out.println(naranja);
		System.out.println(lavanda);
		
		System.out.println();
		
		
		System.out.println("<<< Ejercicio 2 >>>");
		System.out.println();
		
	Pelicula elAro  = new Pelicula();
		
		Pelicula transformers =new Pelicula("Transformers", "Pelicula basada en juguetes Hasbro", "Accion",
				99.99, "HD");
		
		elAro.setGenero("Terror");
		
		System.out.println(elAro);
		System.out.println(transformers);
		
		
	}

}
