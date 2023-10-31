package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Cientifica Calculadora = new Cientifica("Casio", "Negra", 25, 50);

	        System.out.println("Calculadora: " + Calculadora);
	        System.out.println("Suma: " + Calculadora.sumar());
	        System.out.println("Resta: " + Calculadora.restar());
	        System.out.println("Multiplicación: " + Calculadora.multiplicar());
	        System.out.println("División: " + Calculadora.dividir());
	    
     Cientifica.tomarTemperatura("Temperatura normal");
	}

}
