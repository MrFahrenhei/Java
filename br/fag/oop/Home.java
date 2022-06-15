package br.fag.oop;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Home {

	public static Scanner entry = new Scanner(System.in);

	private static int idcliente = 0;
	private static int idproduto = 0;
	private static int idvendedor = 0;
	private static int idorcamento = 0;
	private static int idpedido = 0;

	private static DateTimeFormatter agoraData = DateTimeFormatter.ofPattern("dd/mm/yy HH:mm");
	private static NumberFormat money_formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	private static ArrayList<Cliente> clientList = new ArrayList<Cliente>();
	private static ArrayList<Produto> productList = new ArrayList<Produto>();
	private static ArrayList<Vendedor> sellerList = new ArrayList<Vendedor>();
	private static ArrayList<Orcamento> budgetList = new ArrayList<Orcamento>();
	private static ArrayList<Produto> addProducts = new ArrayList<Produto>();
	private static ArrayList<Pedido> pedidoList = new ArrayList<Pedido>();

	public static void main(String[] args) {
		menu();
	}

	private static void nota() {
		for (Pedido indexPedido : pedidoList) {
			System.out.println("ID do pedido: " + indexPedido.getId());
			System.out.println("Cliente do pedido: ");
			indexPedido.getCliente().showBasic();
			;
			System.out.println("//////////////////////////////");
			System.out.println("Produtos do Orçamento do pedido: ");
			indexPedido.getOrcamento().getProdutos().showInfo();
			System.out.println("//////////////////////////////");
			System.out.println("Vendedor que fez o Orçamento: ");
			indexPedido.getOrcamento().getVendedores().showInfo();
			System.out.println("//////////////////////////////");
			System.out.println("Data emissão do pedido: " + indexPedido.getDate());
		}
		System.out.println("Digite a data de entrega: ");
		String dataEntrega = entry.next();
		System.out.println("Entrega será feita até: " + dataEntrega);
		System.out.println("\n");
	}

	private static void pedido() {
		idpedido++;
		int idPedido = idpedido;
		if (clientList.size() == 0) {
			System.out.println("Nao tem cliente cadastrado, cadastre um ai: ");
			theClient();
		}

		String dataPedido = agoraData.format(LocalDateTime.now());

		Cliente clienteSelected = null;
		System.out.println("Id do cliente");
		boolean coisas = false;
		while (!coisas) {
			int idPedida = entry.nextInt();
			for (Cliente cliente : clientList) {
				if (idPedida >= 0 && idPedida <= clientList.size()) {
					clienteSelected = clientList.get(idPedida - 1);
					coisas = true;
				}
			}
		}

		int quant = addProducts.size();
		Orcamento orcamentoSelected = null;

		System.out.println("Id do Orçamentos");
		boolean selectao = false;
		while (!selectao) {
			int idPedida2 = entry.nextInt();
			for (Orcamento orcamento : budgetList) {
				if (idPedida2 >= 0 && idPedida2 <= budgetList.size()) {
					orcamentoSelected = budgetList.get(idPedida2 - 1);
					selectao = true;
				}
			}
		}

		Pedido pedido = new Pedido(idPedido, clienteSelected, quant, orcamentoSelected, dataPedido);
		pedidoList.add(pedido);

		nota();

	}

	private static void theBudget() {
		idorcamento++;
		int idOrcamento = idorcamento;
		if (productList.size() == 0) {
			System.out.println("Não tem produto, cadastra um ai: ");
			theProduct();
		}
		if (sellerList.size() == 0) {
			System.out.println("Não tem vendedor, cadastra um ai: ");
			theSeller();
		}
		

		String dataOrcamento = agoraData.format(LocalDateTime.now());

		System.out.println("Escolha qual é o funcinário pela ID: ");
		for (Vendedor vendedor : sellerList) {
			System.out.println("ID do vendedor: " + vendedor.getId());
			System.out.print("Nome do vendedor: " + vendedor.getName() + "\n");
		}

		Vendedor vendedorPuxar = searchSeller();

		System.out.println("Escolha qual é o produto pela ID: ");
		for (Produto produto : productList) {
			System.out.println("ID do Produto: " + produto.getId());
			System.out.println("Nome do Produto: " + produto.getName());
			System.out.println("Tipo de produto: " + produto.getType());
			System.out.println("Modelo de produto: " + produto.getModel());
			System.out.println("Preço do produto: R$" +produto.getPrice() + "\n");
		}
		
			System.out.println("Qual produto tu quer (digite a id):");
			searchProduct();
			System.out.println("1: Adicionar mais um \n2: sair");
			int treco = entry.nextInt();
			boolean ancoraAddProd = false;
				while (!ancoraAddProd) {
				if (treco == 1) {
					ancoraAddProd = false;
					searchProduct();
				} else if (treco == 2) {
					System.out.println("Certeza? (digite 1)");
					ancoraAddProd = true;
					break;
				
			}
			
		}
		Produto produtoSelected = searchProduct();

		Orcamento orcamento = new Orcamento(idOrcamento, produtoSelected, vendedorPuxar, dataOrcamento);

		budgetList.add(orcamento);

		boolean toContinue = false;
		while (!toContinue) {
			System.out.println("Escolha no menu");
			System.out.println("1: Finalizar \n2: quero fazer o pedido\n3: Deletar Orçamento\n4: Editar orçamento");
			String endOrNot = entry.nextLine();
			switch(endOrNot) {
			case "1":
				menu();
				toContinue = true;
			break;
			case "2":
				pedido();
				toContinue = true;
			break;
			case "3":
				System.out.println("Para deletar o orçamento, digite a ID do mesmo: ");
				int idRemover = entry.nextInt();
				if (idRemover >= 0 && idRemover <= budgetList.size()) {
					budgetList.remove(idRemover - 1);
					System.out.println("Sucesso!");
					menu();
				} else {
					System.out.println("Não existe esse produto para deletar\n");
				}
				toContinue = true;
				System.out.println(budgetList.size());
				toContinue = true;
			break;
			case "4":
				System.out.println("Digite a id do orçamento para editar:");
				int idChosed = entry.nextInt();

				if (idChosed >= 0 && idChosed <= budgetList.size()) {
					System.out.println("1: Editar o Vendedor\n");
					int switchProduct = entry.nextInt();
					switch (switchProduct) {
					case 1:
						System.out.println("Digite a id do vendedor: ");
						int altera = entry.nextInt();
						for (Vendedor vendedor : sellerList) {
							if (Integer.valueOf(altera).equals(vendedor.getId()))
								;
							int idVendedor = sellerList.indexOf(orcamento);
							break;
						}
						break;
					}
				}
				toContinue = true;
			break;
			}
		}
	}

	private static Cliente searchClient() {
		System.out.println("Selecionar um cliente por ID");
		int idSelectedClient = entry.nextInt();

		Cliente clientSelected = null;

		if (idSelectedClient >= 0 && idSelectedClient <= clientList.size()) {
			clientSelected = clientList.get(idSelectedClient - 1);
		} else {
			System.out.println("Não existe esse cliente\n");
			searchClient();
		}

		return clientSelected;
	}

	private static Vendedor searchSeller() {
		System.out.println("Selecionar um vendedor por ID");
		int idSelectedSeller = entry.nextInt();

		Vendedor vendedorSelected = null;

		if (idSelectedSeller >= 0 && idSelectedSeller <= sellerList.size()) {
			vendedorSelected = sellerList.get(idSelectedSeller - 1);
		} else {
			System.out.println("Não existe esse vendedor\n");
			searchSeller();
		}

		return vendedorSelected;
	}

	private static Produto searchProduct() {
		int idSelectedProduct = entry.nextInt();

		Produto produtoSelected = null;

		if (idSelectedProduct >= 0 && idSelectedProduct <= productList.size()) {
			produtoSelected = productList.get(idSelectedProduct - 1);
		} else {
			System.out.println("Não existe esse Produto\n");
			searchProduct();
		}

		return produtoSelected;
	}

	public static void theSeller() {
		idvendedor++;
		int idVendedor = idvendedor;

		System.out.println("Nome do vendedor: ");
		String nomeSeller = entry.nextLine();

		Vendedor vendedor = new Vendedor(idVendedor, nomeSeller);

		vendedor.showInfo();

		System.out.println("Vendedor cadastrado com sucesso\n");

		sellerList.add(vendedor);

		System.out.println("Escolha no menu");
		System.out.println(
				"1: Deletar um vendedor \n2: Para editar um vendedor\n3: Criar um novo vendedor\n4: Voltar para o menu");
		boolean ancoraCliente = false;
		while (!ancoraCliente) {
			String switchCase = entry.nextLine();
			switch (switchCase) {
			case "1":
				System.out.println("Para deletar um vendedor digite a id do mesmo: ");
				int idRemover = entry.nextInt();
				if (idRemover >= 0 && idRemover <= sellerList.size()) {
					sellerList.remove(idRemover - 1);
					System.out.println("Sucesso!");
					menu();
				} else {
					System.out.println("Não existe esse vendedor para deletar\n");
				}
				ancoraCliente = true;
				System.out.println(sellerList.size());

				break;
			case "2":
				System.out.println("Digite a ID do vendedor para editar");
				int idEditora = entry.nextInt();
				if (idEditora >= 0 && idEditora <= sellerList.size()) {
					System.out.println("Escolha no menu");
					System.out.println("1: Editar o nome do vendedor \n");
					int switchSeller = entry.nextInt();
					switch (switchSeller) {
					case 1:
						System.out.printf("Editar Nome do vendedor %s para: ", nomeSeller);
						String newName = entry.next();
						if (nomeSeller != newName) {
							nomeSeller = newName;
							System.out.printf("Vendedor com id %d teve nome alterado para %s", idVendedor, nomeSeller);
							menu();
						} else {
							System.out.println("Mesmo nome do vendedor garoto!");
							theSeller();
						}
						break;
					}
				}
				break;
			case "3":
				theSeller();
				break;
			case "4":
				menu();
				break;
			}
		}

		menu();
	}

	public static void theProduct() {
		idproduto++;
		int idProduto = idproduto;

		System.out.println("Nome do produto: ");
		String nameProduto = entry.nextLine();

		System.out.println("Tipo de produto: ");
		String typeProduto = entry.nextLine();

		System.out.println("Modelo do produto: ");
		String modelProduto = entry.nextLine();

		System.out.println("Preço do produto: ");
		Double priceProduto = entry.nextDouble();

		Produto produto = new Produto(idProduto, nameProduto, typeProduto, modelProduto, priceProduto);

		produto.showInfo();

		System.out.println("Produto cadastrado com sucesso\n");

		productList.add(produto);

		System.out.println("Escolha no menu");
		System.out.println(
				"1: Deletar um produto \n2: Para editar um produto\n3: Criar um novo produto\n4: Voltar para o menu");
		boolean ancoraCliente = false;
		while (!ancoraCliente) {
			String switchCase = entry.nextLine();
			switch (switchCase) {
			case "1":
				System.out.println("Para deletar um produto digite a id do mesmo: ");
				int idRemover = entry.nextInt();
				if (idRemover >= 0 && idRemover <= productList.size()) {
					productList.remove(idRemover - 1);
					System.out.println("Sucesso!");
					menu();
				} else {
					System.out.println("Não existe esse produto para deletar\n");
				}
				ancoraCliente = true;
				System.out.println(clientList.size());
				break;

			case "2":
				System.out.println("Digite a ID do produto para editar");
				int idEditora = entry.nextInt();
				if (idEditora >= 0 && idEditora <= productList.size()) {
					System.out.println("Escolha no menu");
					System.out.println(
							"1: Editar o nome do produto \n2: para alterar o tipo do produto\n3: para alterar modelo do produto\n4: Para alterar preço do produto\n");
					int switchProduct = entry.nextInt();
					switch (switchProduct) {
					case 1:
						System.out.printf("Editar Nome do produto %s para: ", nameProduto);
						String newName = entry.next();
						if (nameProduto != newName) {
							nameProduto = newName;
							System.out.printf("Produto com id %d teve nome alterado para %s", idProduto, nameProduto);
							menu();
						} else {
							System.out.println("Mesmo nome do produto garoto!");
							theProduct();
						}
						break;
					case 2:
						System.out.printf("Editar tipo do produto %s para: ", typeProduto);
						String newType = entry.next();
						if (typeProduto != newType) {
							typeProduto = newType;
							System.out.printf("Produto com id %d foi alterado seu tipo para %s", idProduto,
									typeProduto);
							menu();
						} else {
							System.out.println("Mesmo tipo de produto garoto!");
							theProduct();
						}
						break;
					case 3:
						System.out.printf("Editar modelo do produto %s para: ", modelProduto);
						String newProduct = entry.next();
						if (modelProduto != newProduct) {
							modelProduto = newProduct;
							System.out.printf("Produto com id %d teve seu modelo alterado para: ", idProduto,
									modelProduto);
							menu();
						} else {
							System.out.println("Mesmo modelo de produto garoto!");
							theProduct();
						}
						break;
					case 4:
						System.out.printf("Editar preço do produto %s para:  ", money_formatter.format(priceProduto));
						Double newPrice = entry.nextDouble();
						if (priceProduto != newPrice) {
							priceProduto = newPrice;
							System.out.printf("Produto com id %d teve seu preço alterado para %d", idProduto,
									money_formatter.format(priceProduto));
							menu();
						} else {
							System.out.println("Mesmo preço garoto!");
							theProduct();
						}
						break;
					}

				}

				break;
			case "3":
				theProduct();
				break;
			case "4":
				menu();
				break;
			}
		}

	}

	public static void theClient() {
		idcliente++;
		int idCliente = idcliente;

		System.out.println("Nome: ");
		String nameCliente = entry.nextLine();

		System.out.println("CPF: ");
		String cpfCliente = entry.nextLine();

		System.out.println("Telefone: ");
		String telCliente = entry.nextLine();

		System.out.println("Enderço: ");
		String adressCliente = entry.nextLine();

		Cliente clientes = new Cliente(idCliente, nameCliente, cpfCliente, telCliente, adressCliente);

		clientes.showInfo();

		System.out.println("Finalizado \n");

		clientList.add(clientes);

		System.out.println("Escolha no menu");
		System.out.println(
				"1: Deletar um cliente \n2: Para editar um cliente\n3: Criar um novo cliente\n4: Voltar para o menu");
		boolean ancoraCliente = false;
		while (!ancoraCliente) {
			String switchCase = entry.nextLine();
			switch (switchCase) {
			case "1":

				System.out.println("Para deletar um cliente digite a id do mesmo: ");
				int idRemover = entry.nextInt();
				if (idRemover >= 0 && idRemover <= clientList.size()) {
					clientList.remove(idRemover - 1);
					System.out.println("Sucesso!");
				} else {
					System.out.println("Não existe Cliente para deletar\n");
				}
				ancoraCliente = true;
				System.out.println(clientList.size());
				break;

			case "2":

				System.out.println("Digite a ID do cliente para edita-lo");
				int idEditora = entry.nextInt();
				if (idEditora >= 0 && idEditora <= clientList.size()) {
					System.out.println("Escolha no menu");
					System.out.println(
							"1: Editar o nome \n2: para alterar CPF\n3: para alterar Telefone\n4: Para alterar endereço do cliente");
					int switchUser = entry.nextInt();
					switch (switchUser) {
					case 1:
						System.out.printf("Editar Nome do cliente %s para: ", nameCliente);
						String newName = entry.next();
						if (nameCliente != newName) {
							nameCliente = newName;
							System.out.printf("Cliente com id %d alterou seu nome para %s", idCliente, nameCliente);
						} else {
							System.out.println("Mesmo nome, garoto!");
						}
						break;
					case 2:
						System.out.printf("Editar CPF do cliente %s para: ", cpfCliente);
						String newCPF = entry.nextLine();
						if (cpfCliente != newCPF) {
							cpfCliente = newCPF;
							System.out.printf("Cliente com id %d alterou seu CPF para %s", idCliente, cpfCliente);
						} else {
							System.out.println("Mesmo CPF, garoto!");
						}
						break;
					case 3:
						System.out.printf("Editar telefone do cliente %s para: ", nameCliente);
						String newTel = entry.next();
						if (telCliente != newTel) {
							String oldTel = telCliente;
							telCliente = newTel;
							System.out.printf("Cliente com id %d alterou seu numero antigo %s para novo número %s",
									idCliente, oldTel, telCliente);
						} else {
							System.out.println("Mesmo telefone, garoto!");
						}
						break;
					case 4:
						System.out.printf("Editar Endereço do cliente %s para:  ", nameCliente);
						String newAdress = entry.next();
						if (adressCliente != newAdress) {
							adressCliente = newAdress;
							System.out.printf("Cliente com id %d alterou seu endereço para %s", idCliente,
									adressCliente);
						} else {
							System.out.println("Mesmo endereço, garoto!");
						}
						break;
					}

				}

				break;
			case "3":
				theClient();
				break;
			case "4":
				menu();
				break;
			}
		}
		menu();
	}

	public static void menu() {
		System.out.println("Escolha no menu");
		System.out.println(
				"1: Cadastrar um produtos \n2: Cadastrar um Cliente  \n3: Cadastrar um Vendedor \n4: Realizar um Orçamento (não necessita ter uma conta)\n5: Sair");
		boolean ancora = false;
		while (!ancora) {
			String switchCase = entry.nextLine();
			switch (switchCase) {
			case "1":
				System.out.println("Cadastrar um Produto: ");
				theProduct();
				ancora = true;
				break;
			case "2":
				System.out.println("Cadastrar um Cliente");
				theClient();
				ancora = true;
				break;
			case "3":
				System.out.println("Cadastrar um Vendedor: ");
				theSeller();
				ancora = true;
				break;
			case "4":
				System.out.println("Realizar um Orçamento: ");
				theBudget();
				ancora = true;
				break;
			case "5":
				System.out.println("Saiu");
				ancora = true;
				break;
			}
		}

	}

}
