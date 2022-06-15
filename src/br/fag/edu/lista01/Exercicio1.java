package br.fag.edu.lista01;

import java.util.Scanner;

public class Exercicio1 {
	private static int val1, mat;
	public static void main(String[] args) {
		AskInfo();
		PrintAwnsers(mat);
	}
	private static void PrintAwnsers(int mat) {
		//mat = (val1>10) ? val1 : 10;
		if (val1>10) {
			System.out.println(val1 + " Ele é maior que 10 caramelo");
		} else { 
			System.out.println(val1 + " Ele não é maior que 10");
		}
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("TA MOSCANDO CARAMELO? DIGITA UM NUMERO AI, PLEASE ");
		val1 = entry.nextInt();
	}
}