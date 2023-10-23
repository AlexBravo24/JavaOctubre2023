package com.ciclos;

public class Ciclos6_RVV {

	public static void main(String[] args) {
		double Inversion = 1000.00; 
        double t = 0.02;  
        int m = 12; 
       
        double $=Inversion;
        for(int a=0; a<m; a++){
        	$=$+($*t);
        }
        
        System.out.println("Monto al final de 12 meses "+$);
	}

}
