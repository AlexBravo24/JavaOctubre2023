package com;

public class Principal {

	public static void main(String[] args) {
		//Ejercicio - Crear un objeto de composición
		//Un objeto grande, que tenga como atributos por lo menos
		//otros 3 objetos en él
		
		//Concepto de composición
		//Propiedades tener o crear objetos que formen parte de uno
		//más grande
		
		//Primero debemos tener los objetos "pequeños" o que forman
		//parte del mayor
		
		EfectoSonido Acustica = new EfectoSonido ("potencia de la onda de un sonido", 20000,"nivel moderado");
		Divisiónátomos FísicaNuclear = new Divisiónátomos ("cero", -0.00000000000000000016, 0.00000000000000000016);
		PropiedadesLuz Óptica = new PropiedadesLuz (500, 1, "Difusa");
		
		
		Fisica Clásica = new Fisica ("Estudia movimiento y fuerzas",
		"Estudio de los fenomenos Electricos y magneticos",
		"Estudia los fenomenos vinculados a la temperatura", Acustica, Óptica, FísicaNuclear);
		
		System.out.println(Clásica);
		
		
	}

}
