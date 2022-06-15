package br.fag.edu.library;

public class Quadrinhos extends Obra{
	private String tema;
	private String publicadora;
	
	public Quadrinhos(int idObra, String name, String data, String alvo, String idioma, String tema, String publicadora) {
		super(idObra, name, data, alvo, idioma, tema);
		this.tema = tema;
		this.publicadora = publicadora;
	}
	
	public String getPublicadora() {
		return publicadora;
	}

	public void setPublicadora(String publicadora) {
		this.publicadora = publicadora;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\nPublicadora: " + this.publicadora);
	}
	
}

