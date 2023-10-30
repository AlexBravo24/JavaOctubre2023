package com;

public class Cocina {
private String tamaño;
private String color;
 
 
 private Estufa estufa;
 private Alacena alacena;
 private Utensilios utensilios;
 
 
 public Cocina() {}


public Cocina(String tamaño, String color, Estufa estufa, Alacena alacena, Utensilios utensilios) {
	super();
	this.tamaño = tamaño;
	this.color = color;
	this.estufa = estufa;
	this.alacena = alacena;
	this.utensilios = utensilios;
}


public String getTamaño() {
	return tamaño;
}


public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
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
	return "Cocina [tamaño=" + tamaño + ", color=" + color + ", estufa=" + estufa + ", alacena=" + alacena
			+ ", utensilios=" + utensilios + "]";
}
 
 
 
 
 
 
 
 
}
