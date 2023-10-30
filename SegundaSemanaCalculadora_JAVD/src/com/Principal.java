package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calc = new Cientifica();
		calc.setMarca("CASIO");
		calc.setColor("Gris");
		calc.setTipo("Normal");
		System.out.println(calc);
		
		System.out.println("----------Operaciones básicas---------");
		System.out.println(calc.suma(23, 24));
		System.out.println(calc.resta(50, 25));
		System.out.println(calc.multi(4, 4));
		System.out.println(calc.div(45, 9));
		
		calc.tomarTemperatura();
		calc.volar();
		calc.sound();
		

	}

}
