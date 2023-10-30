package com;

public abstract class Calculadora {
	
	private String marca;
	private int    precio;
	private String tamaño;
    private String color;
	
    public Calculadora() {}
    
    public Calculadora(String marca, int precio, String tamaño, String color) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.tamaño = tamaño;
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
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", precio=" + precio + ", tamaño=" + tamaño + ", color=" + color + "]";
	}
    
    public void  sumar (int a,int b) {
    	  
    	int sumar =a+b;
    	System.out.println(sumar);
    	
    }
    
    	
    public abstract double restar (double numero1,double numero2);
    public abstract double  multiplicar (double numero1,double numero2);
    public abstract double dividir (double numero1,double numero2);
    
    
}
