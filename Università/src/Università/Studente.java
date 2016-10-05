package Università;


public class Studente extends Biblioteca.Studente{
	//attributi
	private String matricola;
	private int contatore;
	
	//costruttori
	public Studente() {
		
	}


	public Studente(String nome,String cognome) {
		super(nome,cognome);
		
	}
	
	public Studente(String nome,String cognome,String matricola) {
		
		super(nome,cognome);
		this.matricola=matricola;
	}


	public Studente(String nome,String cognome,String matricola, int contatore) {
		super(nome,cognome);
		this.matricola = matricola;
		this.contatore = contatore;
	}


	public String getMatricola() {
		return matricola;
	}


	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}


	public int getContatore() {
		return contatore;
	}


	public void setContatore(int contatore) {
		
		this.contatore = contatore;
	}


	@Override
	public String toString() {
		return "Studente matricola=" + matricola + ", contatore=" + contatore
				+ ", nome=" + nome + ", cognome=" + cognome ;
	}
	  
	
	
	
	
	 
	
}
