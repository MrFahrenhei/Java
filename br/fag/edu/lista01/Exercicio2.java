package br.fag.edu.lista01;

import java.util.Scanner;

public class Exercicio2 {
	private static int val1;
	public static void main(String[] args) {
		AskInfo();
		PrintAwnsers(val1);
	}
	private static void PrintAwnsers(int val1) {
		if (val1>0) {
			System.out.println(val1 + " Ele é positivo");
		} else { 
			System.out.println(val1 + " Ele é negativo");
		}
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("TA MOSCANDO CARAMELO? DIGITA UM NUMERO AI, PLEASE ");
		val1 = entry.nextInt();
	}
}