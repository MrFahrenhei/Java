package br.fag.edu.lista09;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//pilha chocolate, fila cliente, lista produto;

public class exercicio9 {

	private static Scanner scan = new Scanner(System.in);
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	private static ArrayList<Produtos> lista = new ArrayList<Produtos>();
	private static Queue<Clientes> fila = new LinkedList<Clientes>();
	private static Stack<Estoque> pilha = new Stack<Estoque>();

	private static boolean finalzar = true;
	private static double somar = 0.00;
	private static String nome = "";

	public static void main(String[] args) {
		showMenu();
		Cardapio();
		Pilha();
		Inicio();
	}
	
	private static void showMenu() {
		System.out.println("Bem-vindo \n1. Hamburguer ($2.00) \n2. Batata frita ($1.50)\n3. Refrigerante ($1.00) \n4. X-salada ($1.50) \n5. Picanha ($4.00) "
				+ " \n6. Chocolate ($5.00)");
	}
	
	private static void Fila() {
		Clientes clientes = new Clientes();
		clientes.setId(fila.size() + 1);
		clientes.setDescricao(nome);
		clientes.setPrice(somar);
		fila.add(clientes);
		System.out.println(" ");
	}

	private static void Pilha() {
		Estoque estoque = new Estoque();
		for (int index = 0; index < 10; index++) {
			estoque = new Estoque();
			estoque.setEstoque(1);
			pilha.push(estoque);
		}System.out.println(" ");
	}

	private static void Cardapio() {
		Produtos produto = new Produtos();

		produto.setId(1);
		produto.setDescricao("Hamburguer");
		produto.setPrice(2.00);
		lista.add(produto);

		produto = new Produtos();
		produto.setId(2);
		produto.setDescricao("Batata frita");
		produto.setPrice(1.50);
		lista.add(produto);

		produto = new Produtos();
		produto.setId(3);
		produto.setDescricao("Refrigerante");
		produto.setPrice(1.00);
		lista.add(produto);
		
		produto = new Produtos();
		produto.setId(4);
		produto.setDescricao("X-salada");
		produto.setPrice(1.50);
		lista.add(produto);

		produto = new Produtos();
		produto.setId(5);
		produto.setDescricao("Picanha");
		produto.setPrice(4.00);
		lista.add(produto);
		
		produto = new Produtos();
		produto.setId(6);
		produto.setDescricao("Chocolate");
		produto.setPrice(5.00);
		lista.add(produto);
	}

	private static void Ler() {
		System.out.println(" ");
		for (Produtos index : lista) {
			System.out.println(index.getId());
			System.out.println(index.getDescricao());
			System.out.println(formatter.format(index.getPrice()));
			System.out.println(" ");
		}
	}

	private static void Ler1() {
		System.out.println(" ");
		for (Clientes index : fila) {
			System.out.println(index.getId());
			System.out.println(index.getDescricao());
			System.out.println(formatter.format(index.getPrice()));
			System.out.println(" ");
		}
	}

	private static void Mensagen() {
		System.out.println("1 - Fazer um pedido:");
		System.out.println("2 - Ver o Estoque: ");
		System.out.println("3 - Ver os Pedidos: ");
		System.out.println("4 - Finalizar");
	}

	private static void Mensagen1() {
		System.out.println(" ");
		System.out.println("Escolha o produto:");
		System.out.println("0 - Finalizar");
	}

	private static void Mensagen2() {
		System.out.println(" ");
		System.out.println("Digite se nome:");
	}

	private static void Pedido() {

		int valor = scan.nextInt();
		switch (valor) {
		case 1:
			somar += lista.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(lista.get(valor - 1).getDescricao());
			System.out.println(formatter.format(lista.get(valor - 1).getPrice()));
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			Pedido();
			break;

		case 2:
			somar += lista.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(lista.get(valor - 1).getDescricao());
			System.out.println(formatter.format(lista.get(valor - 1).getPrice()));
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			Pedido();
			break;

		case 3:
			somar += lista.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(lista.get(valor - 1).getDescricao());
			System.out.println(formatter.format(lista.get(valor - 1).getPrice()));
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			Pedido();
			break;

		case 4:
			pilha.pop();
			somar += lista.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(lista.get(valor - 1).getDescricao());
			System.out.println(formatter.format(lista.get(valor - 1).getPrice()));
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			Pedido();
			break;
		
		case 5:
			pilha.pop();
			somar += lista.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(lista.get(valor - 1).getDescricao());
			System.out.println(formatter.format(lista.get(valor - 1).getPrice()));
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			Pedido();
			break;
		
		case 6:
			pilha.pop();
			somar += lista.get(valor - 1).getPrice();
			System.out.println(" ");
			System.out.println(lista.get(valor - 1).getDescricao());
			System.out.println(formatter.format(lista.get(valor - 1).getPrice()));
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			Pedido();
			break;

		case 0:
			System.out.println(" ");
			System.out.println("Obrigado por comprar");
			System.out.printf("Total a pagar:  %s", formatter.format(somar));
			System.out.println(" ");
			System.out.println(" ");
			Mensagen();
			break;

		default:
			System.out.println("Valor invalido");
			break;
		}

	}

	private static void Inicio() {

		Mensagen();
		while (finalzar) {
			int valor = scan.nextInt();
			switch (valor) {
			case 1:
				somar = 0.00;
				Mensagen2();
				nome = scan.next();
				Mensagen1();
				Pedido();
				Fila();
				break;

			case 2:
				System.out.println(" ");
				System.out.println("Estoque de Chocolate:");
				System.out.println(pilha.size());
				break;

			case 3:
				if (fila.size() == 0) {
					System.out.println(" ");
					System.out.println("Sem Pedidos");
				} else {Ler1();	}
				break;

			case 4:
				finalzar = false;
				break;

			default:
				System.out.println("Valor invalido");
				break;
			}
		}
	}
}

