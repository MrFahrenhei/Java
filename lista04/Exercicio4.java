package br.fag.edu.lista04;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio4 {
	
	public static double val1;
	public static String vec1[] = new String[5];
	public static Random random = new Random();
	public static DecimalFormat formatterD = new DecimalFormat("0.000");
	
	public static void main(String[] args) {
		doTheMath();
	}

	private static void doTheMath() {
		Scanner entry = new Scanner (System.in);
		System.out.println("Digite o código (0, 1, ou 2): ");
		val1 = entry.nextDouble();	
				if (val1 == 0) {
					System.out.println("Código finalizado");
				}
				if (val1 == 1) {
					for (int i = 0; i < 5; i++) {
						vec1[i] = formatterD.format(random.nextDouble());
						System.out.println(vec1[i]);
					}				
				}else if (val1 == 2) {
					for(int i = 4; i > -1; i--) {
					vec1[i] = formatterD.format(random.nextDouble());
					System.out.println(vec1[i]);
				}
			}
}
}