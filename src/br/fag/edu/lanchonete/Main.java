package br.fag.edu.lanchonete;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("José");
		Cliente cliente2 = new Cliente("Buiu");
		Cliente cliente3 = new Cliente("Patriki");
		
		Produto pizza1 = new Pizza("Pizza Salgada 4 queijo", 14.90, "14/06/2022", 0.50, Bordas.QUEIJO.getInfo(), Molhos.TOMATE.getInfo(), Recheio.QUEIJO.getInfo());
		System.out.println(pizza1);
		pizza1.criarProduto();
		System.out.println("\n");
		Produto lanche1 = new Lanches("Sanduiche ixe de bacon", 12.50, "15/06/2022", 0.20, Bread.ITALIANO.getInfo(), Recheio.BACON.getInfo(), Molhos.NENHUM.getInfo());
		//System.out.println(lanche1);
		//System.out.println("\n");
		Produto salgado1 = new Salgadinhos("Coxinha mil graude de queijo", 5.0, "19/07/2022", 1.2, Jeito.FRITA.getInfo(), Massas.MANDIOCA.getInfo(), Recheio.CATUPIRI.getInfo());
		//System.out.println(salgado1);
		//System.out.println("\n");
		Pedido pedido1 = new Pedido(cliente1, pizza1, 12.0 ,Pagamento.DINHEIRO.getInfo(), (pizza1.getPrice()+12.0));
		System.out.println(pedido1);
		pedido1.gerarNotaFiscal();
		System.out.println("\n");
		Pedido pedido2 = new Pedido(cliente2, lanche1, 12.0, Pagamento.DINHEIRO.getInfo(), (lanche1.getPrice()+12.0));
		System.out.println(pedido2);
		pedido2.gerarNotaFiscal();
		System.out.println("\n");
		Pedido pedido3 = new Pedido(cliente3, salgado1, 12.0, Pagamento.CARTAO.getInfo(), (salgado1.getPrice()+12.0));
		System.out.println(pedido3);
		pedido3.gerarNotaFiscal();
		
	}

}