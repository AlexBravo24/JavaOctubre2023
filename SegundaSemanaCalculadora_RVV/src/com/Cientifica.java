package com;

//para implementar los metodos de una interface
//lo hacemos con la palabra reservada "implements"
//y el nombre de la interface
public class Cientifica extends Calculadora implements ITermometro, IVolar {
	
	
	private String celdasolar ;
	
		
	public Cientifica() {}

	
	
	public Cientifica(String marca, String color, String forma, String celdasolar) {
		super(marca, color, forma);
		this.celdasolar = celdasolar;
	}

	@Override
	public double multiplicar(double operando1, double operando2) {
		double resultado=operando1*operando2;
//		System.out.println("multiplica "+resultado);
		return resultado;
	}

	@Override
	public double dividir(double operando1, double operando2) {
		double resultado=operando1/operando2;
		if(operando2==0) {
			System.out.println("todo numero divido entre 0 es 0");
		
		}
//		System.out.println("dividir "+resultado);
		return resultado;
		
//		return 0;
	}
	

	@Override
	public void sumar(double operando1, double operando2) {
		double resultado=operando1+operando2;
		System.out.println("sumar "+resultado);
		
	}

	@Override
	public void restar(double operando1, double operando2) {
		double resultado=operando1-operando2;
		System.out.println("restar "+resultado);
		
	}



	@Override
	public void tomartemperatura() {
		System.out.println("tomando temperatura = normal 36�C");
				
	}



	@Override
	public void volar() {
		System.out.println("volando");
		
	}



	@Override
	public void sound() {
		System.out.println("pipip");
		
	}
	
	
	//de donde obtienen compostamientos los objetos?
	/*metodos propios
	 * de otras clases
	 * interfaces
	 */
	

}