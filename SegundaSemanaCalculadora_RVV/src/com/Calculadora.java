package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	private String forma;
	
	public Calculadora() {}


	public Calculadora(String marca, String color, String forma) {
		super();
		this.marca = marca;
		this.color = color;
		this.forma = forma;
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


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
	}


	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", forma=" + forma + "]";
	}	
	public abstract void sumar(double operando1, double operando2);

    public abstract void restar(double operando1, double operando2);

    public abstract double multiplicar(double operando1, double operando2);

    public abstract double dividir(double operando1, double operando2);
}
