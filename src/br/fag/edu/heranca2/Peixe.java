package br.fag.edu.heranca2;

public class Peixe extends Animal{

	private String tipoHabitat;
	
	public Peixe(String name, double peso, String tipoHabitat) {
		super(name, peso);
		this.tipoHabitat = tipoHabitat;
	}
	public String getTipoHabitat() {
		return tipoHabitat;
	}
	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
	
	public String toString() {
		return (super.toString() + " \n" + "Habitate: " +this.tipoHabitat);
	}
}
