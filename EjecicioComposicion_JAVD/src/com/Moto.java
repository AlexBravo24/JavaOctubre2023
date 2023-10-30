package com;

public class Moto {
	
	private String nombre;
	private String marca;	
	private String color;
	private String transmision;
	private String tipo;
	
	private Llanta llanta;	
	private Motor motor;
	private Dimensiones dimensiones;
	
	public Moto() {
		
	}

	public Moto(String nombre, String marca, String color, String transmision, String tipo, Llanta llanta, Motor motor,
			Dimensiones dimensiones) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.transmision = transmision;
		this.tipo = tipo;
		this.llanta = llanta;
		this.motor = motor;
		this.dimensiones = dimensiones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Llanta getLlanta() {
		return llanta;
	}

	public void setLlanta(Llanta llanta) {
		this.llanta = llanta;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Dimensiones getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimensiones dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Moto [nombre=" + nombre + ", marca=" + marca + ", color=" + color + ", transmision=" + transmision
				+ ", tipo=" + tipo + ", llanta=" + llanta + ", motor=" + motor + ", dimensiones=" + dimensiones + "]";
	}
		
}
