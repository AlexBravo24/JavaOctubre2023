package com;

public class Principal {

	public static void main(String[] args) {
		// Ejericio - Crear un objeto de composicion
		//un objeto grande, 
		
		//Concepto de composici�n
				//Podemos tener o crear objetos que formen parte de uno
				//m�s grande
				
				//Primero debemos tener los objetos "peque�os" o que forman
				//parte del mayor
				
				Sdigestivo boca = new Sdigestivo ("dientes", "blanco", "grande");
				Snervioso central = new Snervioso ("Medula espinal", "amarillo", "grande");
				Soseo craneo = new Soseo ("Mandibula", "amarillo", "chico");
				
				CuerpoHumano nombre = new CuerpoHumano("Luis", 50, 'H', boca, central, craneo);
						
				System.out.println(nombre);
	}

}
