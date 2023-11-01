package com;

public class Clase {
	
	private String clase;
	private String habilidad;
	private int manainicial;
	private int hpinicial;
	private String armaprincipal;
	private String evolucion;
	
	public Clase() {}

	public Clase(String clase, String habilidad, int manainicial, int hpinicial, String armaprincipal,
			String evolucion) {
		super();
		this.clase = clase;
		this.habilidad = habilidad;
		this.manainicial = manainicial;
		this.hpinicial = hpinicial;
		this.armaprincipal = armaprincipal;
		this.evolucion = evolucion;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getManainicial() {
		return manainicial;
	}

	public void setManainicial(int manainicial) {
		this.manainicial = manainicial;
	}

	public int getHpinicial() {
		return hpinicial;
	}

	public void setHpinicial(int hpinicial) {
		this.hpinicial = hpinicial;
	}

	public String getArmaprincipal() {
		return armaprincipal;
	}

	public void setArmaprincipal(String armaprincipal) {
		this.armaprincipal = armaprincipal;
	}

	public String getEvolucion() {
		return evolucion;
	}

	public void setEvolucion(String evolucion) {
		this.evolucion = evolucion;
	}

	@Override
	public String toString() {
		return "Clase [clase=" + clase + ", habilidad=" + habilidad + ", manainicial=" + manainicial + ", hpinicial="
				+ hpinicial + ", armaprincipal=" + armaprincipal + ", evolucion=" + evolucion + "]";
	}
	
	

}
