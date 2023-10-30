package com;

public class Principal {

	public static void main(String[] args) {
		
		Parametros datos = new Parametros(null, 2300, 140, 180);
		System.out.println(datos);
		
		Prota heroe = new Prota("Javier", 18490, 5200, 8000, "Masculino", "Humano", "Caballero");
		Arma excalibur = new Arma("Mata Dragones", 3000, 800, 700, "Espada larga", "Plateada", "Mithril");
		
		System.out.println("--------------HEROES Y DRAGONES--------------");
		System.out.println(heroe);
		System.out.println(excalibur);
				
	}

}
