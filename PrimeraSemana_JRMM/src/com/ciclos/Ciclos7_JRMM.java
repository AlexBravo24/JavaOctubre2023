package com.ciclos;

public class Ciclos7_JRMM {

	public static void main(String[] args) {

		/*7- Una persona desea invertir $700.00 en un banco,
		 *el cual le otorga un 2% de interés mensual.
		 *¿En cuántos meses tendrá más de $1500,
		 *si reinvierte cada mes todo su dinero?
		 */
		double inversion = 700.00, interes = 0.02;
		int contador = 0;
		
		while(inversion <= 1500) {
			inversion = inversion + (inversion * interes);
			System.out.println(contador + ".- " + inversion);
			contador++;
		}
		System.out.println("===========================");
		System.out.println(contador + ".- " + inversion);

	}

}
