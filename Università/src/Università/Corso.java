package Università;

import java.util.HashMap;

//importa tutto il package


public class Corso {
	
	//attributi
	private String nome;
	private int ore;
	private HashMap<String, Studente> StudentiIscritti=new HashMap<String,Studente>();
	private HashMap<String, Docente> DocentiCorso=new HashMap<String,Docente>();
	//costruttori
	public Corso() {
		super();
	}

	public Corso(String nome, int ore) {
		super();
		this.nome = nome;
		this.ore = ore;
	}

	
	//metodi
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	@Override
	public String toString() {
		return "Corso nome=" + nome + ", ore=" + ore ;
	}

	public HashMap<String, Studente> getStudentiIscritti() {
		return StudentiIscritti;
	}

	public void setStudentiIscritti(HashMap<String, Studente> studentiIscritti) {
		StudentiIscritti = studentiIscritti;
	}
	
	public void IscriviStudente(Studente s){
		StudentiIscritti.put(s.getMatricola(),s);
	}
	
	public HashMap<String, Docente> getDocentiCorso() {
		return DocentiCorso;
	}

	public void setDocentiCorso(HashMap<String, Docente> docentiCorso) {
		DocentiCorso = docentiCorso;
	}

	public void AggiungiDocente(Docente d){
		DocentiCorso.put(d.getcF(), d);
		
	}
	
	
	
	
	
}
