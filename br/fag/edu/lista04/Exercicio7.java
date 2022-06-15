package br.fag.edu.lista04;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio7 {
	public static String bingo[][] = new String [5][5];
	public static int raffle[] = new int [25];
	public static Random random = new Random();
	public static DecimalFormat formatador = new DecimalFormat("00");

	public static void main (String[] args) {
		doTheRaffle();
		theBingo();
	}

	static void doTheRaffle() {
		System.out.println("Números sorteados: ");
		for(int i =0 ; i < raffle.length; i++){
			boolean y = false;
			while(y == false){
			int j = -1;
			int x = random.nextInt(99);
			while(j < i){
				if (raffle[j+1] == x){
				break;
				}
				j++;
				if (j == i){
					raffle[i] = x;
				y = true;
				}
			}
			}
		System.out.printf("%s ", formatador.format(raffle[i]));
		}
	}

	static void theBingo() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bingo");
		int n = -1;
		for (int L = 0; L < bingo.length; L++){
			for (int C = 0; C < bingo.length;C++){
			n++;
			bingo[L][C] = formatador.format(raffle[n]);
			System.out.printf("%s  ", bingo[L][C]);
			}
		System.out.printf("\n");
		}
	}
}