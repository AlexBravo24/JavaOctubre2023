package com;

public class Cocina {
private String tama�o;
private String color;
 
 
 private Estufa estufa;
 private Alacena alacena;
 private Utensilios utensilios;
 
 
 public Cocina() {}


public Cocina(String tama�o, String color, Estufa estufa, Alacena alacena, Utensilios utensilios) {
	super();
	this.tama�o = tama�o;
	this.color = color;
	this.estufa = estufa;
	this.alacena = alacena;
	this.utensilios = utensilios;
}


public String getTama�o() {
	return tama�o;
}


public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public Estufa getEstufa() {
	return estufa;
}


public void setEstufa(Estufa estufa) {
	this.estufa = estufa;
}


public Alacena getAlacena() {
	return alacena;
}


public void setAlacena(Alacena alacena) {
	this.alacena = alacena;
}


public Utensilios getUtensilios() {
	return utensilios;
}


public void setUtensilios(Utensilios utensilios) {
	this.utensilios = utensilios;
}


@Override
public String toString() {
	return "Cocina [tama�o=" + tama�o + ", color=" + color + ", estufa=" + estufa + ", alacena=" + alacena
			+ ", utensilios=" + utensilios + "]";
}
 
 
 
 
 
 
 
 
}
