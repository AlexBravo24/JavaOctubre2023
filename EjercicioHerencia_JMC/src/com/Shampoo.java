package com;

public class Shampoo extends Jabon {

	private String TipoDeCabello;
	private String Persona;
	private String Sexo;
	private String TipoDeVenta;
	
	public Shampoo() {}

	public Shampoo(String nombre, String marca, String tipo, String aroma, int precio, String tipoDeCabello,
			String persona, String sexo, String tipoDeVenta) {
		super(nombre, marca, tipo, aroma, precio);
		TipoDeCabello = tipoDeCabello;
		Persona = persona;
		Sexo = sexo;
		TipoDeVenta = tipoDeVenta;
	}

	public String getTipoDeCabello() {
		return TipoDeCabello;
	}

	public void setTipoDeCabello(String tipoDeCabello) {
		TipoDeCabello = tipoDeCabello;
	}

	public String getPersona() {
		return Persona;
	}

	public void setPersona(String persona) {
		Persona = persona;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getTipoDeVenta() {
		return TipoDeVenta;
	}

	public void setTipoDeVenta(String tipoDeVenta) {
		TipoDeVenta = tipoDeVenta;
	}

	@Override
	public String toString() {
		return "Shampoo [TipoDeCabello=" + TipoDeCabello + ", Persona=" + Persona + ", Sexo=" + Sexo + ", TipoDeVenta="
				+ TipoDeVenta + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
