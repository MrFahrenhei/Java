package br.fag.edu.lanchonete;

public class Pizza extends Produto{
	private String bordas;
	private String molhos;
	private String recheio;

	public Pizza(String nome, Double price, String validade, Double peso, String bordas, String molhos, String recheio) {
		super(nome, price, validade, peso);
		this.bordas = bordas;
		this.molhos = molhos;
		this.recheio = recheio;
	}
	
	public String getBordas() {
		return bordas;
	}
	public String getMolhos() {
		return molhos;
	}
	public String getRecheio() {
		return recheio;
	}
	
	public void setBordas(String bordas) {
		this.bordas = bordas;
	}
	public void setMolhos(String molhos) {
		this.molhos = molhos;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nBorda: " + this.bordas + "\nMolhos: " + this.molhos + "\nRecheio: " + this.recheio);
	}

}