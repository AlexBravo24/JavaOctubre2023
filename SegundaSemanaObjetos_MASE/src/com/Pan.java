package com;

public class Pan {
	//La clase nos va a servir como un molde  
	//mpara crear objetos 
	// en este ejemplo, para crear diversos panes
	
	//Tenemos que modelar a nuestro objeto
	//Iniciando por definir sus atribuutos
	
	// tamaño, color, relleno, textura, sabor
	//Nombre, ingredientes
	
	//Para utilizar el otro pilar de POO que es el ENCAPSULAMIENTO
	//Recurrimos a los modificadores de acceso en variables, metodos y clases
	//etc. Para proteger la informaciòn de modificadores
	
	
	private String nombre;
	private String ingredientes;
	private int tamaño;
	private String color;
	private String relleno;
	private String textura;
	private String sabor;
	private double peso;
	
	//Metodos constructores
	//Estos nos van a permitr construir o generar a nuestro objeto como tal

	//Constructor vacìo que sirve como un comodin
	//Para generarar a nuestro objeto, sin necesidad de 
	// iniciarlo sin sus atributos
	
	public Pan () {
		
		
	}

	//Metodo constructor con todos los pàrametros o atributos
	// Nos permite  crear un objeto, pero con todos sus atributos inicializados
	
	//Podemos generar màs constructores, uno que nos pida unicamente nombre y tamaño
	
	public Pan(String nombre, String ingredientes, int tamaño, String color, String relleno, String textura,
			String sabor, double peso) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.tamaño = tamaño;
		this.color = color;
		this.relleno = relleno;
		this.textura = textura;
		this.sabor = sabor;
		this.peso = peso;
	}

	
	//Metodos Getters y Setters
	// Me vann a permitir acceder a la informaciòn de los atribuutos
	//que tienen un modificador de acceso privado
	//permitiendome asi, devolver su valor (Getter)
	//o modificar su valor (Setters)
	
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

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	// Metodo toString(),nos va a permitir convertir los valores de
		//nuestro objeto en formato String y poder visualizar o mandarlos
		// a consola
		//Es decir, figuremos que actua como una radiografia para poder visualizar 
		// de que compone nuestro objeto
		
		//Tiene la anotaciòn @override porque es un metodo propio de 
		//la clase Object y se va a sobreescribir de acuerdo al objeto 
		//qu estemos definiendo
	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tamaño=" + tamaño + ", color=" + color
				+ ", relleno=" + relleno + ", textura=" + textura + ", sabor=" + sabor + ", peso=" + peso + "]";
	}
	
	
	}
	

