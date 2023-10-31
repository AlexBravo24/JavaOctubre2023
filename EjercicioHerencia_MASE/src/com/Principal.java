package com;

public class Principal {
	
	public static void main(String[] args) {
		
	
	Animal animal1 = new Animal("Ferry", "Carnivoro", "Mamifero");
	 System.out.println(animal1);
	 
	 
	 
	 
	 Perro  perro= new Perro("Schnauzer", 5, "Plata");
	 
	 perro.setNombre("Ferry");
	 perro.setColor("Plata");
	 perro.setEdad(5);
	 perro.setRaza("Schnauzer");
	 perro.setTipo("Mamifero");
	 perro.setEspecie("perro");
	 
	 System.out.println(perro);
	 
	 
	 Gato gato= new Gato("Luna", 2, "blanco");
	 gato.setNombre("Luna");
	 gato.setEdad(2);
	 gato.setRaza("siamès");
	 gato.setTipo("Mamifero");
	 gato.setEspecie("Gato");
	 
	 System.out.println(gato);
	 
	 
	
	 perro.comer("el perro come croquetas");
	 gato.comer("el gato come Whiskas", 5);
	 perro.sonido();
	 System.out.println(perro.sonido());
	 gato.sonido();
	 System.out.println(gato.sonido1());
	 
	 
}
}