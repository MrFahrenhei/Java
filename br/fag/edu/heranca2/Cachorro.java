package br.fag.edu.heranca2;

public class Cachorro extends Animal{

	private String race;
	private String corDoPelo;
	
	public Cachorro(String name, double peso, String race, String corDoPelo) {
		super(name, peso);
		this.race = race;
		this.corDoPelo = corDoPelo;
	}
	public String getRace() {
		return race;
	}
	public String getCorDoPelo() {
		return corDoPelo;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	
	public static void latir() {
		System.out.println("Latiu");
	}
	public static void abanar() {
		System.out.println("Abanou o rabo");
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nRaça: " + this.race + "\nCor do pelo: " + this.corDoPelo);
	}

}

