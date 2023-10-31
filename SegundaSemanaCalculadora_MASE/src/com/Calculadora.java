package com;

public abstract class  Calculadora {
	
	 private String marca;
	    private String color;
	    private double operando1;
	    private double operando2;

	    public Calculadora(String marca, String color, double operando1, double operando2) {
	        this.marca = marca;
	        this.color = color;
	        this.operando1 = operando1;
	        this.operando2 = operando2;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public double getOperando1() {
	        return operando1;
	    }

	    public void setOperando1(double operando1) {
	        this.operando1 = operando1;
	    }

	    public double getOperando2() {
	        return operando2;
	    }

	    public void setOperando2(double operando2) {
	        this.operando2 = operando2;
	    }

	    @Override
	    public String toString() {
	        return "Calculadora [marca=" + marca + ", color=" + color + ", operando1=" + operando1 + ", operando2=" + operando2 + "]";
	    }

	    public double sumar() {
	        return operando1 + operando2;
	    }

	    public double restar() {
	        return operando1 - operando2;
	    }

	    public double multiplicar() {
	        return operando1 * operando2;
	    }

	    public double dividir() {
	        if (operando2 != 0) {
	            return operando1 / operando2;
	        } else {
	            System.out.println("No se puede dividir por cero.");
	            return Double.NaN;
	        }
	    }

}
