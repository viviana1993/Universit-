package Biblioteca;



public class Libro {
	
	//attributi libro
private String titolo;
private String autore;
private String serialNumber;
private int copieTot;
private int copieDisp;


// costruttore vuoto

	public Libro() {
	
	}

	//costruttore completo
	public Libro(String titolo,String autore,String serialNumber,int copieTot,int copieDisp) {
		this.setTitolo(titolo);
		this.setAutore(autore);
		this.setSerialNumber(serialNumber);
		this.setCopieTot(copieTot);
		this.setCopieDisp(copieDisp);
	}
	//metodo

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getCopieTot() {
		return copieTot;
	}

	public void setCopieTot(int copieTot) {
		this.copieTot = copieTot;
	}

	public int getCopieDisp() {
		return copieDisp;
	}

	public void setCopieDisp(int copieDisp) {
		this.copieDisp = copieDisp;
	}

	
	

}
