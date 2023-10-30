package com;

public class Principal {

	public static void main(String[] args) {
		Estufa estufa=new Estufa("Negro", "4 hornillas", "mabe");
		Alacena alacena=new Alacena("cafe", "madera", "pequeña");
		Utensilios sarten=new Utensilios("Sarten", "Verde con detalles", "Aluminio");
		
		Cocina cocina=new Cocina("2.5*2.1*2.5", "Blanco", estufa, alacena, sarten);
		
		System.out.println(cocina);
		
		

	}

}
