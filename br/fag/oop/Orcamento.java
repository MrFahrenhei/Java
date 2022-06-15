package br.fag.oop;

import java.util.ArrayList;

public class Orcamento{
	
	private int idOrcamento;
	private Produto produtos;
	private Vendedor vendedor;
	private String Date;
	
	
	public Orcamento(int idOrcamento, Produto produtos, Vendedor vendedor, String date){
		this.idOrcamento = idOrcamento;
		this.produtos = produtos;
		this.vendedor = vendedor;
		this.Date = date;
	}
	
	public int getId() {
		return idOrcamento;
	}
	
	public Produto getProdutos() {
		return produtos;
	}
	
	public Vendedor getVendedores() {
		return vendedor;
	}
	
	public String getDate() {
		return Date;
	}
	
	public void showInfo()
	{
		System.out.printf("Id: %d \n", this.idOrcamento);
		System.out.printf("Produtos: %d \n", this.produtos);
		System.out.printf("Vendedor: %d \n", this.vendedor);
		System.out.printf("Data emissão: %s \n",getDate());
		System.out.println("\n");
	}
	
}