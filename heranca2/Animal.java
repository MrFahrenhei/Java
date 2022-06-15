package br.fag.edu.heranca2;

public class Animal 
{
	private String name;
	private double peso;
	
	public Animal(String name, double peso) 
	{
		this.name = name;
		this.peso = peso;
	}
	public String getName() {
		return name;
	}
	public double getPeso() {
		return peso;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return ("Nome: " + getName() + "\n" + "Peso: Kg "+getPeso());
	}
	
}
