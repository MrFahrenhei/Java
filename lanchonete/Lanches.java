package br.fag.edu.lanchonete;

public class Lanches extends Produto {
	private String bread;
	private String recheios;
	private String molho;

	public Lanches(String nome, Double price, String validade, Double peso, String bread, String recheios, String molho) {
		super(nome, price, validade, peso);
		this.bread = bread;
		this.recheios = recheios;
		this.molho = molho;
	}
	
	public String getBread() {
		return bread;
	}
	public String getRecheio() {
		return recheios;
	}
	public String getMolho() {
		return molho;
	}
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setRecheio(String recheios) {
		this.recheios = recheios;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nPão: " + this.bread + "\nRecheios: " + this.recheios + "\nMolho: " + this.molho);
	}
}
