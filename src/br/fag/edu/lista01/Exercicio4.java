package br.fag.edu.lista01;

import java.util.Scanner;

public class Exercicio4 {
	private static int val1, val2, math;
	public static void main(String[] args) {
		AskInfo();
		DoTheMath();
		PrintAwnsers(math);
	}
	private static void PrintAwnsers(int mat) {
		if (math>=70) {
			System.out.println("sua nota: "+math+", você foi aprovado" );
		} else { 
			System.out.println("sua nota: "+math+", você não foi aprovado" );
		}
	}
	private static void AskInfo() {
		Scanner entry = new Scanner (System.in);
		System.out.println("Sua primeira nota porfavore");
		val1 = entry.nextInt();
		System.out.println("Sua segunda nota porfavore");
		val2 = entry.nextInt();
	}
	private static void DoTheMath() {
		math = ((val1 + val2) / 2);
	}
}