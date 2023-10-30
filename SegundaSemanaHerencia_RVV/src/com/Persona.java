package com;


//al agregarse el modificador o palabra reservada abstract
//la clase se vuelve abstracta
//una vez que nuestra clase es abstracta ya no podemos instanciarla
//es decir no podemos crear objetos de esta clase
public abstract class Persona {
	
	//esta clase va a ser nuestra clase padre o
	//superclase
	
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
	
	//metodos propios de una clase
	//estos nos van a permitir definir comportamientos
	//es decir, acciones de un objeto en particular
	
	//metodos que no retornan un tipo de dato
	//el hecho de que no retorne un tipo de dato no significa
	//que no realice una accion
	//para ello utilizamos el modificador "void"
	
	public void comer() {
		//este metodo va a ejecutar una impresion en consola
		//con el mensaje que estoy declarando
		System.out.println("estoy comiendo");
	}
	
	//el polimorfismo es otro pilar de la programacion de la POO
	//y consiste en la capacidad de un metodo de ejecutar diversas acciones
	//y de poseer varias formas
	
	//esto es posible debido a la sobrecarga de argumentos
	//cuando un metodo posee diversas formas se le conoce como 
	//sobrecargar de metodos
	public void comer(String comida) {
		System.out.println("estoy comiendo "+comida);
	}
	
	public void comer(int cantidad, String comida){
		System.out.println("estoy comiendo "+cantidad+ " "+comida);
	}
	
	//metodos con retorno de un tipo de dato
	//declarando un metodo que debe retornar un tipo de dato String
	
	public String caminar() {
		String caminata="estoy caminando";
		return caminata;
		}
	public String caminar(String lugar) {
		String caminata="estoy caminando "+lugar;
		return caminata;
		
	}
	
	//declara un metodo abstracto
	//el metodo abstracto defina que se va a hacer, pero no como va a hacerse
	//dejando asi esta tarea a las clase hijas (subclases)
	
	//al momento de volver un metodo abstracto en una clase
	//la clase tambien tiene que volverse abstracta
	public abstract void dormir();
	
	//una vez que creamos una clase abstracta, no puede instanciarse
	//lo cual nos obliga a heredarla
	//lo que nos va a permitir especializarla en otros modelos
	//por lo cual entenderiamos que una clase abstract=clase resumen
	

}
