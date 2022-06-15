package br.fag.edu.lista02;

public class Exercicio2 {
	int i;
	public static void main(String[] args) {
		ShowInfo();
	}

	private static void ShowInfo() {
		for (int i = 1; i < 100; i++) {
			if ( i % 2 == 0 ) {
				System.out.println(i);
			}
		}
	}
	

}