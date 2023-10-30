package com;
//Al agregarse el modificador o palabra reservada abstract
//la clase se vuelve abstracta
//una vez que nuestra clase es abstracta , ya no podemos instanciarla
//es decir, no podemos crear objetos de esta clase
public abstract class Persona {

	//Esta clase va a se nuestra clase Padre o 
	//Superclase
	
	
	private String nombre;
	private int edad;
	private String genero;
	
	public Persona() {}

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
	
	
	//Metodos propios de una clase 
	//Estos nos van a permitir comportamientos 
	// es decir acciones de un pbjeto
	
	
	
	//Metodos que no retornan tipo de dato
	//el hecho de que no retorne un tipo de dato, no sidnifica
	//qu no realize accion
	
	//para ello utilizamos el modificador "void"
	
	public void comer() {
		//este metodo va ejecutar una impresion en consola
		//con el mensaje que estoy declarando
		System.out.println("Estoy comiendo...");
		
	}
	
	//El POLIFOMISMO es otro pilar de la POO  y consiste en la 
	//capacidad de un metodo de ejecutar diverdad acciones y de pooser varias 
	//formas
	
	
	//Esto es posible debido a la sobrecarga de argumentos
	//cuando un metodo posee diversas fomras, se le conoce como
	//sobrecarga de metodos
	public void comer (String comida) {
		System.out.println("estoy comiendo "+ comida);
	}
	
	public void comer (int cantidad,String comida) {
		System.out.println("Estoy comiendo "+cantidad+" "+comida);
	}
	
	//Metodos con retorno de un tipo de dato
	//declaramos un metodo que debe retornar un tipo de dato S
	public  void caminar() {
	
	System.out.println("Estoy caminando");	
		
	}
	//Declarando un metodo caminar() pero que solicita un String li
	public String caminar (String lugar) {
		
		String caminata= "estoy caminando "+lugar;
		return caminata;
	}
	
	
	//declara un metodo abstracto
	//el metodo abastacyo define que va hacer, pero no como va 
	//hacerse, dejando esta tarea a las clases hijas o subclases
	
	
	
	//al momento de volver un metoso abstracto en una clase
	//la clse tambien deve volverse abstracta
	
	public abstract void dormir();
	
	
	//Una vez que creamos una clase abstracta, no puede instarciarse
	//lo cual nos obliga a heredarla 
	//lo que nos va a permitir especializarla en otros modelos 
	//por lo cual entenderiamos que una clase abstract = clase re
	
}
