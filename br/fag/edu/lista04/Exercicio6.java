package br.fag.edu.lista04;

import java.util.Random;

public class Exercicio6 {
	
	public static int matriz[][] = new int[3][3];
	public static int matriz1[] = new int[3];
	public static int soma;
	public static Random random = new Random();

	public static void main(String[] args) {
		doTheMatriz();
	}

	private static void doTheMatriz() {
		for (int L = 0; L < matriz.length; L++){
			for (int C = 0; C < matriz[0].length; C++){
				matriz[L][C] = random.nextInt(8)+1;
				System.out.printf("%d  ",matriz[L][C]);
			}System.out.printf("\n");
		}
		System.out.printf("\n");
		System.out.println("Os números acima da diagonal( \\ ) principal: ");
		matriz1[0] = matriz[0][1];
		System.out.printf("%d  ",matriz1[0]);
		matriz1[1] = matriz[0][2];
		System.out.printf("%d  ",matriz1[1]);
		matriz1[2] = matriz[1][2];
		System.out.printf("%d  ",matriz1[2]);
		System.out.printf("\n");
		System.out.printf("\n");
		for (int l = 0; l < matriz1.length; l++) {
			soma += matriz1[l];
		}
		System.out.printf("A Soma dos números acima da diagonal principal: %d",soma);
		System.out.printf("\n");
	}
}