package com.ciclos;

public class Ciclos7_RVV {

	public static void main(String[] args) {
		double i = 700.00; 
        double t = 0.02; 
        double o=1500.00;
        int m = 0;

        while(i<o) {
        	i=i+(i*t);
        	m++;
        }
        
        System.out.println("En "+m+" meses tendras $"+o+" o mas");
	}

}
