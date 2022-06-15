package br.fag.edu.lanchonete;

public class Pedido implements PedidoInterface{
	private Cliente cliente;
	private Produto produto;
	private Double taxServico;
	private String pagamento;
	private Double precoFinal;
	
	public Pedido(Cliente cliente, Produto produto, Double taxServico, String pagamento, Double precoFinal) {
		this.cliente = cliente;
		this.produto = produto;
		this.taxServico = taxServico;
		this.pagamento = pagamento;
		this.precoFinal = precoFinal;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public Double getTaxServico() {
		return taxServico;
	}
	public String getPagamento() {
		return pagamento;
	}
	public Double getPrecoFinal() {
		return precoFinal;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setTaxServico(Double taxServico) {
		this.taxServico = taxServico;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public void setPrecoFinal(Double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	@Override
	public void gerarNotaFiscal(){
		System.out.println("Nota gerada com sucesso!!");
	}
	
	public String toString() {
		return ("Pedido: \n"+"Cliente: \n"+getCliente() + "\nProduto: \n" + getProduto() + "\nTaxa de serviço: " + getTaxServico() + "\nPagamento: "+getPagamento()+"\nPreço Total: R$"+getPrecoFinal());
	}

}
