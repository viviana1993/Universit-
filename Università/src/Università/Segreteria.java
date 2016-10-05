package Universit�;

import Biblioteca.*;

public class Segreteria {


	//metodo1
	public Studente registraStudente (Universit� u, String nome, String cognome){
		return u.inserisciStudente(nome, cognome);	
	}


	//metodo2

	public Docente registraDocente(Universit� u, String nome, String cognome, String cF){
		Docente d=new Docente(nome,cognome,cF);
		if(u.inserisciDocente(d)!=null)
			return d;
		System.out.println("Docente gi� esistente ");
		return null;

	}

	//metodo3

	public Corso registraCorso(Universit� u, String nome, int ore){
		Corso c=new Corso(nome,ore);
		if(u.inserisciCorso(c)!=null)return c;
		System.out.println("Corso gi� esistente ");
		return null;
	}



	//metodo4
	public boolean aggiungiStudAlCorso(Universit� u, Studente s, Corso c){
		boolean registrazione=false;
		if(u.getListaStudenti().containsKey(s.getMatricola())&& u.getListaCorsi().containsKey(c.getNome())&&!c.getStudentiIscritti().containsKey(s.getMatricola()) )
		{
			u.getListaCorsi().get(c.getNome()).IscriviStudente(s);
			registrazione=true;
		}

		return registrazione;
	}

	//metodo5

	public boolean aggiungiDocAlCorso(Universit� u, Docente d, Corso c){
		boolean registr=false;
		if(u.getListaDocente().containsKey(d.getcF())&&u.getListaCorsi().containsKey(c.getNome())&&!c.getDocentiCorso().containsKey(d.getcF()))
		{
			u.getListaCorsi().get(c.getNome()).AggiungiDocente(d);
			registr=true;
		}
		return registr;
	}
	//metodo6
	public boolean prestaLibro(Universit� u, Studente s, Libro L){
		boolean prestito=false;
		
		if(u.prestaLibro(L, s)) prestito=true;
		return prestito;
		
	}
	
	

}
