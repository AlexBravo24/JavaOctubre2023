package com;

public class Principal {

	public static void main(String[] args) {
		//Ejercicio - Crear un objeto de composici�n
		//Un objeto grande, que tenga como atributos por lo menos
		//otros 3 objetos en �l
		
		//Concepto de composici�n
		//Propiedades tener o crear objetos que formen parte de uno
		//m�s grande
		
		//Primero debemos tener los objetos "peque�os" o que forman
		//parte del mayor
		
		EfectoSonido Acustica = new EfectoSonido ("potencia de la onda de un sonido", 20000,"nivel moderado");
		Divisi�n�tomos F�sicaNuclear = new Divisi�n�tomos ("cero", -0.00000000000000000016, 0.00000000000000000016);
		PropiedadesLuz �ptica = new PropiedadesLuz (500, 1, "Difusa");
		
		
		Fisica Cl�sica = new Fisica ("Estudia movimiento y fuerzas",
		"Estudio de los fenomenos Electricos y magneticos",
		"Estudia los fenomenos vinculados a la temperatura", Acustica, �ptica, F�sicaNuclear);
		
		System.out.println(Cl�sica);
		
		
	}

}
