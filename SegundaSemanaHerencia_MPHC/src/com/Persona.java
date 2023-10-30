package com;

//Al agregar el modificador ompalabara reservada abstract
//La clase se vuelve abstracta
//Una vez que nuestra clase es abtracta, ya no podemos instanciarla
//Es decir no vamos a poder crear objetos
public abstract class Persona {// Clase padre o superclase

	private String nombre;
	private int edad;
	private String genero;

	public Persona() {
	}

	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}

	// Metodos propios de una clase
	// Estos nos van a permitir definir comportamientos
	// es decir, acciones de un objeto en partiucular

	// Metodos que ni retornan un tipo de dato
	// El hecho de que no retorne un tipo de dato, no significa que no realice una
	// accion
	// Para ello utilizamos el modificador "void"

	public void comer() {
		// Este metodo va a ejecutar una impresion en consola
		// Con el mensaje que estoy declarando

		System.out.println("Estoy comiendo...");
	}

	// El polimorfismo es otro pilar de la programacion orientada a objetos
	// Y consiste en la capacidad de un metodo de ejecutar diversas acciones y
	// poseer varias formas

	// Esto es posible debido a la sobrecarga de argumentos
	public void comer(String comida) {

		System.out.println("Estoy comiendo" + comida);

	}

	public void comer(int cantidad, String comida) {

		System.out.println("Estoy comiendo" + cantidad + " " + comida);

	}

	// METODOS CON RETORNO DE UN TIPO DE DATO
	// Declarando un metodo que debe retornar un tipo de dato String

	public String caminar() {
		String caminata = "Estoy caminando..";

		return caminata;

	}

	public String caminar(String lugar) {
		String caminata = "Estoy caminando " + lugar;

		return caminata;

	}
	
	//Decalarar metodo abstracto
	//Define que se va hacer pero no dice como se va hacer, pero como va a hacerse  
	//Dejando asi esta tarea  a las clases hija 
	
	//Al momento de volver un metodo abstracto en una clase
	
	public abstract void dormir();

	
	//Una vez zque creamos una clase abstracta , no puede instanciarse
	//lo cual nos obliga a heredarla
	//Lo que nos va a permitir especializarla en otros modelos
	//Por lo cual entenderiamos que una clase abstract = classe resumen
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
