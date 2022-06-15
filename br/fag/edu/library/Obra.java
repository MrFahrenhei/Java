package br.fag.edu.library;

public class Obra
{
	private int idObra;
	private String name;
	private String data;
	private String alvo;
	private String idioma;
	private String tema;
	
	public Obra(int idObra, String name, String data, String alvo, String idioma, String tema){
		this.idObra = idObra;
		this.name = name;
		this.data = data;
		this.alvo = alvo;
		this.idioma = idioma;
		this.tema = tema;
	}
	
	public int getId() {
		return idObra;
	}
	public String getName() {
		return name;
	}
	public String getData() {
		return data;
	}
	public String getAlvo(){
		return alvo;
	}
	public String getIdioma() {
		return idioma;
	}
	public String getTema() {
		return tema;
	}
	
	
	public void setId(int idObra) {
		this.idObra = idObra;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setAlvo(String alvo) {
		this.alvo = alvo;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public String toString() {
		return("Id da obra: " + getId() + "\nNome: "+getName()+"\nData cadastro: "+getData()+"\nPúblico Alvo: "+getAlvo()+"\nIdioma: "+getIdioma()+"\nTema: "+getTema());
	}
}
