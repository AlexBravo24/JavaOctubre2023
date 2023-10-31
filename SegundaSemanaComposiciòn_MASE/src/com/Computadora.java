package com;

public class Computadora {

	private String marca;
	private String tipo;
	private double pulgadas;
	private String SistemaOperativo;
	
	//Vamos a crear estos atributos como objetos
	//que tambien van a formar parte de nuestra computadora
	private Almacenamiento disco;
	private Ram ram;
	private Procesador CPU;
	
	public Computadora() {}

	public Computadora(String marca, String tipo, double pulgadas, String sistemaOperativo, Almacenamiento disco,
			Ram ram, Procesador cPU) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.pulgadas = pulgadas;
		SistemaOperativo = sistemaOperativo;
		this.disco = disco;
		this.ram = ram;
		CPU = cPU;
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

	public String getSistemaOperativo() {
		return SistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
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

	public Procesador getCPU() {
		return CPU;
	}

	public void setCPU(Procesador cPU) {
		CPU = cPU;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", pulgadas=" + pulgadas + ", SistemaOperativo="
				+ SistemaOperativo + ", disco=" + disco + ", ram=" + ram + ", CPU=" + CPU + "]";
	}
	
	
	
}
