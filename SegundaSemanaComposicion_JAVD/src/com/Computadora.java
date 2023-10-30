package com;

public class Computadora {
	
	private String marca;
	private String tipo;
	private double pulgadas;
	private String so;
	
	//Vamos a crear estos atributos como objetos
	//que también van a formar parte de nuestra computadora
		
	private Almacenamiento disco;
	private Ram ram;
	private Procesador cpu;
	
	public Computadora() {
		
	}

	public Computadora(String marca, String tipo, double pulgadas, String so, Almacenamiento disco, Ram ram,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.pulgadas = pulgadas;
		this.so = so;
		this.disco = disco;
		this.ram = ram;
		this.cpu = cpu;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", pulgadas=" + pulgadas + ", so=" + so + ", disco="
				+ disco + ", ram=" + ram + ", cpu=" + cpu + "]";
	}				

}
