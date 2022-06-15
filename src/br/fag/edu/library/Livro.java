package br.fag.edu.library;

public class Livro extends Obra {
	private String tema;
	private String publicadora;
	private int qntPag;

	public Livro(int idObra, String name, String data, String alvo, String idioma,String tema, String publicadora, int qntPag) {
		super(idObra, name, data, alvo, idioma,tema);
		this.publicadora = publicadora;
		this.qntPag = qntPag;
	}
	
	public String getPublicadora() {
		return publicadora;
	}
	public int getQntPag() {
		return qntPag;
	}
	
	public void setPublicadora(String publicadora) {
		this.publicadora = publicadora;
	}
	public void setQntPag(int qntPag) {
		this.qntPag = qntPag;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\nPublicadora: " + this.publicadora + "\nQuantidade de Páginas: "+ this.qntPag);
	}

}
