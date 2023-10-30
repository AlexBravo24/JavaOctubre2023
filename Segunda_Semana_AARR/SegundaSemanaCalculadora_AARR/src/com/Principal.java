package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero1, numero2, resultado=0;
		
		System.out.println("calculadora sencilla, ingrese los 2 numeros");
		numero1 = entrada.nextDouble();
		numero2 = entrada.nextDouble();
		
		Cientifica casio = new Cientifica();
		
		casio.setMarca("casio");
		casio.setModelo("Modelo 2000");
		casio.setColor("Negro");
		casio.setPeso(100);
		casio.setNumero1(numero1);
		casio.setNumero2(numero2);
		casio.setResultado(resultado);
		
		System.out.println(casio);
		
		casio.suma();
		casio.restar();
		casio.multiplicar();
		casio.dividir();
		casio.tomarTemperatura();
		casio.volar();
	
		
	}

}
