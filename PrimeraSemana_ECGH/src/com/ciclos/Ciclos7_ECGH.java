package com.ciclos;

public class Ciclos7_ECGH {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. 
		//¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
double inv=700;
int i=0;
	do{
		inv=inv+inv*0.02;
		i++;		
	}while(inv<1500);
	
	System.out.println("Tendras más de 1500 en "+i+" meses y tendras la cantidad de $"+inv);
	
	
	}

}
