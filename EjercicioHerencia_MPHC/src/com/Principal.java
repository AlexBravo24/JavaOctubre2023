package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Playera playera1 = new Playera();
		
		playera1.setNombre("Playera");
		playera1.setTalla("M");
		playera1.setdepartamento("Hombres");
		playera1.setMarca("Levis");
		playera1.setColor("Blanaca");
		playera1.setTipo("Polo");
		playera1.setPrecio(399);
		
		
		System.out.println(playera1);
		
		
		
		Chamarra chamarra1 = new Chamarra();
		
		chamarra1.setNombre("Chammarra");
		chamarra1.setTalla("L");
		chamarra1.setdepartamento("Mujeres");
		chamarra1.setMarca("American Eagle");
		chamarra1.setColor("Negra");
		chamarra1.setMaterial("Mezclilla");
		chamarra1.setPrecio(1199.90);
		
		
		System.out.println(chamarra1);

	}

}
