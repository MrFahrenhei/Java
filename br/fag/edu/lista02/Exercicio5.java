package br.fag.edu.lista02;

import java.util.Scanner;

public class Exercicio5 {
	public static int par = 0, impar = 0;
	public static Scanner entry = new Scanner (System.in);
	
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			AskInfo();
		}
		ShowInfo();
	}

	private static void ShowInfo() {
		System.out.println("Esses são os números pares: "+ par);
		System.out.println("Esses são os números impares: "+ impar);
	}

	private static void AskInfo() {
		System.out.println("Digite um número");
		int var1 = entry.nextInt();
		if ( var1 % 2 == 0 ) {
			par++;
		} else {
			impar++;
		}
	}
}