package com;

public class Principal {

	public static void main(String[] args) {
		
		
		
		// Concepto de composicion
		//Podemos tener o crear objetos que formen parte de uno màs grande
		
		//Primero debemos tener los objetos màs pequeños o que formen parte del mayor
		
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
	    Ram ram = new Ram("ADATA", "DDR4", 16);
	    Procesador CPU = new Procesador("Intel", "i5", 3.5);
	    
	    Computadora dell = new Computadora("Dell", "Laptop", 15, "Windows 11", disco, ram, CPU);
		
	    System.out.println(dell);

	}

}
