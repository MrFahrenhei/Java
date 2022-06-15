package br.fag.edu.library;

public class Jornal extends Obra {
	private int qntPag;
	private String frequencia;
	private String escopo;
	
	public Jornal(int idObra, String name, String data, String alvo, String idioma, String tema ,int qntPag, String frequencia, String escopo) {
		super(idObra, name, data, alvo, idioma, tema);
		this.qntPag = qntPag;
		this.frequencia = frequencia;
		this.escopo = escopo;
	}
	
	public int getPaginas() {
		return qntPag;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public String getEscopo() {
		return escopo;
	}
	
	public void setPaginas(int qntPag) {
		this.qntPag = qntPag;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public void setEscopo(String escopo) {
		this.escopo = escopo;
	}

	@Override
	public String toString() {
		return(super.toString() + "\nQuantidade de páginas: " + this.qntPag + " Páginas\nFrequência de publicação: " + this.frequencia + "\nEscopo: "+ this.escopo);
	}
}

