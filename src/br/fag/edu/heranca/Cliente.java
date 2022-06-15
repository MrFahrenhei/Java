package br.fag.edu.heranca;

public class Cliente extends Pessoa{
	
	private double valorDivida;
	private int anoNascimento;
	
	public Cliente(double valorDivida, int anoNascimento) {
		super();
		this.valorDivida = valorDivida;
		this.anoNascimento = anoNascimento;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\nAno de nascimento: "+getAnoNascimento() + "\n");
	}
	
	
}
