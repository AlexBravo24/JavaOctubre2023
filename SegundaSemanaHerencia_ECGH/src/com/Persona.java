package com;
//Al agragarse el modificador o palabra reservada abstract
//la clase se vuelve abstract 
//Una vez que nuestra clase es abstracta, ya no podemos instanciarla
//Es decir, no podemos crear objetos de esta clase
public abstract class Persona {

	//Esta clase va a hacer nuestra clase padre o 
	//también conocida como superclase
	
	private String nombre;
	private int edad;
	private String genero;
	
	public Persona(){}

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
	
	//Métodos propios de una clase
	//Estos nos van a permitir definir comportamientos
	//es decir, acciones de un objeto en participar
	
	//Métodos que no retornan un tipo de dato 
	
	//El hecho de que no retorne un tipo de dato, no 
	//significa que no realice una accion
	//para ello utilizamos el moodificador "void"
	
	public void comer() {
	//Este metodo va a ejecutar una impresión en consola 
		//con el mensaje que estoy declarando
		System.out.println("Estoy comiendo...");
	}
	
	
	//El POLIMORFISMO es otro pilar de la POO y consiste en la capacidad 
	//de un método de ejecutar diversas acciones y poseer varias formas
		
	//Esto es posible a la sobrecarga de argumentos
	public void comer(String comida) {
				
		System.out.println("Estoy comiendo..."+comida);
	}
	
	public void comer (int cantidad, String comida) {
		System.out.println("Estoy comiendo "+cantidad+" "+comida);
		
	}
	
	
	
	//Métodos con retorno de un tipo de dato
	//Declarando un método que debe retornar un tip de dato String
	
	public String caminar() {
		String caminata="Estoy caminando...";
		
		return caminata;
		
	}
	
	//Declarando un método caminar que solicita un lugar
	public String caminar(String lugar) {
		String caminata="Estoy caminando "+lugar;
		
		return caminata;
		
	}
	
	
	//Declarar méetodo abstracto define que se va a hacer, pero no como va a hacerce
	//dejando asi esta tarea a las clses hijas (subclases)
	
	//Al momento de volver un método abstracto en una clase,
	//la clase también tiene que volverse abstracta
	public abstract void dormir();
	
	//Una vez que creamos una clase abstracta, no puede instanciarse
	//lo cual nos obliga a heredarla
	//Lo que nos va a permitir especializarla en otro modelos
	//Por lo cual entenderiamos que una clase abstract=clase resumen
	
	
	
	
	
	
	
	
	
	
	
	
}
