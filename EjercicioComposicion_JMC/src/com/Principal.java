package com;

public class Principal {

	public static void main(String[] args) {
	  
		
		Retrete inodoro = new Retrete(1, "Castel venus","Grande" , 2500);
		LavaManos economico = new LavaManos("senna", "Acero Inoxidable", 800, "Chico");
		Ducha duchaDelluvia = new Ducha("Dovebi",1, 400);
		
		
		Ba�o ba�o1 = new Ba�o(2.5,3.5,5.2, inodoro, economico, duchaDelluvia);
		
		
		System.out.println(ba�o1);
		
		System.out.println(ba�o1.getRegadera() );
		System.out.println(duchaDelluvia.getMarca());
		
	}

}
