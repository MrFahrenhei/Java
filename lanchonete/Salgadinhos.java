package br.fag.edu.lanchonete;

public class Salgadinhos extends Produto {
	private String tipo;
	private String massas;
	private String recheios;
	

	public Salgadinhos(String nome, Double price, String validade, Double peso, String tipo, String massas, String recheios) {
		super(nome, price, validade, peso);
		this.tipo = tipo;
		this.massas = massas;
		this.recheios = recheios;
	}
	
	public String getTipo() {
		return tipo;
	}
	public String getMassas() {
		return massas;
	}
	public String getRecheios() {
		return recheios;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMassas(String massas) {
		this.massas = massas;
	}
	public void setRecheios(String recheios) {
		this.recheios = recheios;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nTipo: " + this.tipo + "\nMassas: " + this.massas + "\nRecheio: " + this.recheios);
	}

}
