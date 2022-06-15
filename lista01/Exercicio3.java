package br.fag.edu.lista01;

import java.util.Scanner;

public class Exercicio3 {
	private static double val1, calc, broken;
	public static void main(String[] args) {
		AskInfo();
		DoTheMath();
		PrintAwnsers(val1);
	}
	private static void PrintAwnsers(double val1) {
		if (val1<12) {
			System.out.println("tudo por R$"+calc+" meu rei");
		} else { 
			System.out.println("vai por R$"+val1+" meu rei");
		}
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("OH MEU REI, quantas maças tu queres camara?");
		val1 = entry.nextDouble();
	}
	private static void DoTheMath() {
		broken = 1.30;
		calc = (val1*broken);
	}
}