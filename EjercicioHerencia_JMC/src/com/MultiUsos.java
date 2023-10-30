package com;

public class MultiUsos extends Jabon {
	
  private int pesoGmOKilos;
  private String Usos;
    
  public MultiUsos() {}

public MultiUsos(String nombre, String marca, String tipo, String aroma, int precio, int pesoGmOKilos, String usos) {
	super(nombre, marca, tipo, aroma, precio);
	this.pesoGmOKilos = pesoGmOKilos;
	Usos = usos;
}

public int getPesoGmOKilos() {
	return pesoGmOKilos;
}

public void setPesoGmOKilos(int pesoGmOKilos) {
	this.pesoGmOKilos = pesoGmOKilos;
}

public String getUsos() {
	return Usos;
}

public void setUsos(String usos) {
	Usos = usos;
}

@Override
public String toString() {
	return "MultiUsos [pesoGmOKilos=" + pesoGmOKilos + ", Usos=" + Usos + ", toString()=" + super.toString() + "]";
}
  
  
  
  

}
