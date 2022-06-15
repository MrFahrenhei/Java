package br.fag.edu.lista01;

import java.util.Scanner;

public class Exercicio6 {
	private static int val1, val2;
	public static void main(String[] args) {
		AskInfo();
		PrintAwnsers();
	}
	private static void PrintAwnsers() {
		if (val1>val2) {
			System.out.println(val1+" e "+val2);
		} else { 
			System.out.println(val2+" e "+val1);
		}
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("Pensa num número ae");
		val1 = entry.nextInt();
		System.out.println("Pensa notro");
		val2 = entry.nextInt();
	}
}