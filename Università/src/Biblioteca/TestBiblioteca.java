package Biblioteca;


public class TestBiblioteca {

	public static void main(String[] args) {
		
		//Creo degli oggetti
		Gestione g=new Gestione();
		Biblioteca b=new Biblioteca("alfa");
		Libro l=new Libro("aaaa","bbbb","555674",4,3);
		
		
		Utente u=new Utente("Viviana","Vacirca");
		
		
		g.registraLibro(b,"aaaa","bbbb","555674",4);
		g.registraLibro(b,"cccc","ddd","55567777",3);
		g.registraLibro(b,"aaaa","bbbb","555674",3);
		System.out.println("Biblioteca: "+b.getNome()+"\nLibri: "+b.getListaLibri().size());
		//N.B.per stampare le liste serve il ciclo for
		for(Libro l1:b.getListaLibri()){
			System.out.println(l1.getTitolo()+" "+l1.getAutore()+" "+l1.getSerialNumber()+" "+l1.getCopieDisp()+" "+l1.getCopieTot());
			
		}
		
		
		
		
		g.registraUtente(b,u.getNome(),u.getCognome());
		g.registraUtente(b,"Pasquale ","Ruocco");
		g.registraUtente(b,"Pasquale ","Ruocco");
		System.out.println("\nUtenti: "+b.getListaUtenti().size());
		
		for(Utente u1:b.getListaUtenti()){
			System.out.println(u1.getNome()+" "+u1.getCognome());
			
		}
		
        
		g.prestaLibro(b,u.getNome(),u.getCognome(),l.getTitolo(),l.getAutore());
		
		
		System.out.println("PRESTITO");
		for(Utente u2:b.getListaUtenti()){
			
			System.out.println("Utente: "+u2.getNome()+" "+u2.getCognome()+"\nLibri in prestito: "+u2.getLibriInPrestito().size());
			
			for(Prestito p:u2.getLibriInPrestito()){
				System.out.println(p.getL().getTitolo()+" "+p.getL().getAutore()+" copieDisp: "+p.getL().getCopieDisp()+" copieTot: "+p.getL().getCopieTot()+" NS: "+p.getL().getSerialNumber()+p.getData());
			}
			
		}
		g.restituisciLibro(b,u.getNome(), u.getCognome(), l.getTitolo(),l.getAutore());
		System.out.println("restituzione");
for(Utente u3:b.getListaUtenti()){
			
			System.out.println("Utente: "+u3.getNome()+" "+u3.getCognome()+"\nLibri in prestito: "+u3.getLibriInPrestito().size());
			
			for(Prestito p1:u3.getLibriInPrestito()){
				System.out.println(p1.getL().getTitolo()+" "+p1.getL().getAutore()+" copieDisp: "+p1.getL().getCopieDisp()+" copieTot: "+p1.getL().getCopieTot()+" NS: "+p1.getL().getSerialNumber()+p1.getData());
			}
		
}
	}
    
	
}

