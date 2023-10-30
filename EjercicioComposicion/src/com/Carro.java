package com;

public class Carro {

	
	private String marca;
	private int modelo;
	private String precio;
	private String color;
	private Neumatico llantas;
	private Rin rin;
	private Motor motor;
	private Estereo sonido;
	
	public Carro() {}

	public Carro(String marca, int modelo, String precio, String color, Neumatico llantas, Rin rin, Motor motor,
			Estereo sonido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.llantas = llantas;
		this.rin = rin;
		this.motor = motor;
		this.sonido = sonido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Neumatico getLlantas() {
		return llantas;
	}

	public void setLlantas(Neumatico llantas) {
		this.llantas = llantas;
	}

	public Rin getRin() {
		return rin;
	}

	public void setRin(Rin rin) {
		this.rin = rin;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Estereo getSonido() {
		return sonido;
	}

	public void setSonido(Estereo sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", llantas="
				+ llantas + ", rin=" + rin + ", motor=" + motor + ", sonido=" + sonido + "]";
	}
	
	
	
	
	
	
	
}
