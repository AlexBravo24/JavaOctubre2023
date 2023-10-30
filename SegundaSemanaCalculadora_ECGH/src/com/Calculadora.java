package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	private String modelo;

public Calculadora() {}

public Calculadora(String marca, String color, String modelo) {
	super();
	this.marca = marca;
	this.color = color;
	this.modelo = modelo;
}



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

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

@Override
public String toString() {
	return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
}

public abstract double suma(double datoA, double datoB); 
public abstract double resta(double datoA, double datoB); 
public abstract double multiplicacion(double datoA, double datoB); 
public abstract double division(double datoA, double datoB); 




















}
