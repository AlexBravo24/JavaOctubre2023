package com;
//Para implementar lo metodos de una interface 
//lo hacemos con la palabra reservada  "implements" y el nombre de la 
// interface

public class Cientifica extends Calculadora implements ITemperatura, IVolar {
	
	public Cientifica(String marca, String color, double operando1, double operando2) {
        super(color, color, operando2, operando2);
    }

	
    @Override
    public double sumar() {
        return getOperando1() + getOperando2();
    }

    public double restar() {
        return getOperando1() - getOperando2();
    }

  

	@Override
    public double multiplicar() {
        return getOperando1() * getOperando2();
    }

    @Override
    public double dividir() {
        if (getOperando2() != 0) {
            return getOperando1() / getOperando2();
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }


	@Override
	public void volar() {
		// TODO Auto-generated method stub
		
	}


	public static void tomarTemperatura() {
		// TODO Auto-generated method stub
		
	}


	public static void tomarTemperatura(String string) {
		// TODO Auto-generated method stub
		
	}

}
