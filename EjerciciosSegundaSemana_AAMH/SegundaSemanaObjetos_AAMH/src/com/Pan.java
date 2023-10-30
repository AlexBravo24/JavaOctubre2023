package com;

public class Pan {

	//La clase nos va servir como una plantilla
	// omolde para creear objetos
	//En este ejemplo, para crear diversos panes
	
	//tenemos que modelar a nuestro objeto
	//Iniciando por definir sus atributos
	
	//tama�o, color, relleno, textura, sabor
	//nombre, ingredientes, peso
	
	//Para utilizar el otro pilar de la POO, que es el ENCAPSULAMIENTO
	//Recurrimos a los modificadores de acceso en variables, m�todos clases
	//etc. Para proteger la informaci�n de modificaciones
	
	private String nombre;
	private String ingredientes;
	private int tama�o;
	private String color;
	private String relleno;
	private String textura;
	private String sabor;
	private static double peso = 150;
	
	
	//El modificador static crea variables de clase
	//Pero aun as� pueden ser modificados
	
	//El modificador final crea variables constantes
	//Y estos valores no pueden ser modificados
	
	//Pueden utilizarse 
	
	
	//M�todos constructores
	//Estos nos van a permitir construir o generar a nuestro objeto como tal
	
	//Constructor vacio
	//El cual sirve como un comodin o "dummie"
	//para generar a nuestro objeto, sin necesidad de iniciarlo con sus atributos
	
	public Pan () {
	
		
	}
	
	//M�todo constructor con todos los parametros o atributos
	//Nos permite crear un objeto, pero con todos sus atributos inicializados
	
	//Podemos genrar m�s constructores, uno que nos pida unicamente nombre y tama�o
	//Uno que pida solo nombre, otro que se pida nombre y color, etc.
	//No hay un limite de contructores a utilizar, sin embargo, los convencionalmente utilizados
	//Son el vacio y el que tiene todos los parametros
	
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
		
	//M�todo toString(), nos va a permitir convertir los valores de
	//nuestro objeto en formato String y poder visualizarlos o mandarlos
	//a imprimir en consola
	//Es decir, figuremos que actua como una radografia para poder
	//vizualizar de que se compone nuestro objeto
	
	//Tiene la anotacion @Override, porque es un m�todo propio de
	//la clase Object y se va a sobreescribir de acuerdo al objeto que
	//estemos definiendo
	
	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tama�o=" + tama�o + ", color=" + color
				+ ", relleno=" + relleno + ", textura=" + textura + ", sabor=" + sabor + ", peso=" + peso + "]";
	}

	
	
	//M�todos Getters y Setters
		//Me van a permitir acceder a la informaci�n de los atributos
		//que tienen un modificador de acceso privado
		//permitiendo asi, devolver su valor (Getter)
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

	
	}
