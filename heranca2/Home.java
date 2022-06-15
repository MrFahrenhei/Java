package br.fag.edu.heranca2;

import java.util.Scanner;

public class Home {
	
	public static Scanner entry = new Scanner(System.in);

	public static void main(String[] args) {
		Animal cao = new Cachorro("Caochorro Caramelo Brazilienses", 9.0, "Caramelus Brazilienses", "Caramelo");

		Animal nemo = new Peixe("Pai do nemo", 1.0, "Aquático de água salgada");
		
		System.out.println(cao);
		Cachorro.latir();
		Cachorro.abanar();
		System.out.println("\n");
		System.out.println(nemo);
		
	}

}