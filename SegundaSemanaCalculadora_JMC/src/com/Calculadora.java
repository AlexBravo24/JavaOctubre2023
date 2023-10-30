package com;

public abstract class Calculadora {
	
	private String marca;
	private int    precio;
	private String tama�o;
    private String color;
	
    public Calculadora() {}
    
    public Calculadora(String marca, int precio, String tama�o, String color) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.tama�o = tama�o;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
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
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", precio=" + precio + ", tama�o=" + tama�o + ", color=" + color + "]";
	}
    
    public void  sumar (int a,int b) {
    	  
    	int sumar =a+b;
    	System.out.println(sumar);
    	
    }
    
    	
    public abstract double restar (double numero1,double numero2);
    public abstract double  multiplicar (double numero1,double numero2);
    public abstract double dividir (double numero1,double numero2);
    
    
}
