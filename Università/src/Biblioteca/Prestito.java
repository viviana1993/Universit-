package Biblioteca;

import java.util.Date;

public class Prestito {

	private Date data;
	private Utente u;
	private Libro l;
	
//costruttore
	
	
	

	public Prestito(Date data, Utente u, Libro l) {
	super();
	this.data = data;
	this.u = u;
	this.l = l;
}
	
	
	
	public Prestito() {
	super();
}
	
	
	
	
	//metodi
	public Utente getU() {
		return u;
	}
	public void setU(Utente u) {
		this.u = u;
	}

	public Libro getL() {
		return l;
	}

	public void setL(Libro l) {
		this.l = l;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
