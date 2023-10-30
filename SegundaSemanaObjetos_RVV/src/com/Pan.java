package com;

public class Pan {

	
	//la clase nos va a servir como una plantilla
	//o molde para crear objetos
	//en este ejemplo, para crear diversos panes
	
	//tenemos que modelar a nuestro objeto
	//iniciando por definir sus atributos
	
	//tama�o, color, relleno, textura, sabor, nombre
	//ingredientes
	
	//para utilizar el otro de la POO que es el encapsulamiento
	//recurrimos a los modificadores de acceso en variables, metodos, clases
	//etc. para proteger la informacion de modificaciones
	
	private String nombre;
	private String ingredientes;
	private int tama�o;
	private String color;
	private String relleno;
	private String textura;
	private String sabor;
	private final static double peso = 150;
	
	//el modificados static crea variables de clase
	//pero aun asi pueden ser modificados
	
	//metodos constructores
	//estos nos van a permitir construir o generar a nuestro objeto como tal
	
	//constructor vacio
	//el cual sirve como un comodin o "dummie"
	//para generar a nuestro objeto, sin necesidad de iniciarlo con sus atributos
	
	public Pan() {
		
	}

	//metodo constructor con todod los parametros o atributos
	//nos permite crear un objeto,pero con todos sus atributos inicializados
	
	//podemos generar mas constructores, uno que nos pida solo nombre y tama�o
	//uno que pida solo nombre, otro que pida nombre y color, etc
	//no hay un limite de constructores a utilizar, sin embargo los convencionalmente utilizados
	//son el vacio y el que tiene todos los parametros
	public Pan(String nombre, String ingredientes, int tama�o, String color, String relleno, String textura,
			String sabor) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.tama�o = tama�o;
		this.color = color;
		this.relleno = relleno;
		this.textura = textura;
		this.sabor = sabor;
	
	
	
	}
	
	
	
	//metodos getters y setters
		//me van a permitir acceder a la informacion de los atributos
	//el modificador final crea variables constantes
	//y estos valores no pueden ser modificados
	
	//pueden utilizarse separados o pueden utilizarse en conjunto
	//creando asi valores de clase que son inmutables
	
	
	//que tienen un modificador de acceso privado
	//permitiendome asi, devolver su valor (getter)
	//o modificar su valor (setters)
	
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
	
	
	
	

	//metodo toString(), nos va a permitir convertir los valores de nuestro objeto
	//en formato string y poder visualizarlos o mandarlos a imprimir en consola
	//es decir, figuremos que actua como una radiografia para poder
	//visualizar de que se compone nuestro objeto
	//tiene la anotacion @override, porque es un metodo propio de la clase Oject
	//y se va a sobreescribir de acuerdo al objeto que estemos definiendo
		
	

	

	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tama�o=" + tama�o + ", color=" + color
				+ ", relleno=" + relleno + ", textura=" + textura + ", sabor=" + sabor + ", peso=" + peso + "]";
	}
	
	
	
	
	
}