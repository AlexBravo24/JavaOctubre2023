package com;

public class Ba�o {

	private double AlturaMetros;
	private double AnchoMetros;
	private double LargoMetros;
	
	
	private Retrete Taza;
	private LavaManos lavabo;
	private Ducha Regadera;
	

	public Ba�o() {}


	public Ba�o(double alturaMetros, double anchoMetros, double largoMetros, Retrete taza, LavaManos lavabo,
			Ducha regadera) {
		super();
		AlturaMetros = alturaMetros;
		AnchoMetros = anchoMetros;
		LargoMetros = largoMetros;
		Taza = taza;
		this.lavabo = lavabo;
		Regadera = regadera;
	}


	public double getAlturaMetros() {
		return AlturaMetros;
	}


	public void setAlturaMetros(double alturaMetros) {
		AlturaMetros = alturaMetros;
	}


	public double getAnchoMetros() {
		return AnchoMetros;
	}


	public void setAnchoMetros(double anchoMetros) {
		AnchoMetros = anchoMetros;
	}


	public double getLargoMetros() {
		return LargoMetros;
	}


	public void setLargoMetros(double largoMetros) {
		LargoMetros = largoMetros;
	}


	public Retrete getTaza() {
		return Taza;
	}


	public void setTaza(Retrete taza) {
		Taza = taza;
	}


	public LavaManos getLavabo() {
		return lavabo;
	}


	public void setLavabo(LavaManos lavabo) {
		this.lavabo = lavabo;
	}


	public Ducha getRegadera() {
		return Regadera;
	}


	public void setRegadera(Ducha regadera) {
		Regadera = regadera;
	}


	@Override
	public String toString() {
		return "Ba�o [AlturaMetros=" + AlturaMetros + ", AnchoMetros=" + AnchoMetros + ", LargoMetros=" + LargoMetros
				+ ", Taza=" + Taza + ", lavabo=" + lavabo + ", Regadera=" + Regadera + "]";
	}
	
	
	
}
