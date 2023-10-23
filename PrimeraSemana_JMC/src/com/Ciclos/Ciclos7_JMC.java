package com.Ciclos;

public class Ciclos7_JMC {

	public static void main(String[] args) {
//		7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
//		dinero?
		float dinero=700;
		int contador=1;
				
		
		while(dinero<1500) {
		contador++;
       dinero= dinero+(dinero/100*2);
       
       
       dinero= dinero+700;
		
			
	}
	 System.out.println("En el mes "+contador+"  tendras mas de 1500");
}
}