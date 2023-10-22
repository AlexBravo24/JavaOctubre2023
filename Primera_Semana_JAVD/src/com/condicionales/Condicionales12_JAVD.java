
//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

//Valor de IMC                           Diagnóstico
// <16                      Criterio de Ingreso en Hospital
//de 16 a 17                  Infrapeso
//de 17 a 18                  Bajo Peso
//de 18 a 25                  Peso Normal (Saludable)
//de 25 a 30                  Sobrepeso (Obecidad grado I)
//de 30 a 35                  Sobrepeso Crónico (Obesidad de Grado II)
//de 35 a 40                  Obesidad Premórbida (Obesidad de grado III)
// >40                      Obesidad Mórbida (Obesidad de grado IV)

//Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben
//ser introducidos por teclado por el usuario.

package com.condicionales;

import java.util.Scanner;

public class Condicionales12_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double p,a,imc,a2;
		
		System.out.println("Ingresa tu peso en kg:");
		p=in.nextDouble();
		System.out.println("Ingresa tu altura en m:");
		a=in.nextDouble();
		
		a2=a*a;
		imc=p/a2;
		
		System.out.println("------------DIAGNÓSTICO------------");
		
		if(imc<16) {
			System.out.println("Criterio de Ingreso en Hospital");
		}
		else if(imc>=16 && imc<17) {
			System.out.println("Infrapeso");
		}
		else if(imc>=17 && imc<18) {
			System.out.println("Bajo Peso");
		}
		else if(imc>=18 && imc<25) {
			System.out.println("Peso Normal (Saludable)");
		}
		else if(imc>=25 &&imc<30) {
			System.out.println("Sobrepeso (Obecidad grado I)");
		}
		else if(imc>=30 &&imc<35) {
			System.out.println("Sobrepeso Crónico (Obesidad de Grado II)");
		}
		else if(imc>=35 &&imc<40) {
			System.out.println("Obesidad Premórbida (Obesidad de grado III)");
		}
		else{
			System.out.println("Obesidad Mórbida (Obesidad de grado IV)");
		}

	}

}