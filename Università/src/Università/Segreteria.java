package Università;

import Biblioteca.*;

public class Segreteria {


	//metodo1
	public Studente registraStudente (Università u, String nome, String cognome){
		return u.inserisciStudente(nome, cognome);	
	}


	//metodo2

	public Docente registraDocente(Università u, String nome, String cognome, String cF){
		Docente d=new Docente(nome,cognome,cF);
		if(u.inserisciDocente(d)!=null)
			return d;
		System.out.println("Docente già esistente ");
		return null;

	}

	//metodo3

	public Corso registraCorso(Università u, String nome, int ore){
		Corso c=new Corso(nome,ore);
		if(u.inserisciCorso(c)!=null)return c;
		System.out.println("Corso già esistente ");
		return null;
	}



	//metodo4
	public boolean aggiungiStudAlCorso(Università u, Studente s, Corso c){
		boolean registrazione=false;
		if(u.getListaStudenti().containsKey(s.getMatricola())&& u.getListaCorsi().containsKey(c.getNome())&&!c.getStudentiIscritti().containsKey(s.getMatricola()) )
		{
			u.getListaCorsi().get(c.getNome()).IscriviStudente(s);
			registrazione=true;
		}

		return registrazione;
	}

	//metodo5

	public boolean aggiungiDocAlCorso(Università u, Docente d, Corso c){
		boolean registr=false;
		if(u.getListaDocente().containsKey(d.getcF())&&u.getListaCorsi().containsKey(c.getNome())&&!c.getDocentiCorso().containsKey(d.getcF()))
		{
			u.getListaCorsi().get(c.getNome()).AggiungiDocente(d);
			registr=true;
		}
		return registr;
	}
	//metodo6
	public boolean prestaLibro(Università u, Studente s, Libro L){
		boolean prestito=false;
		
		if(u.prestaLibro(L, s)) prestito=true;
		return prestito;
		
	}
	
	

}
