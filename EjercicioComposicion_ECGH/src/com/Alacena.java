package com;

public class Alacena {
	private String color;
	private String material;
	private String tama�o;
	
	public Alacena() {}

	public Alacena(String color, String material, String tama�o) {
		super();
		this.color = color;
		this.material = material;
		this.tama�o = tama�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Alacena [color=" + color + ", material=" + material + ", tama�o=" + tama�o + "]";
	}
	
	
	

}
