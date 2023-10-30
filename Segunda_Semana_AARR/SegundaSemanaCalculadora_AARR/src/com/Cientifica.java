package com;

//para implementar metodos de una interface lo hacemos con la palabra reservada "implements" 
//y el nombre de la interface
public class Cientifica extends Calculadora implements ITermometro, IVolar {
	
	private double resultado;
	private double numero1;
	private double numero2;
	
	public Cientifica()
	{
		
	}

	



	public Cientifica(String marca, String modelo, String color, int peso, double resultado, double numero1,
			double numero2) {
		super(marca, modelo, color, peso);
		this.resultado = resultado;
		this.numero1 = numero1;
		this.numero2 = numero2;
	}




	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	@Override
	public String toString() {
		return "Cientifica [resultado=" + resultado + ", numero1=" + numero1 + ", numero2=" + numero2 + ", toString()="
				+ super.toString() + "]";
	}
	
	@Override
	public void suma() {
		System.out.println("La suma es: "+(resultado=numero1+numero2));		
	}	
	public void restar() {
		System.out.println("La resta es: "+(resultado=numero1-numero2));
	}
	public void multiplicar() {
		System.out.println("La multiplicacion es: "+(resultado=numero1*numero2));
	}
	public void dividir() {
		System.out.println("La division es: "+(resultado=numero1/numero2));
	}





	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando temperatura = normal 36°C");
		
	}





	@Override
	public void volar() {
		System.out.println("Volando a mach 1");
		
	}}

//Existe la multiherencia en Java? 
//R: no, pero puede ser simulada por el uso de interfaces

//De donde toman u obtienen comportamientos los objetos? (comportamiento es una funcion o metodo)
//R: ultimo lugar de las interfaces, de otras clases o clases padre, ya sean abstractas o no y en primer lugar de si mismos



	
