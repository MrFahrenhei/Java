package br.fag.edu.Elenilton;

public class Pessoa {

	private String nome;
	private String rg;
	private String cpf;
	private String logradouroDescricao;
	private String logradouroNumero;
	private String bairro;
	private String cidade;
	private String estado;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogradouroDescricao() {
		return logradouroDescricao;
	}
	public void setLogradouroDescricao(String logradouroDescricao) {
		this.logradouroDescricao = logradouroDescricao;
	}
	public String getLogradouroNumero() {
		return logradouroNumero;
	}
	public void setLogradouroNumero(String logradouroNumero) {
		this.logradouroNumero = logradouroNumero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	private String getEndereco() {
		return logradouroDescricao + " " + logradouroNumero;
	}


	// Sobrescrita de método
	@Override
	public String toString() {
		return nome + " " + getEndereco();
	}

}
