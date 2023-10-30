package com;

public class Direcci�n {

	//Variable de clase
	private String calle;
	private int numero;
	private int codigoPostal;
	private String localidad;
    private String provincia;
	
    //Constructores
    public Direcci�n () {}

	public Direcci�n(String calle, int numero, int codigoPostal, String localidad, String provincia) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	
	
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	
	
	
	}

	@Override
	public String toString() {
		return "Direcci�n [calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", localidad="
				+ localidad + ", provincia=" + provincia + "]";
	}
    
    
    
}
