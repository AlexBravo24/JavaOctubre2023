package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Combustible tipC = new Combustible("Boeing", "Turbosina", 737);

		Motor tipomotor = new Motor("Ge Avianton", "Turbohelice", 1);
		
		Pasajeros numPas = new Pasajeros("Boeing", "comercial", 180);
		
		Aeronaves comercial = new Aeronaves("Boeing", "Comercial", "AeroMexico", tipC, tipomotor, numPas);
	
	
	System.out.println(comercial);
	
	
	}
	
	

}
