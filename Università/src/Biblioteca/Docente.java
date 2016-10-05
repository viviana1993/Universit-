package Biblioteca;


public class Docente extends Utente{
	
	//attributo in più
	private int stipendio;
	
	//costruttore vuoto
	public Docente(){
		
	}
	
	
	//creo il costruttore con tipi per poter istanziare l'oggetto anche al di fuori della classe con i dati che ho inserito
	public Docente(String nome,String cognome,int stipendio){
		
		super(nome,cognome);
		this.setStipendio(stipendio);
		
		
		}
	//creo il metodo 


	public int getStipendio() {
		return stipendio;
	}


	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}


	@Override
	public String toString() {
		return "Docente "+ nome+" "+cognome+" stipendio=" + stipendio;
				
	}
	
	
}