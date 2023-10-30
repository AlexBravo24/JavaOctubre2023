package com;

public class Pan {

	// La clase nos sirve como una plantilla para crear objetos

	// En este caso, para crear diversos panes

	// Modelar objeto iniciando por definir sus atributos
	
	
	
	// Para utilizar el otro pilar de la POO, que es el encapsulamiento
	//recurriomos a los modificaddores de acceso en variables, metodos clases
	//tec Para proteger la informacion de modificadores

	private String nombre;
	private String ingredientes;
	private int tamaño;
	private String color;
	private String relleno;
	private String textura;
	private String sabor;
	private final static double peso =150;
	
	
	//el modificador static crea variables de clase
	//Pero aun asi pueden modificarse
	
	//el modificador final crea variables constantes
	//y estos valores no pueden ser modificados

	// Metodos constructores
	// Nos permiten construior o generar a nuestro objeto como tal

	// constructor vacio
	// Sirve como comodin o "dumie"
	// para generar a nuestro objeto, sin nesecidad de iniciarlo con sus atributos

	
	public Pan() {

	}



	//Metodos Getters y setters 
	//me van a permitir acceder a la informacion de los atributos 
	//que tienen un modificador de acceso privado
	//permitiendome asi, devolver su valor (Getter)
	//o modificador o establecer su valor (Setters)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRelleno() {
		return relleno;
	}

	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPeso() {
		return peso;
	}
	

	
	
	// metodo constructor con todos los parametos o atributos
		// Nos permite crear un objeto con todos sus atributos inicializados

		// podemos genera mas contructores, uno que pida unicamente nombre y tamaño
		// uno que pida solo nombre, otro que pida nombre y color, etc.
		// No hay limite de constructores a utilizar, sin embargo, los convencionales
		// son
		// el vacio y el que tiene todos los parametros
	public Pan(String nombre, String ingredientes, int tamaño, String color, String relleno, String textura,
			String sabor) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.tamaño = tamaño;
		this.color = color;
		this.relleno = relleno;
		this.textura = textura;
		this.sabor = sabor;
	}





	

	// Metodo to String nos va a permitir convertir los valores de nuestro objeto en
	// formato string
	// y poder visualizarlos o mandarlos a imprimir en consola
	// Es decir, figuremos que actua como una radiografia para poder visualizar de
	// que se compone nustro objeto
	// Tiene la anotacion @override, porque es un metodo propio de la clase objeto y
	// se va a sobreescribir de acuerdo al objeto que estemos definiendo
	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tamaño=" + tamaño + ", color=" + color
				+ ", relleno=" + relleno + ", textura=" + textura + ", sabor=" + sabor + ", peso=" + peso + "]";
	}




}
