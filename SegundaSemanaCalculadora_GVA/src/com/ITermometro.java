package com;

public interface ITermometro {

	//Las interfaces son un listado de métodos
	//abstractos y propiedades constantes en caso de ser 
	//necesarias 
	
	//Declaro un método abstracto sin el modificador abstract 
	//Este método va a tener que ser implementado por otra clase
	//Simulando así una multiherencia
	public void tomarTemperatura(); 
	
	public void sound();
	
}
