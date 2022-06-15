package br.fag.edu.lanchonete;

public enum Bordas {
	QUEIJO("Borda de queijo"),
	CHEDDAR("Borda de cheedar"),
	CATUPIRI("Borda de catupiri"),
	NENHUM("Nenhuma Borda");
	
	private String bords;
	
	Bordas(String bords){this.bords = bords;}
	public String getInfo() {return bords;}
	
}
