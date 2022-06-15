package br.fag.edu.heranca;

public class Empregado extends Pessoa{
	private double salario;
	private String matricula;
	
	public Double calculaINSS() {
		return (getSalario() * 0.11);
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\n" + "Salário: R$"+getSalario() + "\n" +"Matricula: "+getMatricula()+"\nINSS: R$"+calculaINSS());
	}
}

