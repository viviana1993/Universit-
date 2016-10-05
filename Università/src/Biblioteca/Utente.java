package Biblioteca;



import java.util.ArrayList;
import java.util.List;








public class Utente{
	//attributi
	protected String nome;//mi permette di mostrarlo solo alle classi che derivano da persona (studente e docente)
	protected String cognome;
	private List<Prestito> libriInPrestito=new ArrayList<>();
	
	
	
	
	//costruttore1
public Utente () {
		
	}
//costruttore2

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public Utente (String nome,String cognome) {
	this.setNome(nome);//inserisco il nome e lo assegno all'ogetto come nome
	this.setCognome(cognome);
	
}

public List<Prestito> getLibriInPrestito() {
	return libriInPrestito;
}

public void setLibriInPrestito(List<Prestito> libriInPrestito) {
	this.libriInPrestito = libriInPrestito;
}
public void InserisciPrestito(Prestito p){
	libriInPrestito.add(p);
	
}




}
