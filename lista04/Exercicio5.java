package br.fag.edu.lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio5 {
	public static int matriz[][] = new int[4][4];
	public static Random random = new Random();
	public static DecimalFormat formatador = new DecimalFormat("00");

	public static void main(String[] args) {
		doTheMatriz();
	}

	private static void doTheMatriz() {
		for(int L=0; L< matriz.length; L++) {
			for(int C=0; C< matriz.length; C++) {
				matriz[L][C] = (L+1)*(C+1);
				System.out.printf("%s  ", formatador.format(matriz[L][C]));
			}
			System.out.printf("\n");
		}
	}
}