package br.fag.edu.Elenilton;

public class Gerente extends Funcionario{

	private int tempoDeEmpresa;

	public int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}

	public void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}

	public void reajustarSalario(double percentual){
		double percentual_bonus;
		percentual_bonus = 0.1 * this.tempoDeEmpresa;
		super.reajustarSalario(percentual + percentual_bonus);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
