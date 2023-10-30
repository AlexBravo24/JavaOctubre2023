package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejercicio Calculadora
		
		Cientifica calculadora1 = new Cientifica();
		calculadora1.setColor("Negro");
		calculadora1.setMarca("Casio");
		calculadora1.setModelo("FX-991EX");
		
		calculadora1.sumar(2, 2.5);
		calculadora1.restar(5, 1);
		calculadora1.multiplicar(3, 3);
		calculadora1.dividir(5, 2);
		
		calculadora1.tomarTemperatura();
	}

}
