package br.fag.edu.lanchonete;

public enum Bread {
	PARMESAO("Pão parmesão"),
	ITALIANO("Pão italiano branco"),
	GRANOLA("Pão granola");
	
	private String breads;
	
	Bread(String breads){this.breads = breads;}
	public String getInfo() {return breads;}

}
