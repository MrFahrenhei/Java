package br.fag.edu.orderedList;

import java.util.Random;

public class Exercicio1{

	private static int num[] = new int[10];

	public static void main(String[] args) {
		sortNumber();
		SortVector();
		showInfo();
	}

	private static void SortVector() {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

	}

	private static void putVector(int randomNumber, int posicao) {
			num[posicao] = randomNumber;;
	}

	private static void sortNumber() {
		Random random = new Random();
		for (int count = 0; count < 10; count++) {
			putVector(random.nextInt(100), count);
		}

	}

	private static void showInfo() {

		System.out.print("Elementos de uma array ordenada: ");
		for (int i = 0; i < num.length - 1; i++) {
			System.out.println(num[i]);
		}
		
	}
}