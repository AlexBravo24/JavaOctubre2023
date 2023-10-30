package com;

public class Celular {
	//minimo 3 atributos del celular
	//atributos que sean objetos con otros atributos
	
	
	private String marca;
	private String modelo;
	private double pulgadas;
	
	private Procesador cpu;
	private Almacenamiento Unidad;
	private Fisico caracteristicas;
	
	public Celular () {
		
	}

	public Celular(String marca, String modelo, double pulgadas, Procesador cpu, Almacenamiento unidad,
			Fisico caracteristicas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.cpu = cpu;
		Unidad = unidad;
		this.caracteristicas = caracteristicas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Almacenamiento getUnidad() {
		return Unidad;
	}

	public void setUnidad(Almacenamiento unidad) {
		Unidad = unidad;
	}

	public Fisico getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Fisico caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + ", cpu=" + cpu
				+ ", Unidad=" + Unidad + ", caracteristicas=" + caracteristicas + "]";
	}
	
	
	
}
