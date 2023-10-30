package com;

public class Principal {

	public static void main(String[] args) {
		
		// concepto de composicion
		//podemos tener o crear objetos que formen parte de uno
		//mas grande
		
		//primero debemos tener los objetos peque�os o que forman
		//parte del mayor
		
		Almacenamiento disco=new Almacenamiento("Kingston", "SSD", 480);
		Ram ram=new Ram("corsair", "DDR4", 16);
		Procesador cpu=new Procesador("intel", "i5", 3.5);
		
		Computadora hp =new Computadora("HP", "laptop", 15, "windows 11", disco, ram, cpu);
		
		System.out.println(hp);
	}

}
