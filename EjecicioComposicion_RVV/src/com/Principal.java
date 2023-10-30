package com;

public class Principal {

	public static void main(String[] args) {

		Personaje personaje=new Personaje("Esteban", "Castaño", 1.90, "humano", "adiestramiento animal", "espada");
		Clase clase=new Clase("Caballero", "Valor", 25, 120, "Espada", "Caballero de elite");
		Atributos atributos=new Atributos(10, 175, 200, 45, 75, 60, 10, 1);
		
		VideoJuego videojuego=new VideoJuego("Tibia", "perengano", "ceteq", personaje, clase, atributos);
		
		System.out.println(videojuego);
		

	}

}
