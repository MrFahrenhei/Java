package br.fag.edu.library;

public class Aluno 
{
	private int idAluno;
	private String nome;
	private int cpf;
	private String endereco;

	public Aluno(int idAluno, String nome, int cpf, String endereco) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public String endereco() {
		return endereco;
	}

	public void showInfo() {
		System.out.printf("Id Aluno: %s \n", this.idAluno);
		System.out.printf("Nome do aluno: %s \n", this.nome);
		System.out.printf("Cpf: %s \n", this.cpf);
		System.out.printf("Endereço: %s \n", this.endereco);
	}
}
