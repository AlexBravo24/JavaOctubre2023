package com.Ciclos;

public class Ciclos6_JMC {

	public static void main(String[] args) {
		//  Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
	//	mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
	//	todo el dinero lo reinvierte?

      float dinero=1000;
      
      for (int i=1;i<=12;i++) { 	  
      
       dinero =dinero+(dinero/100*2);
       
       
       
      }
  
		System.out.println("El dinero que tienes en el banco es:"+dinero);
	}

}
