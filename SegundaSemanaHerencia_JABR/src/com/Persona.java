package com;

//Al agregarse el modificador o palabra reservada abstract
//la clase se vuelve abstracta
//Una vez que nuestra clase es abstracta, ya no podemos instanciarla
//Es decir, no podemos crear objetos de esta clase
public abstract class Persona {
	
	//Esta clase va a ser nuestra clase Padre o
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
	
	
	//M�todos propios de una clase
	//Estos nos van a permitir definir comportamientos
	//es decir, acciones de un objeto en particular
	
	
	//M�todos que no retornan un tipo de dato
	//El hecho de que no retorne un tipo de dato, no significa
	//que no realice una acci�n
	//Para ello utilizamos el modificador "void"
	
	public void comer () {
		//Este m�todo va a ejecutar una impresion en consola
		//Con el mensaje que estoy declarando
		System.out.println("Estoy comiendo...");
	}
	
	//El POLIMORFISMO es otro pilar de la POO y consiste en la capacidad
	//de un m�todo de ejecutar diversas acciones y poseer varias formas
	
	//Esto es posible debido a la sobrecarga de argumentos
	//Cuando un m�todo posee diversas formas, se le conoce como
	//sobrecarga de m�todos
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
	
	public void comer(int cantidad, String comida) {
		System.out.println("Estoy comiendo " + cantidad + " " + comida);
	}
	
	//M�TODOS CON RETORNO DE UN TIPO DE DATO
	//Declarando un m�todo que debe retornar un tipo de dato String
	
	public String caminar() {
		String caminata = "Estoy caminando...";
		
		return caminata;	
	}
	
	//Declarando un m�todo caminar() pero que solicita un String lugar
	public String caminar(String lugar) {
		String caminata = "Estoy caminando " + lugar;
		
		return caminata;
	}
	
	
	//Declarar un m�todo abstracto
	//El m�todo abstracto define QU� se va a hacer, pero no C�MO va a hacerse
	//Dejando as� esta tarea a las clases hijas (subclases)
	
	//Al momento de volver un m�todo abstracto en una clase,
	//la clase tambi�n tiene que volverse abstracta
	public abstract void dormir();
	
	//Una vez que creamos una clase abstracta, no puede instanciarse
	//lo cual nos obliga a heredarla
	//Lo que nos va a permitir especializarla en otros modelos
	//Por lo cual entender�amos que una clase abstract = clase resumen
	

}
