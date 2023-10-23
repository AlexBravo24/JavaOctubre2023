package com.ciclos;

public class Ciclos3_ELP {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo. 
	       
	    String original = "Anita lava la tina";
        String invertida = "";
        String verdad ;
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena invertida: " + invertida);
	
      
       
        if (original.replace(" ","").equalsIgnoreCase(invertida.replace(" ",""))){
        	System.out.println("la palabra si es palindromo");
        }
        
        else {
        	System.out.println("la palabra no es palindromo");
        	
        }
        
	}

}