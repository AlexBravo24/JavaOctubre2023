package com;

//Para implenmentar las metodos de una interface lo hacemos con la palabra reservada "Implements" y el nombre de la interface
public class Cientifica extends Calculadora implements ITermometro, IVolar {

	@Override
	public double suma(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double resta(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplicacion(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public void tomaTemperatura() {
		// TODO Auto-generated method stub
		
	}

}
