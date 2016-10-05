package Biblioteca;





public class Studente extends Utente{
	
	//attributo in più
	private double media;
	
	
	//costruttore vuoto
	public Studente(){
		
	}
	
	
	public Studente(String nome, String cognome) {
		super(nome,cognome);
	}


	//creo il costruttore con tipi per poter istanziare l'oggetto anche al di fuori della classe con i dati che ho inserito
	public Studente(String nome,String cognome,String matricola,double media,int contatore){
		
		super(nome,cognome);
		this.media=media;
		
		
		}
	//creo il metodo get set


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}
	//altro metodo
	@Override
	
	public String toString(){
		
		return nome+" "+cognome+" ha una media del "+media;
		
	}


	
	
					

		}
