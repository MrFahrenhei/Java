package br.fag.oop;

public class Pedido 
{
	private int idPedido;
	private Cliente cliente;
	private int quant;
	private Orcamento orcamento;
	private String Date;
	
	public Pedido(int idPedido, Cliente cliente, int quant, Orcamento orcamento, String date)
	{
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.quant = quant;
		this.orcamento = orcamento;
		this.Date = date;
	}
	
	public int getId() {
		return idPedido;
	}
	public Cliente getCliente() {
		return cliente;
		
	}
	public int getQuant() {
		return quant;
	}
	public Orcamento getOrcamento() {
		return orcamento;
	}
	public String getDate() {
		return Date;
	}
}