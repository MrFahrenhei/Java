package br.fag.edu.lanchonete;

public enum Bread {
	PARMESAO("P�o parmes�o"),
	ITALIANO("P�o italiano branco"),
	GRANOLA("P�o granola");
	
	private String breads;
	
	Bread(String breads){this.breads = breads;}
	public String getInfo() {return breads;}

}
