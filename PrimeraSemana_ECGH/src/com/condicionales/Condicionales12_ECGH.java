package com.condicionales;

import java.util.Scanner;

public class Condicionales12_ECGH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	    double peso;
		double altura;
		double imc=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu peso");
		peso=entrada.nextDouble();
		System.out.println("Introduce tu altura");
		altura=entrada.nextDouble();
		imc=peso/(altura*altura);
		System.out.println("Tu IMC es: "+imc);
		
		
		if(imc<16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if(imc>=16 && imc<17) {
			System.out.println("Infrapeso");
		}else if(imc>=17 && imc<18) {
			System.out.println("Bajo peso");
		}else if(imc>=18 &&imc<25) {
			System.out.println("Peso normal (saludable)");
		}else if(imc>=25 &&imc<30) {
			System.out.println("Sobrepeso(obesidad de grado I)");
		}else if(imc>=30 && imc<35) {
			System.out.println("Sobrepeso crónico (obesidad de grado II)");
		}else if(imc>=35 && imc<40) {
			System.out.println("Obesidad premórbida(obesidad de grado III)");
		}else {
			System.out.println("Obesidad mórbida(obesidad de grado IV)");
		}
	
	
	
	
	
	
	
	
	}

}
