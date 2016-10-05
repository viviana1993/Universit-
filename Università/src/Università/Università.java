package Università;


import java.util.HashMap;




import Biblioteca.*;
public class Università {
	
	//attributi
	private String nome;
	private HashMap<String,Studente> ListaStudenti=new HashMap<String,Studente>();
	private HashMap<String,Docente> ListaDocente=new HashMap<String,Docente>();
	private HashMap<String,Corso> ListaCorsi=new HashMap<String,Corso>();
	private Biblioteca b;
	private Gestione g;
	//costrttori
	public Università() {
		super();
	}

	public Università(String nome) {
		super();
		this.nome = nome;
	}
	
	//metodi

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashMap<String,Studente> getListaStudenti() {
		return ListaStudenti;
	}

	public void setListaStudenti(HashMap<String,Studente> listaStudenti) {
		ListaStudenti = listaStudenti;
	}

	public HashMap<String,Docente> getListaDocente() {
		return ListaDocente;
	}

	public void setListaDocente(HashMap<String,Docente> listaDocente) {
		ListaDocente = listaDocente;
	}

	public HashMap<String,Corso> getListaCorsi() {
		return ListaCorsi;
	}

	public void setListaCorsi(HashMap<String,Corso> listaCorsi) {
		ListaCorsi = listaCorsi;
	}
	
	
	
	//metodo per generare matricola
	private String assegnaMatricola(String nome,String cognome,int contatore){
		
		String matricola=nome.substring(0, 3)+cognome.substring(0, 3)+Integer.toString(contatore);//converto contatore da "int" a "string"
			return matricola;
		}
	
	//metodo per inserire studente alla lista studenti
	public Studente inserisciStudente(String nome,String cognome){
		Studente s=new Studente(nome,cognome);
		s.setContatore(ListaStudenti.size());
		s.setMatricola(assegnaMatricola(nome, cognome,s.getContatore()));
		ListaStudenti.put(s.getMatricola(), s);
		
		g.registraUtente(b, s.getNome()+" "+s.getCognome(), s.getMatricola());
		return s;
		
	}
	//metodo per inserire docente alla lista docenti
	public Docente inserisciDocente(Docente d){
		if(ListaDocente.containsKey(d.getcF()))return null;
		ListaDocente.put(d.getcF(), d);
		return d;
	}
	//metodo per inserire corso alla lista corsi
	
	public Corso inserisciCorso(Corso c){
		if(ListaCorsi.containsKey(c.getNome()))return null;
		ListaCorsi.put(c.getNome(), c);
		return c;
	}

	

	public Biblioteca getB() {
		return b;
	}

	public void setB(Biblioteca b) {
		this.b = b;
	}

	public Gestione getG() {
		return g;
	}

	public void setG(Gestione g) {
		this.g = g;
	}
	public boolean prestaLibro(Libro l,Studente s){
		boolean ris=false;
		ris=g.prestaLibro(b,s.getNome()+" "+s.getCognome(),s.getMatricola(),l.getTitolo(),l.getAutore());
		return ris;
	}
}
