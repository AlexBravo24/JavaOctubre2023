package com;

public class Ropa extends Jabon {

    private String tipodeRopa;
    private boolean ConSuavizante;
    private boolean ConBicarbonato;
	
    public Ropa() {}

	public Ropa(String nombre, String marca, String tipo, String aroma, int precio, String tipodeRopa,
			boolean conSuavizante, boolean conBicarbonato) {
		super(nombre, marca, tipo, aroma, precio);
		this.tipodeRopa = tipodeRopa;
		ConSuavizante = conSuavizante;
		ConBicarbonato = conBicarbonato;
	}

	public String getTipodeRopa() {
		return tipodeRopa;
	}

	public void setTipodeRopa(String tipodeRopa) {
		this.tipodeRopa = tipodeRopa;
	}

	public boolean isConSuavizante() {
		return ConSuavizante;
	}

	public void setConSuavizante(boolean conSuavizante) {
		ConSuavizante = conSuavizante;
	}

	public boolean isConBicarbonato() {
		return ConBicarbonato;
	}

	public void setConBicarbonato(boolean conBicarbonato) {
		ConBicarbonato = conBicarbonato;
	}

	@Override
	public String toString() {
		return "Ropa [tipodeRopa=" + tipodeRopa + ", ConSuavizante=" + ConSuavizante + ", ConBicarbonato="
				+ ConBicarbonato + ", toString()=" + super.toString() + "]";
	}

    
    
    
    
    
    
}
