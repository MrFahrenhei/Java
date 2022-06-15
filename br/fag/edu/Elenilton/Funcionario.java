package br.fag.edu.Elenilton;

public class Funcionario extends Pessoa {

	private double salario;
	private String matricula;

	public void reajustarSalario(double percentual) {
		double reajuste;
		reajuste = salario * percentual;
		salario = salario + reajuste;
	}

	// *** Sobrecarga de método.
	public void reajustarSalario(double percentual, String matricula) {
		double reajuste;
		reajuste = salario * percentual;
		salario = salario + reajuste;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


}
