package Università;

import Biblioteca.Biblioteca;
import Biblioteca.*;




public class TestUniversità {

	public static void main(String[] args) {
		Gestione g=new Gestione();
		Biblioteca b=new Biblioteca("alfa");
		Libro lx=new Libro("aaaa","bbbb","555674",4,4);
		
		
		
		
		
		g.registraLibro(b,"aaaa","bbbb","555674",4);
		g.registraLibro(b,"cccc","ddd","55567777",3);
		g.registraLibro(b,"aaaa","bbbb","555674",3);
		System.out.println("Biblioteca: "+b.getNome()+"\nLibri: "+b.getListaLibri().size());
		//N.B.per stampare le liste serve il ciclo for
		for(Libro l1:b.getListaLibri()){
			System.out.println(l1.getTitolo()+" "+l1.getAutore()+" "+l1.getSerialNumber()+" "+l1.getCopieDisp()+" "+l1.getCopieTot());
			
		}
		Università u=new Università("politecnico");
		u.setB(b);
		u.setG(g);
		
		Segreteria s=new Segreteria();
		
		s.registraStudente(u, "Viviana","Vacirca");
		
		s.registraStudente(u, "paki","Vacirca");
		s.registraStudente(u, "paki","ruocco");


		System.out.println("Università= "+u.getNome());
		System.out.println("Studenti= ");


		for(Studente sx:u.getListaStudenti().values()){

			System.out.println(sx.toString());
		}


		s.registraDocente(u, "Marco", "Bassani", "aaabbb11m");
		s.registraDocente(u, "Marco", "Bassani", "aaabbb11m");
		s.registraDocente(u, "davide", "dalmazo", "ffff55hfgj");
		System.out.println("Docenti= ");


		for(Docente d:u.getListaDocente().values()){

			System.out.println(d.toString());
		}

		s.registraCorso(u, "idraulica", 300);
		s.registraCorso(u, "idraulica", 300);
		s.registraCorso(u, "analisi",80);
	for(Corso c:u.getListaCorsi().values()){

		System.out.println(c.toString());
	}
	Studente s1=new Studente("Viviana","Vacirca","VivVac0");
	Studente s2=new Studente("paki","ruocco","pakruo3");
	
	Corso c1=new Corso("idraulica", 300);
	Corso c2=new Corso("analisi",80);
	Docente d1=new Docente("Marco", "Bassani", "aaabbb11m");
	Docente d2=new Docente("davide", "dalmazo", "ffff55hfgj");
	s.aggiungiStudAlCorso(u, s1,c1 );
	s.aggiungiStudAlCorso(u, s2, c2);
	
	for(Corso cx:u.getListaCorsi().values()){
		System.out.println(cx.getNome()+" Iscritti: ");
		for(Studente sy:cx.getStudentiIscritti().values()){
			System.out.println(sy.toString());
		}
		
	}
	s.aggiungiDocAlCorso(u, d1, c1);
	s.aggiungiDocAlCorso(u, d2, c2);
	for(Corso cx:u.getListaCorsi().values()){
		System.out.println(cx.getNome()+" Docenti: ");
		for(Docente dy:cx.getDocentiCorso().values()){
			System.out.println(dy.toString());
		}
		
	}
	s.prestaLibro(u, s1,lx);
	
	
	for(Utente ud:b.getListaUtenti()){
		System.out.println("Studente : "+ud.getNome()+" "+ud.getCognome());
		for(Prestito l:ud.getLibriInPrestito()){
			System.out.println("Libro "+l.getL().getTitolo()+" "+l.getL().getAutore());
		}
		
	}
	
	}
	}
