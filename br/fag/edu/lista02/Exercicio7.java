package br.fag.edu.lista02;

import java.util.Scanner;

public class Exercicio7 {
	public static Scanner entry = new Scanner (System.in);
	
	public static void main(String[] args) {
		AskInfo();
	}

	private static void AskInfo() {
		System.out.println("Digite um número");
		int var1 = entry.nextInt();
		if( var1 >=12 || var1 <=20) {
			System.out.println("Está entre 12 e 20 :"+var1);
		} 
		while(var1 < 12 || var1 > 20) {
			System.out.println("Errou o número, "+var1+" não está na condição entre 12 ou 20");
			var1 = entry.nextInt();
		}
	}
}