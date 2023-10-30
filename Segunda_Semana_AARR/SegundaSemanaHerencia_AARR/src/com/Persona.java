package com;

//Al agregarse el modificador palabra reservada abstract
//La clase se vuelve abstracta
//Una vez que nuestra clase es abstracta ya no podemos instanciarla
//Es decir no podemos crear objetos de esta clase
public abstract class Persona {
	
	//Esta clase va a ser nuestra clase padre o tambien conocida como Superclase
	
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
	
	//Metodos propios de una clase
	//Nos van a permitir defirnir comportamientos, es decir acciones de un objeto en particular
	
	//Metodos que no retornan tipo de dato
	//el hecho de que no retorne un tipo de dato no significa que no realice una acción
	//Para ello utilizamos el modificador "void"
	
	public void comer() {
		//Este metodo que va a ejecutar una impresion en consola
		//con el mensaje que estoy declarando
		System.out.println("Estoy comiendo....");
	}
	
	//Polimorfismo es otro pilar de la POO y consiste en la capacidad de un metodo de ejecutar diversas acciones
	//y de poseer varias formas
			
	//Esto es posible gracias a la sobrecarga de los argumentos
	public void comer(String comida) {
				System.out.println("Estoy comiendo "+ comida);
			}
	

	//Cuando un metodo posee diferentes formas se le conoce como sobrecarga de métodos
	public void comer(int cantidad, String comida) {
		System.out.println("Estoy comiendo "+cantidad+" "+comida);
	}
	
	//Metodos con retorno de un tipo de dato
	//Declarando un metodo que debe retornar un tipo de dato String
	public String caminar() {
		String caminata = "Estoy caminando...";
		return caminata;
		
	}
	//Declarando un metodo caminar pero que solicita un String lugar para volverlo polimorfico
	public String caminar(String lugar) {
		String caminata = "Estoy caminando "+lugar;
		return caminata;
	}
	
	//Vamos a declarar un metodo abstracto
	//El metodo abstracto define que se va a hacer pero no como va a hacerse dejando asi esta tarea
	// a las clases hijas o subclases
	
	//Al momento de volver un metodo abstracto en una clase, la clase tambien tiene que volverse abstracta
	public abstract void dormir();
	
}
