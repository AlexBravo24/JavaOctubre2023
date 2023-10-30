package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Jabon jabon1 = new Jabon("Downy", " Procter & Gamble ", "liquido", "lavanda", 50);
		
		System.out.println(jabon1);
		
		MultiUsos zote = new MultiUsos("Zote", "Corona", "Barra", "Lima", 20, 200, "Ropa,Cabello,Interiores");
		
		System.out.println(zote);
		
        Ropa ariel =  new Ropa("Ariel", "P&G", "Polvo","Rosas" , 100, "Color", false, false);
        
        System.out.println(ariel);
		
        Shampoo nivea = new Shampoo();
        
       nivea.setAroma("Ice");
       nivea.setMarca("Beiersdorf AG");
       nivea.setNombre("Nivea men");
       nivea.setPersona("Adulto");
       nivea.setPrecio(150);
       nivea.setSexo("Masculino");
       nivea.setTipo("Liquido");
       nivea.setTipoDeCabello("Graso y con caspa");
       nivea.setTipoDeVenta("Farmaceutico");
       
      System.out.println(nivea); 
      
        
	}

}
