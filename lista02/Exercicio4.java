package br.fag.edu.lista02;

import java.util.Scanner;

public class Exercicio4 {
	public static int idade;
	public static int quant = 1;
	public static Scanner entry = new Scanner (System.in);
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			AskInfo();
		}
		CalculateInfo();
	}
	private static void CalculateInfo() {
		int media = idade / 10;
		System.out.println(idade);
		System.out.println("media "+ media);
		
	}
	private static void AskInfo() {
		System.out.println("Idade");
		int val1 = entry.nextInt();
		idade += val1;
		quant++;
	}
}