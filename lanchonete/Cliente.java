package br.fag.edu.lanchonete;

public class Cliente {
	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


	public String toString() {
		return ("Nome: " + getNome());
	}
}
