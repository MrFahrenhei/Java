package br.fag.edu.lista04;

import java.util.Random;

public class Exercicio3 {
	
	public static int bigger,aux;
	public static int vec1[] = new int[10];
	public static Random random = new Random();
	
	public static void main(String[] args) {
		doTheMath();
	}
	private static void doTheMath() {
	for (int i = 0; i < vec1.length; i++) {
		vec1[i] = random.nextInt(10);
		System.out.println(vec1[i]);
	}
	bigger = vec1[0];
	for (int i = 0; i < 10; i++) {
		if (vec1[i] > bigger) {
			bigger = vec1[i];
			aux = i;
		}
	}
	System.out.printf("o maior n�mero � %d e est� na posi��o %d", bigger, aux);
}
}