package br.fag.edu.library;

public class Revista extends Obra{
	private String publicadora;
	private int qntPag;
	private String frequencia;

	public Revista(int idObra, String name, String data, String alvo, String idioma, String tema, String publicadora, int qntPag, String frequencia) {
		super(idObra, name, data, alvo, idioma, tema);
		this.publicadora = publicadora;
		this.qntPag = qntPag;
		this.frequencia = frequencia;
	}
	

	public String getPublicadora() {
		return publicadora;
	}
	public int getPaginas() {
		return qntPag;
	}
	public String getFrequencia() {
		return frequencia;
	}
	

	public void setTempo(String publicadora) {
		this.publicadora = publicadora;
	}
	public void setPaginas(int qntPag) {
		this.qntPag = qntPag;
	}
	public void setFrquencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\nPublicadora: " + this.publicadora + "\nQuantidade de Páginas: "+ this.qntPag+"\nFrequência de publicação: "+this.frequencia);
	}
}
