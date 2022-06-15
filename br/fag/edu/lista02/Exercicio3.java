package br.fag.edu.lista02;

import java.util.Scanner;

public class Exercicio3 {
	public static int val;
	public static void main(String[] args) {
		AskInfo();
		CalculateInfo();
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("Digite o número de 1 a 10, e mostrarei a tabuada");
		val = entry.nextInt();
	}
	private static void CalculateInfo() {
		int i = 1;
		while (i <=10) {
			System.out.printf("%d * %d = %d \n", val, i, val * i);
            i++;
		}
		
	}
}