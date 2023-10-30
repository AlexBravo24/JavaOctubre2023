package com;

public class Pan {
	
	//la clase nos va a servir como molde o plantilla para
	// crear objetos, o diversos panes
	
	//tenemos que modelar nuestro objeto
	// iniciando por definir sus atributos
	
	//tama�o, color, relleno, textura, sabor, nombre, ingredientes
	
	//para utilizar el otro pilar de la programaci�n orientada a objetos que es
	//el encapsulamiento, recurrimos a los modificadores de acceso variables
	//metodos, clases etc. para proteger la informaci�n de modificaciones
	
	private String nombre;
	private String ingredientes;
	private int tama�o;
	private String color;
	private String relleno;
	private String textura;
	private String sabor;
	private final static double peso = 150;
	
	//El modificador static crea variables de clase
	//Pero aun as� pueden ser modificados
	//private final static double peso = 150;
	
	//El modificador final crea variables constantes
	//Estos valores no pueden ser modificados
	
	//Pueden utilizarse separados o pueden utilizarse en conjunto estando asi valores de clase que son inmutables
	
	//metodos constructores
	//estos nos van a permitir construir o generar a nuestro objeto como tal
	
	//constructor vacio
	//el cual sirve como un comodin o "dummie"
	//para generar a nuestro objeto sin necesidad de iniciarlo con sus atributos
	
	public Pan () {
		
	}
	
	
	//Metodo constructor con todos 
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

	
	
	//Metodos getters and setters
	//estos metodos me van a permitir acceder a la informaci�n de los atributos 
	//tenga un modificador de acceso privado permitiendo asi , devolver su valor
	//en caso de los (getter) o establecer su valor en el caso de los (setter)
	
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


	public static double getPeso() {
		return peso;
	}
	
	
	

	//Metodo to String nos va a permitir convertir los valores de nuestro objeto en formato String
	//y poder visualizarlos o mandarlos a imprimir en consola
	//es decir figuremos que funciona como una radiografia para poder visualizar
	//de que se compone nuestro objeto.
	
	//anotaci�n @Override por que es un metodo propio de la clase object y se va a
	//sobreescribir de acuerdo al objeto que estemos definiendo

	


	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", tama�o=" + tama�o + ", color=" + color
				+ ", relleno=" + relleno + ", textura=" + textura + ", sabor=" + sabor + ", peso=" + peso + "]";
	}


	
	
	
	

}
