package com.ciclos;

public class Ciclos6_JRMM {

	public static void main(String[] args) {
		
		/*6.- Una persona desea invertir $1000.00 en un banco,
		 *el cual le otorga un 2% de inter�s mensual.
		 *�Cu�l ser� la cantidad de dinero que esta persona
		 *tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		 */
		double interes = 1000, total;
		
		for(int i = 1; i <= 12; i++) {
			interes = interes + (interes * 0.02);
			System.out.println(i + ".- " + interes);
		}
	}

}
