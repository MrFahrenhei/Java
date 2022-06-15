package br.fag.edu.lista01;

import java.util.Scanner;

public class Exercicio7 {
	private static int hora1, hora2, hours;
	public static void main(String[] args) {
		AskInfo();
		CalcHours();
		PrintAwnsers();
	}
	private static void PrintAwnsers() {
		System.out.println("o jogo durou total de:"+hours+" horas");
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("Começa quando?");
		hora1 = entry.nextInt();
		System.out.println("Terminou quando?");
		hora2 = entry.nextInt();
	}
	private static void CalcHours() {
		hours = (hora2-hora1);
	}	//alt + shift + r;
}