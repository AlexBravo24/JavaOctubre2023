package com;

public class Computadora {
	
	private String marca;
	private String tipo;
	private double pulgadas;
	private String sistemaOp;
	
	
	//vamos a crear estos atributos como objetos
	//que tambien van a formar parte de nuestra computadora
	private Almacenamiento disco;
	private Ram memoriaram;
	private Procesador cpu;
	
	public Computadora() {}

	public Computadora(String marca, String tipo, double pulgadas, String sistemaOp, Almacenamiento disco,
			Ram memoriaram, Procesador cpu) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.pulgadas = pulgadas;
		this.sistemaOp = sistemaOp;
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

	public String getSistemaOp() {
		return sistemaOp;
	}

	public void setSistemaOp(String sistemaOp) {
		this.sistemaOp = sistemaOp;
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
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", pulgadas=" + pulgadas + ", sistemaOp=" + sistemaOp
				+ ", disco=" + disco + ", memoriaram=" + memoriaram + ", cpu=" + cpu + "]";
	}
	
	

}
