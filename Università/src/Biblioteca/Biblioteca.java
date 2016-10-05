package Biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {


		
		
		//attributi
		private String nome;
		private List<Utente> ListaUtenti=new ArrayList<>();
		private List<Libro> ListaLibri=new ArrayList<>();
		private List<Prestito> ListaPrestiti=new ArrayList<>();
		
		public List<Prestito> getListaPrestiti() {
			return ListaPrestiti;
		}


		public void setListaPrestiti(List<Prestito> listaPrestiti) {
			ListaPrestiti = listaPrestiti;
		}


		//costruttore
		public Biblioteca(){
			
			
		}
		
		
		public Biblioteca(String nome){
			this.setNome(nome);
			
		}

		//metodi
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public List<Utente> getListaUtenti() {
			return ListaUtenti;
		}


		public void setListaUtenti(List<Utente> listaUtenti) {
			ListaUtenti = listaUtenti;
		}


		public List<Libro> getListaLibri() {
			return ListaLibri;
		}


		public void setListaLibri(List<Libro> listaLibri) {
			ListaLibri = listaLibri;
		}
		
		//metodi per inserire libri e utenti
		
		public void InserisciUtente(Utente u1){
			ListaUtenti.add(u1);
			
		}
		public void InserisciLibro(Libro l){
			ListaLibri.add(l);
			
		}

		public void InserisciPrestito(Prestito p){
			ListaPrestiti.add(p);
			
		}

}
