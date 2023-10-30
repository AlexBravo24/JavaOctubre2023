package com;

public class Principal {

	public static void main(String[] args) {
		//Concepto composicion
		
		//Podemos tener o crear objetos que formen parte de uno mas grande
		
		//Primero debemos tener los objeto "Pequeños" o que formen parte del mayor
		
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 400);
		
		Ram ram= new Ram("Adata", "DDR4", 16);
		
		Procesador cpu = new Procesador("Intel", "i5", 3.5);
		
		
		
		Computadora dell = new Computadora("Dell", "Lapto", 15,"Windows 11",disco, ram, cpu);
		
		
		
		System.out.println(dell);

	}

}
