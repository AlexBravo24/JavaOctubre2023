package com.ciclos;

public class Ciclos3_GVA {

	public static void main(String[] args) {
		//3. Realiza un programa para determinar si un String es un palíndromo.
		
		 String original = "Anita lava la tina";
	        String invertida = "";
	        String verdad ;
	        
	        for (int i = original.length() - 1; i >= 0; i--) {
	            invertida += original.charAt(i);
	        }
	        
	        System.out.println("Cadena original: " + original);
	        System.out.println("Cadena invertida: " + invertida);
		
	        if (original.replace(" ","").equalsIgnoreCase(invertida.replace(" ",""))){
	        	System.out.println("La palabra si es palíndromo");
	        } else {
	        	System.out.println("La palabra no es palíndromo");
	        	
	        }

	}

}
