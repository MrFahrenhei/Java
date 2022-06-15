package br.fag.edu.library;

public class Filme extends Obra{
	private int tempo;
	private String produtora;
	
	public Filme(int idObra, String name, String data, String alvo, String idioma, String tema, int tempo,String produtora) {
		super(idObra, name, data, alvo, idioma, tema);
		this.tempo = tempo;
		this.produtora = produtora;
	}
	 
	public int getTempo() {
		return tempo;
	}
	public String getProdutora() {
		return produtora;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	  
	@Override
	public String toString() {
		return(super.toString() + "\nDuração: " + this.tempo + "Min\nProdutora: "+ this.produtora);
	}
}
