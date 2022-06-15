package br.fag.edu.lanchonete;

public enum Massas {
	TRIGO("Massa de trigo"),
	MANDIOCA("Massa de mandioca");
	
	private String massas;
	
	Massas(String massas){this.massas = massas;}
	public String getInfo() {return massas;}
}