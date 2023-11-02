package com;

//Clase padre o superclase "Calculadora"
public abstract class Calculadora {

	//Atributos
	private String marca;
	private String color;
	private String tipo;
	
	//Constructor vacío
	public Calculadora() {
		
	}
	
	//Generamos los metodos de constructor con todos
	//sus argumentos
	public Calculadora(String marca, String color, String tipo) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
	}
	
	//Generamos metodos getters y setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Generar to String
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", tipo=" + tipo + "]";
	}
	
	
	//Declaramos los metodos abstractos
	//pueden ser void o return
	//RETORNO

	public abstract double sumar (double a, double b);
	public abstract double restar (double a, double b);
	public abstract double dividir (double a, double b);
	public abstract double multiplicar (double a, double b);
	
	
	}
	
	
	
	
	
