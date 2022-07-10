package br.fag.edu.lista08;

import java.util.Random;

public class exercicio2 {

	private static int num[] = new int[100];

	public static void main(String[] args) {
		getInfo();
		int smallest = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < num.length; i++) {
			if (smallest > num[i]) {
				smallest = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == smallest) {
				index = i;
				break;
			}
		}
		System.out.println("Index of " + smallest + " is : " + index);

	}

	private static int getQuick(int[] num, int k, int left, int right) {
		int pivo = pegPivo(num, left, right);
		if (pivo == k - 1) {
			return num[pivo];
		}
		if (k - 1 < pivo) {
			return getQuick(num, k, left, pivo - 1);
		} else {
			return getQuick(num, k, pivo + 1, right);
		}
	}

	private static int pegPivo(int[] num, int left, int right) {

		int pivo = num[(left + right) / 2];
		while (left < right) {
			while (num[left] < pivo) {
				left++;
			}
			while (num[right] > pivo) {
				right--;
			}

			if (left <= right) {
				troca(num, left, right);
				left++;
				right--;
			}

		}
		return left;
	}

	private static void troca(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
	// AQUI ELE GERA OS 100 NÚMEROS ALEATÓRIOS;

	private static void getInfo() {
		Random random = new Random();
		System.out.println("Números da aleatóriedades: ");
		for (int count = 0; count < num.length; count++) {
			num[count] = random.nextInt(100);
			System.out.print(num[count] + ", ");

		}
		System.out.println(" ");
		System.out.println(" ");

	}
}