package br.fag.edu.lanchonete;

public enum Jeito {
	FRITA("Frita"),
	ASSADA("Assada");
	
	private String jeitos;
	
	Jeito(String jeitos){this.jeitos = jeitos;}
	public String getInfo() {return jeitos;}

}
