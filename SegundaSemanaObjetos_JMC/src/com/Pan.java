package com;

public class Pan {

	
	//La clase nos va a servir como una platilla
	// o molde para crear objetos 
	// en este ejemplo , para crear diversos panes
	
	//Tenemos que modelar a nuestro objeto 
	//Iniciamos  por definir sus atributos 
	
	
	//Para utilizar el otro pilar de la POO,  que es el ENCAPSULAMIENTO
	//Recurrir a lo modificadores de acceso en variables, metodos clases
	//etc. Para proteger la informacion de modificaciones
	
	
	private String nombre;
	private String ingredientes;
	private int tamaño;
	private String color;
	private String relleno;
	private String textura;
	private String sabor;
	private  final static double peso=150;
	
	
	
	//El modificador static crea variables de clase 
	//Pero aun asi pueden ser modificados
	
	
	//EL modidificador final crea variables constantes
	//y estos valores no pueden ser modificados 
	
	//pueden utilizase separados o pueden utilizarse en conjunto 
	//creando asi valores de clase que son inmutables
	
	
	//Metodos constructores 
	//Estos nos van a permitir o genrar a nuestro objeto como tal
	
	//Constructor vacio
	//El cual sirve como un comodin o  "dummuie"
	//para generar a nuestro objeto, sin necesidad de iniciarlo con sus atributos
	
	
	//Metodos Getters y Setters 
	//Me van a permitir acceder a la informacion de los atributos 
	//que tienen un modificador de acceso privado
	//Permitiendome asi, devolver su valor (Getter)
	//p modificar o establecer  su valor (setters)
	
	
	
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


	public Pan () {
		
		
		
		
	}

	//Metodo contructor con todos los parametros o atributos
	//Nos permite crear un objeto, pero con todos sus atrinutos inicializados
	
	//Podemos generar mas constructors, uno que nos pida unicamente nombre y tamaño
	//un que pida solo nombre, otro que pida  nombre y color etc.
	//No hay un limite de constructores a utilizar, sin embargo , los convencioales
	//utilizados
	//Son el vacio y el que tiene todos los parametros
	

    //Metodo toString(), nos va a permitir convertir los valores de 
	//nuestro objeto en formato String y poder vizualizarlos o mandarlos 
	//a imprimir en consola
	//Es decir , figuremos que actua como una radiografia para poder vizualizar 
	//de que se compone nuestro objeto
	
	//Tiene la anotacion @Overrride , por que es un metodo propio de la 
	//clase Object y se va a sobreescribir de acuerdo al objeto que 
	//estemos definiendo 
	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tamaño=" + tamaño + ", color=" + color
				+ ", relleno=" + relleno + ", textura=" + textura + ", sabor=" + sabor + ", peso=" + peso + "]";
	}

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
	
	
	
	
	
}
