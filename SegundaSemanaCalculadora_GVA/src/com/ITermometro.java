package com;

public interface ITermometro {

	//Las interfaces son un listado de m�todos
	//abstractos y propiedades constantes en caso de ser 
	//necesarias 
	
	//Declaro un m�todo abstracto sin el modificador abstract 
	//Este m�todo va a tener que ser implementado por otra clase
	//Simulando as� una multiherencia
	public void tomarTemperatura(); 
	
	public void sound();
	
}
