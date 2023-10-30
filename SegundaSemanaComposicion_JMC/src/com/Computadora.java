package com;

public class Computadora {

	private String marca;
	private String tipo;
	private double pulgadas;
	private String sistemaOperativo;
	
	//Vamos a crear estos atributos como objetos 
	//que tambien van a formar de nuestra computadora
	
	private Almacenamiento disco;
	private Ram memoriaram;
	private Procesador cpu;
	
	
	public Computadora() {}
	


	public Computadora(String marca, String tipo, double pulgadas, String sistemaOperativo, Almacenamiento disco,
			Ram memoriaram, Procesador cpu) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.pulgadas = pulgadas;
		this.sistemaOperativo = sistemaOperativo;
		this.disco = disco;
		this.memoriaram = memoriaram;
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


	public String getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public Almacenamiento getDisco() {
		return disco;
	}


	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}


	public Ram getMemoriaram() {
		return memoriaram;
	}


	public void setMemoriaram(Ram memoriaram) {
		this.memoriaram = memoriaram;
	}


	public Procesador getCpu() {
		return cpu;
	}


	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}


	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", pulgadas=" + pulgadas + ", sistemaOperativo="
				+ sistemaOperativo + ", disco=" + disco + ", memoriaram=" + memoriaram + ", cpu=" + cpu + "]";
	}
	
	
	
	
}
