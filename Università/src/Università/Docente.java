package Università;

public class Docente extends Biblioteca.Utente{
	//attributi
	private String cF;
	//costruttori

	public Docente() {
		super();
	}
	public Docente(String nome,String cognome,String cF) {
		super(nome,cognome);
		this.cF = cF;
	}
	
	//metodi
	public String getcF() {
		return cF;
	}
	public void setcF(String cF) {
		this.cF = cF;
	}
	@Override
	public String toString() {
		return "Docente: nome=" + nome + ", cognome=" + cognome+ ", cF=" + cF;
	}
	
	
	

	
	
	
}
