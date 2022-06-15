package br.fag.oop;

public class Vendedor {
	
	private int idVendedor;
	private String nameVendedor;
	
	public Vendedor(int idVendedor, String nameVendedor) 
	{
		this.idVendedor = idVendedor;
		this.nameVendedor = nameVendedor;
	}
	
	public int getId() {
		return idVendedor;
	}
	public String getName() {
		return nameVendedor;
	}
	
	public void showInfo()
	{
		System.out.printf("Id Vendedor: %d \n", this.idVendedor);
		System.out.printf("Nome do Vendedor: %s \n", this.nameVendedor);
	}

}
