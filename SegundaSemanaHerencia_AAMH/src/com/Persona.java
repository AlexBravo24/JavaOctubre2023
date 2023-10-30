package com;


//Al agragarse el modificador o palabra abstract
//la clase se vuelve abstracta
//Una vez que nuestra clase es abstracta, ya no podemos instanciarla
//es decir, no podemos crear objetos de esta clase
public abstract class Persona {
	
	//Esta clase va a ser nuestra clase Padre o
	//Superclase
	
	private String nombre;
	private int edad;
	private String genero;
	
	//Generamos constructores
	
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
	//Métodos propios de una clase
		//Estos nos van a permitir definir comportamientos
		//es decir, acciones de un objeto en particular
		
		//Métodos que no retornan un tipo de dato
		//El hecho de que no retorne un tipo de dato, no significa
		//que no realice una acción
		//Para ello utilizamos el modificador "void"
		
		public void comer () {
			
			//Este método va a ejecutar una impresión en consola
			//con el mensaje que estoy declarando
			
			System.out.println("Estoy comiendo...");
						
		}
	
		//El POLIFORMISMO es otro pilar de la POO y consiste en la capacidad
		//de un método de ejecutar diversas acciones y poseer varias formas
		
		//Esto es posible debido a la sobrecarga de argumentos
		//Cuando un método posee diversas formas, se le conoce como
		//sobrecarga de métodos
		
		public void comer(String comida) {
			
			System.out.println("Estoy comiendo "+ comida);
			
		}
		
		public void comer(int cantidad, String comida) {
			System.out.println("Estoy comiendo " + cantidad + " " + comida);
			
			
			
		}
		
		//MÉTODOS CON RETORNO DE UN TIPO DE DATO
		//Declarando un método que debe retornar un tipo de dato String
		
		public String caminar() {
			String caminata = "Estoy caminando...";
		//Probando el método con retorno caminar ()
			return caminata;
			
		}
		
		//Declarando un método caminar ()
		public String caminar(String lugar) {
	      String caminata = "Estoy caminando " + lugar;
	      
	      return caminata;
		
		}
		
		//Declarar un método abstracto
		//Método abstracto define QUE se va hacer, pero no COMO va hacerse
		//Dejando así esta tarea a las clases hijas (subclase)
		
		
		//Al momento de volver un método abstracto en una clase,
		//La clase también tiene que volverse abstracta
		public abstract void dormir(); 
		
		//Una vez que creamos una clase abstracta, no puede instanciarse
		//lo cual nos obiga a heredarla
		//Lo que nos va a permitir especializarla  en otros modelos
		//Por lo cual entenderiamos que una clase abstract = clase resumen
		
		
		
		{
			
			
		}
}
	
	

