package com;

public class Pan {
	
	//La clase nos va a servir como una plantilla
	//o molde para crear objetos
	//En este ejemplo, para crear diversos panes
	
	//Tenemos que modelar a nuestro objeto
	//Iniciando por definir sus atributos
	
	//tamaño, color, relleno, textura, sabor
	//nombre, ingredientes
	
	//Para utilizar el otro pilar de la POO, que es el ENCAPSULAMIENTO
	//Recurrimos a los modificadores de acceso en variables, métodos, clases,
	//etc. Para proteger la información de modificadores 
	
	
	private String nombre,ingredientes,color,relleno,textura,sabor;
	private int tamaño;
	private final static double peso=150;
	
	//El modificador static crea variables de clase
	//pero aún así pueden ser modificados
	
	//El modificador final crea variables constantes
	//Y estos valores no pueden ser modificados
	
	//Métodos constructores
	//Estos nos van a permitir construir o generar a nuestro objeto como tal
	
	//Constructor vacío
	//El cual sirve como comodín o "dummie"
	//para generar a nuestro objeto, sin la necesidad de iniciarlo con sus atributos
	
	public Pan(){
		
	}

	//Método constructor con todos los parámetros o atributos
	//Nos permite crear un objeto, pero con todos sus atributos inicializados
	
	//Podemos generar más constructores, uno que nos pida unicamente nombre y tamaño
	//Uno que pida solo el nombre, otro que pida nombre y color, etc.
	//No hay límite de constructores a utilizar, sin embargo, los convencionalmente
	//utilizados
	//Son el vacío y el que tiene todos los parámetros

	public Pan(String nombre, String ingredientes, String color, String relleno, String textura, String sabor,
			int tamaño) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.color = color;
		this.relleno = relleno;
		this.textura = textura;
		this.sabor = sabor;
		this.tamaño = tamaño;
	}
	
	//Métodos Getters and Setters
	//Me van a permitir acceder a la información de los atributos
	//que tienen un modificador de acceso privado
	//Permitiendome así, devolver su valor (Getter)
	//o modificar su valor (Setter)
	
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

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}	
	

	
	//Método toString(), nos va a permitir convertir los valores de
	//nuestro objeto en formato String y poder visualizarlos o mandarlos
	//a imprimir en consola
	//Es decir, figuremos que actúa como radiografía para poder
	//visualizar de que se compone nuestro objeto	
	//Tiene la anotación @Override, porque es un método propio de
	//la clase Object y se va a sobreescribir de acuerdo al objeto que
	//estemos definiendo		

	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", ingredientes=" + ingredientes + ", color=" + color + ", relleno=" + relleno
				+ ", textura=" + textura + ", sabor=" + sabor + ", tamaño=" + tamaño + ", peso=" + peso + "]";
	
	}

}
