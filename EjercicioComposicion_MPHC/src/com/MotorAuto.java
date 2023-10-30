package com;

public class MotorAuto {
	

	private String tipo;
	private double potencia;
	private String marca;
	private int cilindros;
	private String auto;

	private Anticongelante marcaAnticongelante;
	private Bujias marcaBujias; 
	private Aceite tipoAceite;
	
	
	public MotorAuto() {}


	public MotorAuto(String tipo, double potencia, String marca, int cilindros, String auto,
			Anticongelante marcaAnticongelante, Bujias marcaBujias, Aceite tipoAceite) {
		super();
		this.tipo = tipo;
		this.potencia = potencia;
		this.marca = marca;
		this.cilindros = cilindros;
		this.auto = auto;
		this.marcaAnticongelante = marcaAnticongelante;
		this.marcaBujias = marcaBujias;
		this.tipoAceite = tipoAceite;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getCilindros() {
		return cilindros;
	}


	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}


	public String getAuto() {
		return auto;
	}


	public void setAuto(String auto) {
		this.auto = auto;
	}


	public Anticongelante getMarcaAnticongelante() {
		return marcaAnticongelante;
	}


	public void setMarcaAnticongelante(Anticongelante marcaAnticongelante) {
		this.marcaAnticongelante = marcaAnticongelante;
	}


	public Bujias getMarcaBujias() {
		return marcaBujias;
	}


	public void setMarcaBujias(Bujias marcaBujias) {
		this.marcaBujias = marcaBujias;
	}


	public Aceite getTipoAceite() {
		return tipoAceite;
	}


	public void setTipoAceite(Aceite tipoAceite) {
		this.tipoAceite = tipoAceite;
	}


	@Override
	public String toString() {
		return "MotorAuto [tipo=" + tipo + ", potencia=" + potencia + ", marca=" + marca + ", cilindros=" + cilindros
				+ ", auto=" + auto + ", marcaAnticongelante=" + marcaAnticongelante + ", marcaBujias=" + marcaBujias
				+ ", tipoAceite=" + tipoAceite + "]";
	}




	


}
