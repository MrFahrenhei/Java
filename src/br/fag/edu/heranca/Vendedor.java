package br.fag.edu.heranca;

public class Vendedor extends Empregado {
	private double valorComissao;
	
	public double getValorComissao() {
		return valorComissao;
	}
	
	public void setValorComissao(Double valorComissao) {
		this.valorComissao = valorComissao;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\n" + "Valor de Comissão: R$"+getValorComissao() + "\n");
	}

}
