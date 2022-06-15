package br.fag.oop;

public class Produto {
	
	private int idProduto;
	private String nameProduto;
	private String tipoProduto;
	private String modeloProduto;
	private Double priceProduto;
	
	public Produto(int idProduto, String nameProduto, String tipoProduto, String modeloProduto, Double priceProduto) 
	{
		this.idProduto = idProduto;
		this.nameProduto = nameProduto;
		this.tipoProduto = tipoProduto;
		this.modeloProduto = modeloProduto;
		this.priceProduto = priceProduto;
	}
	
	public int getId() {
		return idProduto;
	}
	public String getName() {
		return nameProduto;
	}
	public String getType() {
		return tipoProduto;
	}
	public String getModel() {
		return modeloProduto;
	}
	public Double getPrice() {
		return priceProduto;
	}

	public void showInfo()
	{
		System.out.printf("Id do produto: %s \n", this.idProduto);
		System.out.printf("nome do produto: %s \n", this.nameProduto);
		System.out.printf("tipo do produto: %s \n", this.tipoProduto);
		System.out.printf("modelo do produto: %s \n", this.modeloProduto);
		System.out.printf("preço do produto:R$ %s \n", this.priceProduto);
	}
}
