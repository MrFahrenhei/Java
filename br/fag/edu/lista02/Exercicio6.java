package br.fag.edu.lista02;

import java.util.Scanner;

public class Exercicio6 {
	public static int in = 0, out = 0;
	public static Scanner entry = new Scanner (System.in);
	
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			AskInfo();
		}
		ShowInfo();
	}
	private static void ShowInfo() {
		System.out.println("s�o "+in+" n�mero entre 10 e 20");
		System.out.println("s�o "+out+" n�meros que est�o antes de 10 ou depois do 20: ");
	}

	private static void AskInfo() {
		System.out.println("Digite um n�mero");
		int var1 = entry.nextInt();
		if ( var1 >=10 && var1 <=20) {
			in++;
		} else {
			out++;
		}
	}
}