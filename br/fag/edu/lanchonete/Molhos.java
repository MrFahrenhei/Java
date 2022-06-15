package br.fag.edu.lanchonete;

public enum Molhos {
	TOMATE("Molho de tomate"),
	PESTO("Molho pesto"),
	ALFREDO("Molho Alfredo"),
	NENHUM("Nenhum molho");
	
	private String molhos;
	
	Molhos(String molhos){this.molhos = molhos;}
	public String getInfo() {return molhos;}

}
