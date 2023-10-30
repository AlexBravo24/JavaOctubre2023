package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejercicio - Crear un objeto de composición
		//Un objeto grande, que tenga como atributo por lo menos otros 3 objetos en el
		
		Procesador proce = new Procesador("SnapDragon", "850x", 16);
		Almacenamiento unidad = new Almacenamiento("Seagate", "Barracuda", "SSD", 128);
		Fisico carcasa = new Fisico(.150, 2, "Rectangulo");
		
		Celular cel = new Celular("Xiaomi", "Note 9s", 5.7, proce, unidad, carcasa);
		
		System.out.println(cel);

	}

}
