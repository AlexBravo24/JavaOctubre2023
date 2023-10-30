package com;
//para implementar los metodos de una interface 
//lo hacemos conn la palabra reservada"implements" y el 
//nombre de la interface

public class Cientifica extends Calculadora implements ITermometro , IVolar{

	private int noFunciones;
	private String pilas;
	private String graficadora;
	
	
	public Cientifica(){}
	
	public Cientifica(String marca, String color, String modelo, int noFunciones, String pilas, String graficadora) {
		super(marca, color, modelo);
		this.noFunciones = noFunciones;
		this.pilas = pilas;
		this.graficadora = graficadora;
	}


	public int getNoFunciones() {
		return noFunciones;
	}
	public void setNoFunciones(int noFunciones) {
		this.noFunciones = noFunciones;
	}
	public String getPilas() {
		return pilas;
	}
	public void setPilas(String pilas) {
		this.pilas = pilas;
	}
	public String getGraficadora() {
		return graficadora;
	}
	public void setGraficadora(String graficadora) {
		this.graficadora = graficadora;
	}

	
	

	@Override
	public String toString() {
		return "Cientifica [noFunciones=" + noFunciones + ", pilas=" + pilas + ", graficadora=" + graficadora
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public double suma(double datoA, double datoB) {
		
		return datoA+datoB;
	}

	@Override
	public double resta(double datoA, double datoB) {
		// TODO Auto-generated method stub
		return datoA-datoB;
	}

	@Override
	public double multiplicacion(double datoA, double datoB) {
		// TODO Auto-generated method stub
		return datoA*datoB;
	}

	@Override
	public double division(double datoA, double datoB) {
		// TODO Auto-generated method stub
		return datoA/datoB;
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando temperatura= normal 36 C");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	
	//Existe la multiherencia en java?
	//No, pero puede simularse mediante el uso de interfaces
	
	//De donde toman u obtienen comportamiento los objetos?
	//1.Métodos propios
	//2.De otras clases (clases padre), ya sean abstractas o no
	//3. Interface
	
	


	
	
	
}
