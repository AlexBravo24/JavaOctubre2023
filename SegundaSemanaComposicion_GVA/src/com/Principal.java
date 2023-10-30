package com;

public class Principal {

	public static void main(String[] args) {
		
		//Concepto de composici�n 
		//Podemos tener o crear objetos que formen parte de uno 
		//m�s grade
		
		//Primero debemos tener los objetos "peque�os" o que forman 
		//parte del mayor 
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Ram memoriaRam = new Ram("Adata", "DDR4", 16);
		Procesador cpu = new Procesador("Intel", "i5", 3.5);
		
		Computadora dell = new Computadora("Dell", "Laptop", 15, "Windows 11", disco, memoriaRam, cpu);

		System.out.println(dell);
	}

}
