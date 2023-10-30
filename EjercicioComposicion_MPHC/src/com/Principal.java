package com;

public class Principal {

	public static void main(String[] args) {
		Anticongelante anticongelante = new Anticongelante("AcDelco", "Concentrado", 4.5);

		Bujias bujias = new Bujias("NGK", 4, "Platino");

		Aceite aceite = new Aceite("Castrol sitetico", "5w-30",3.5);

		MotorAuto nissan = new MotorAuto("Gasolina", 1.6, "Nissan", 4, "Versa", anticongelante, bujias, aceite);

		System.out.println(nissan);

	}

}
